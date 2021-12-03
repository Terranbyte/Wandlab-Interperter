using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Wandlab_interpreter.Interpreter.Spell
{
    public class MultiValue
    {
        private ValueType _type = ValueType.NONE;
        private int _ptrDepth = 0;
        private object _value;

        public MultiValue(ValueType type, int pointerDepth, object value)
        {
            _type = type;
            _ptrDepth = pointerDepth;
            _value = value;
        }

        public ValueType GetValueType()
        {
            return _type;
        }

        public object GetValue()
        {
            switch (_type)
            {
                case ValueType.NONE:
                    return null;
                case ValueType.STRING:
                    return (string)_value;
                case ValueType.POINTER:
                    break;
            }
        }
    }
}
