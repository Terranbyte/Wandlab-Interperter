using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Wandlab_interpreter.Interpreter.Spell
{
    public class MultiValue
    {
        public static readonly MultiValue NULL = new MultiValue(ValueType.NONE, null);

        private ValueType _type = ValueType.NONE;
        private object _value;

        public MultiValue(ValueType type, object value)
        {
            _type = type;
            _value = value;
        }

        public MultiValue(object value)
        {
            if (value is string)
                _type = ValueType.STRING;
            else if (value is int)
                _type = ValueType.NUMBER;
            else if (value == null)
                _type = ValueType.NONE;

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
                case ValueType.NUMBER:
                    return (int)_value;
                default:
                    throw new ArgumentOutOfRangeException($"MultiValue type \'{_type}\' is not a valid type");
            }
        }

        public static MultiValue Parse(string input)
        {
            MultiValue v = new MultiValue(ValueType.STRING, input);

            if (input.StartsWith("\""))
                v = new MultiValue(ValueType.STRING, input.Substring(1, input.Length - 2));
            else if (input.StartsWith("->"))
                v = new MultiValue(ValueType.POINTER, int.Parse(input.Substring(2)));
            else if (int.TryParse(input, out int res))
                v = new MultiValue(ValueType.NUMBER, res);

            return v;
        }
    }
}
