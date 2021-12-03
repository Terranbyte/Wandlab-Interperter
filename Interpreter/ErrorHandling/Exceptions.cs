using System;
using System.Collections.Generic;
using System.Linq;
using System.Runtime.Serialization;
using System.Text;
using System.Threading.Tasks;

namespace Wandlab_interpreter.Interpreter.ErrorHandling
{
    public class TypeMixingException : Exception
    {
        public TypeMixingException()
        {
        }

        public TypeMixingException(string message) : base(message)
        {
        }

        public TypeMixingException(string message, Exception innerException) : base(message, innerException)
        {
        }

        protected TypeMixingException(SerializationInfo info, StreamingContext context) : base(info, context)
        {
        }
    }

    public class PointerRecursionException : Exception
    {
        public PointerRecursionException()
        {
        }

        public PointerRecursionException(string message) : base(message)
        {
        }

        public PointerRecursionException(string message, Exception innerException) : base(message, innerException)
        {
        }

        protected PointerRecursionException(SerializationInfo info, StreamingContext context) : base(info, context)
        {
        }
    }
}
