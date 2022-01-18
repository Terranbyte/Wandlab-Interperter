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
                spell.SetRespell((Respell)VisitSubop(subop));

            return spell;
        }

        public override object VisitOp([NotNull] OpContext context)
        {
            string[] opText = context.GetText().Split('|');
            SuperSpell spell = null;
            FunctionContext function = context.function();

            if (function != null)
            {
                spell = new LambdaSpell((List<SuperSpell>)VisitFunction(context.function()));
                return spell;
            }

            switch (opText[0])
            {
                case "Xi":
                case "Omicron":
                    spell = new OmicronSpell(Convert.ToInt32(opText[1]));
                    break;
                case "Omega":
                    break;
                case "Mu":
                    break;
                case "Pi":
                    break;
                case "Aplha":
                    break;
                case "Beta":
                    break;
                //case "Lambda":
                //    break;
                case "Sigma":
                    break;
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
            Respell spell = null;
            string[] opText = context.GetText().Split('|');

            switch (opText[0])
            {
                case "Gamma":
                    MultiValue arg = new MultiValue(null);
                    int.TryParse(opText[1], out int argInt);

                    if (opText[1].StartsWith("\""))
                        arg = new MultiValue(ValueType.STRING, opText[1]);
                    else if (opText[1].StartsWith("->"))
                        arg = new MultiValue(ValueType.POINTER, argInt);
                    else
                        arg = new MultiValue(ValueType.NUMBER, argInt);

                    spell = new GammaSpell(arg);
                    break;
                case "Chi":
                    spell = new ChiSpell(Convert.ToInt32(opText[1]));
                    break;
                case "Tau":
                    break;
                case "Phi":
                    break;
                default:
                    break;
            }

            return spell;
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
