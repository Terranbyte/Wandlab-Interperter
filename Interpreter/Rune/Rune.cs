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
        private int _index;
        private MultiValue _value;

        public Rune(int i)
        {
            _index = i;
            _value = MultiValue.NULL;
        }

        public object GetValue(ValueType typeCast)
        {
            if (typeCast != ValueType.NONE && 
                _value.GetValueType() == ValueType.STRING &&
                typeCast == ValueType.NUMBER)
                throw new TypeMixingException($"Cannot convert type \'{typeCast}\' to type \'{_value.GetValueType()}\'");


            switch (typeCast)
            {
                case ValueType.STRING:
                    return _value.GetValue().ToString();
                case ValueType.POINTER:
                    return _index;
                default:
                    return _value.GetValue();
            }
        }

        public void SetValue(ValueType type, object value)
        {
            _value = new MultiValue(type, value);
        }

        public void SetValue(object value)
        {
            _value = new MultiValue(value);
        }

        public MultiValue GetMultiValue()
        {
            return _value;
        }

        public ValueType GetValueType()
        {
            return _value.GetValueType();
        }
    }
}
