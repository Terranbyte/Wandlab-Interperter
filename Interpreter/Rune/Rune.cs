using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using Wandlab_interpreter.Interpreter.ErrorHandling;
using Wandlab_interpreter.Interpreter.Spell;

namespace Wandlab_interpreter.Interpreter.Runes
{
    public class Rune
    {
        private MultiValue _value;

        public Rune()
        {
            _value = new MultiValue(ValueType.NONE, 0, null);
        }

        private object GetValue(ValueType type)
        {
            if (type != _value.GetValueType() && ((type | _value.GetValueType()) & ValueType.STRING) == ValueType.STRING)
                throw new TypeMixingException($"Trying the get value of type \'{type}\'. Actual type was {_value.GetValueType()}");

            return null;
        }
    }
}
