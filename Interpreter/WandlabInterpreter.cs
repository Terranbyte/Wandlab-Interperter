using Antlr4.Runtime.Misc;
using Antlr4.Runtime.Tree;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using Wandlab_interpreter.Interpreter.Runes;
using Wandlab_interpreter.Interpreter.Spell;
using static WandlabParser;

namespace Wandlab_interpreter.Interpreter
{
    internal class WandlabInterpreter : WandlabBaseVisitor<object>
    {
        public override object VisitProgram([NotNull] ProgramContext context)
        {
            List<SuperSpell> _program = new List<SuperSpell>();

            foreach (Preprocessor_commandContext command in context.preprocessor_command())
            {
                VisitPreprocessor_command(command);
            }

            foreach (OperationContext operation in context.operation())
            {
                _program.Add((SuperSpell)VisitOperation(operation));
            }

            return _program;
        }

        public override object VisitPreprocessor_command([NotNull] Preprocessor_commandContext context)
        {
            Console.WriteLine(context.GetText());

            foreach (Preprocessor_argContext arg in context.preprocessor_arg())
            {
                VisitPreprocessor_arg(arg);
            }

            return null;
        }

        public override object VisitPreprocessor_arg([NotNull] Preprocessor_argContext context)
        {
            Console.WriteLine(context.GetText());
            return null;
        }

        public override object VisitOperation([NotNull] OperationContext context)
        {
            SuperSpell spell;
            spell = (SuperSpell)VisitOp(context.op());
            SubopContext subop = context.subop();

            if (subop != null && spell != null && !subop.IsEmpty)
            {
                object[] temp = (object[])VisitSubop(subop);
                spell.SetRespell((Respells)temp[0], (MultiValue)temp[1]);
            }

            return spell;
        }

        public override object VisitOp([NotNull] OpContext context)
        {
            string[] opText = context.GetText().Split('|');
            SuperSpell spell = null;
            FunctionContext function = context.function();

            if (function != null)
            {
                if (opText.Contains("Lambda"))
                    spell = new LambdaSpell((List<SuperSpell>)VisitFunction(context.function()));
                else
                    spell = new SigmaSpell((List<SuperSpell>)VisitFunction(context.function()));
                return spell;
            }

            switch (opText[0])
            {
                case "Xi":
                    if (opText.Length > 2)
                        spell = new XiSpell(Convert.ToInt32(opText[1]), new MultiValue(int.TryParse(opText[2], out int res) ? (object)res : (object)opText[2]));
                    else
                        spell = new XiSpell(Convert.ToInt32(opText[1]), MultiValue.NULL);
                    break;
                case "Omicron":
                    spell = new OmicronSpell(MultiValue.Parse(opText[1]));
                    break;
                case "Omega":
                    spell = new OmegaSpell(opText.Length > 1 ? MultiValue.Parse(opText[1]) : MultiValue.NULL);
                    break;
                case "Mu":
                    spell = new MuSpell(MultiValue.Parse(opText[1]), MultiValue.Parse(opText[2]));
                    break;
                case "Pi":
                    spell = new PiSpell(MultiValue.Parse(opText[1]), opText.Length > 2 ? MultiValue.Parse(opText[2]) : MultiValue.NULL);
                    break;
                case "Alpha":
                    spell = new AlphaSpell();
                    break;
                case "Beta":
                    spell = new BetaSpell();
                    break;
                case "Theta":
                    spell = new ThetaSpell();
                    break;
                //case "Lambda":
                //    break;
                //case "Sigma":
                //    break;
                case "Delta":
                    break;
                case "Eta":
                    break;
                case "Zeta":
                    break;
                default:
                    break;
            }

            return spell;
        }

        public override object VisitSubop([NotNull] SubopContext context)
        {
            object[] returnObjects = new object[2];
            Respells respell = Respells.None;
            MultiValue arg = MultiValue.NULL;
            string[] opText = context.GetText().Substring(1).Split('|');

            switch (opText[0])
            {
                case "Gamma":
                    respell = Respells.Gamma;
                    arg = MultiValue.Parse(opText[1]);
                    break;
                case "Chi":
                    respell = Respells.Chi;
                    arg = MultiValue.Parse(opText[1]);
                    break;
                case "Tau":
                    respell = Respells.Tau;
                    arg = MultiValue.Parse(opText[1]);
                    break;
                case "Phi":
                    respell = Respells.Phi;
                    break;
                default:
                    break;
            }

            returnObjects[0] = respell;
            returnObjects[1] = arg;

            return returnObjects;
        }

        public override object VisitFunction([NotNull] FunctionContext context)
        {
            List<SuperSpell> _program = new List<SuperSpell>();

            foreach (OperationContext operation in context.operation())
            {
                _program.Add((SuperSpell)VisitOperation(operation));
            }

            return _program;
        }
    }
}
