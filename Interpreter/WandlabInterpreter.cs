using Antlr4.Runtime.Misc;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using static WandlabParser;

namespace Wandlab_interpreter.Interpreter
{
    internal class WandlabInterpreter : WandlabBaseVisitor<object>
    {
        public override object VisitProgram([NotNull] ProgramContext context)
        {
            foreach (OperationContext operation in context.operation())
            {
                VisitOperation(operation);
            }

            return null;
        }

        public override object VisitOperation([NotNull] OperationContext context)
        {
            VisitOp(context.op());

            return null;
        }

        public override object VisitOp([NotNull] OpContext context)
        {
            
            return null;
        }

        public override object VisitSubop([NotNull] SubopContext context)
        {
            return null;
        }

        public override object VisitFunction([NotNull] FunctionContext context)
        {
            return null;
        }
    }
}
