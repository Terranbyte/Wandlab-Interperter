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

    public class IllegalRespellException : Exception
    {
        public IllegalRespellException()
        {
        }

        public IllegalRespellException(string message) : base(message)
        {
        }

        public IllegalRespellException(string message, Exception innerException) : base(message, innerException)
        {
        }

        protected IllegalRespellException(SerializationInfo info, StreamingContext context) : base(info, context)
        {
        }
    }

    public class IllegalTypeException : Exception
    {
        public IllegalTypeException()
        {
        }

        public IllegalTypeException(string message) : base(message)
        {
        }

        public IllegalTypeException(string message, Exception innerException) : base(message, innerException)
        {
        }

        protected IllegalTypeException(SerializationInfo info, StreamingContext context) : base(info, context)
        {
        }
    }
}
