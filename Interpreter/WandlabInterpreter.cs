using Antlr4.Runtime.Misc;
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
        private int _indentLevel = 0;

        public override object VisitProgram([NotNull] ProgramContext context)
        {
            List<ISpell> _program = new List<ISpell>();

            foreach (OperationContext operation in context.operation())
            {
                _program.Add((ISpell)VisitOperation(operation));
            }

            return _program;
        }

        public override object VisitOperation([NotNull] OperationContext context)
        {
            ISpell spell;
            spell = (SuperSpell)VisitOp(context.op());
            SubopContext subop = context.subop();

            if (subop != null && spell != null && !subop.IsEmpty)
                ((SuperSpell)spell).SetRespell((Respell)VisitSubop(subop));

            return spell;
        }

        public override object VisitOp([NotNull] OpContext context)
        {
            string[] opText = context.GetText().Split('|');
            SuperSpell spell = null;

            switch (opText[0])
            {
                case "Xi":
                case "Omicorn":
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
                case "Lambda":
                    spell = new LambdaSpell(((List<ISpell>)VisitFunction(context.function())).ToArray());
                    break;
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
            string[] opText = context.GetText().Split('|');

            switch (opText[0])
            {
                case "Gamma":
                case "Chi":
                case "Tau":
                case "Phi":
                default:
                    break;
            }

            Console.Write(context.GetText());
            return null;
        }

        public override object VisitFunction([NotNull] FunctionContext context)
        {
            List<ISpell> _program = new List<ISpell>();

            foreach (OperationContext operation in context.operation())
            {
                _indentLevel += 1;
                _program.Add((ISpell)VisitOperation(operation));
            }
            _indentLevel -= 1;

            return null;
        }
    }
}
