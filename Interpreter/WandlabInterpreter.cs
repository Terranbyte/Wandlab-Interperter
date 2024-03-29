﻿using Antlr4.Runtime.Misc;
using Antlr4.Runtime.Tree;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using Wandlab_interpreter.Interpreter.ErrorHandling;
using Wandlab_interpreter.Interpreter.Runes;
using Wandlab_interpreter.Interpreter.Spell;
using static WandlabParser;

namespace Wandlab_interpreter.Interpreter
{
    internal class WandlabInterpreter : WandlabBaseVisitor<object>
    {
        private ExecutionContext context = new ExecutionContext(64);

        public override object VisitProgram([NotNull] ProgramContext context)
        {
            object[] returnObjects = new object[2];

            List<SuperSpell> _program = new List<SuperSpell>();

            foreach (Preprocessor_commandContext command in context.preprocessor_command())
            {
                VisitPreprocessor_command(command);
            }

            returnObjects[0] = this.context;

            foreach (OperationContext operation in context.operation())
            {
                _program.Add((SuperSpell)VisitOperation(operation));
            }

            returnObjects[1] = _program;

            return returnObjects;
        }

        public override object VisitPreprocessor_command([NotNull] Preprocessor_commandContext context)
        {
            string preprocessor = context.GetText().Split(':')[0].Substring(1);

            ApplyPreprocessor(preprocessor, context.preprocessor_arg());

            return null;
        }

        public override object VisitPreprocessor_arg([NotNull] Preprocessor_argContext context)
        {
            Console.WriteLine(context.GetText());
            return null;
        }

        public void ApplyPreprocessor(string preprocessor, Preprocessor_argContext[] args)
        {
            switch (preprocessor)
            {
                case "RUNETABLE":
                    context = new ExecutionContext(Convert.ToInt32(args[0].GetText()));
                    break;
                default:
                    throw new UnknownPreprocessorException($"The preprocessor \"{preprocessor}\" is not known");
            }
        }

        public override object VisitOperation([NotNull] OperationContext context)
        {
            SuperSpell spell;
            spell = (SuperSpell)VisitOp(context.op());
            SubopContext[] subops = context.subop();

            foreach (SubopContext subop in subops)
            {
                if (subop != null && spell != null && !subop.IsEmpty)
                {
                    object[] temp = (object[])VisitSubop(subop);
                    spell.SetRespell((Respells)temp[0], (MultiValue)temp[1]);
                }
            }

            return spell;
        }

        public override object VisitOp([NotNull] OpContext context)
        {
            string[] opText = context.GetText().Split('|');
            FunctionContext function = context.function();

            if (function != null)
            {
                if (opText[0].StartsWith("Lambda"))
                    return new LambdaSpell((List<SuperSpell>)VisitFunction(context.function()));
                
                return new SigmaSpell((List<SuperSpell>)VisitFunction(context.function()));
            }

            switch (opText[0])
            {
                case "Xi":
                    return new XiSpell(MultiValue.Parse(opText[1]), opText.Length > 2 ? MultiValue.Parse(opText[2]) : MultiValue.NULL);
                case "Omicron":
                    return new OmicronSpell(MultiValue.Parse(opText[1]));
                case "Omega":
                    return new OmegaSpell(opText.Length > 1 ? MultiValue.Parse(opText[1]) : MultiValue.NULL);
                case "Mu":
                    return new MuSpell(MultiValue.Parse(opText[1]), MultiValue.Parse(opText[2]));
                case "Pi":
                    return new PiSpell(MultiValue.Parse(opText[1]), opText.Length > 2 ? MultiValue.Parse(opText[2]) : MultiValue.NULL);
                case "Alpha":
                    return new AlphaSpell();
                case "Beta":
                    return new BetaSpell();
                case "Theta":
                    return new ThetaSpell();
                //case "Lambda":
                //    break;
                //case "Sigma":
                //    break;
                case "Delta":
                    return new DeltaSpell(opText.Length > 1 ? MultiValue.Parse(opText[1]) : MultiValue.NULL);
                case "Eta":
                    return new EtaSpell(MultiValue.Parse(opText[1]), opText.Length > 2 ? MultiValue.Parse(opText[2]) : MultiValue.NULL);
                case "Zeta":
                    return new ZetaSpell(MultiValue.Parse(opText[1]), opText.Length > 2 ? MultiValue.Parse(opText[2]) : MultiValue.NULL);
                default:
                    break;
            }

            throw new UnknownSpellException($"{opText[0]} is not a known spell");
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
