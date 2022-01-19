using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using Wandlab_interpreter.Interpreter.Runes;

namespace Wandlab_interpreter.Interpreter
{
    public class ExecutionContext
    {
        public RuneTable runes;
        public ValueType workingDataType;
        public int programCounter;

        public ExecutionContext(int runeTableSize)
        {
            runes = new RuneTable(runeTableSize);
            workingDataType = ValueType.NONE;
            programCounter = 0;
        }
    }
}
