using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Wandlab_interpreter.Interpreter
{
    public class ExecutionContext
    {
        public ValueType workingDataType;

        public ExecutionContext CreateNew()
        {
            ExecutionContext ctx = new ExecutionContext();
            int temp = (int)workingDataType;
            ctx.workingDataType = (ValueType)temp;

            return ctx;
        }
    }
}
