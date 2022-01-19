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
            _value = MultiValue.NULL;
        }

        public object GetValue(ValueType typeCast)
        {
            // If there's a type cast, and the types don't match, and one of the types is string
            if (typeCast != ValueType.NONE && 
                typeCast != _value.GetValueType() && 
                ((typeCast | _value.GetValueType()) & ValueType.STRING) == ValueType.STRING)
                throw new TypeMixingException($"Cannot convert type \'{typeCast}\' to type \'{_value.GetValueType()}\'");

            return _value.GetValue();
        }

        public void SetValue(ValueType type, object value)
        {
            _value = new MultiValue(type, value);
        }

        public ValueType GetValueType()
        {
            return _value.GetValueType();
        }
    }
}
