using System;
using System.Collections.Generic;
using System.Linq;
using System.Runtime.Serialization;
using System.Text;
using System.Threading.Tasks;

namespace Wandlab_interpreter.Interpreter.ErrorHandling
{
    public class MissingArgumentException : Exception
    {
        public MissingArgumentException()
        {
        }

        public MissingArgumentException(string message) : base(message)
        {
        }

        public MissingArgumentException(string message, Exception innerException) : base(message, innerException)
        {
        }

        protected MissingArgumentException(SerializationInfo info, StreamingContext context) : base(info, context)
        {
        }
    }

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

    public class UnknownSpellException : Exception
    {
        public UnknownSpellException()
        {
        }

        public UnknownSpellException(string message) : base(message)
        {
        }

        public UnknownSpellException(string message, Exception innerException) : base(message, innerException)
        {
        }

        protected UnknownSpellException(SerializationInfo info, StreamingContext context) : base(info, context)
        {
        }
    }

    public class UnknownPreprocessorException : Exception
    {
        public UnknownPreprocessorException()
        {
        }

        public UnknownPreprocessorException(string message) : base(message)
        {
        }

        public UnknownPreprocessorException(string message, Exception innerException) : base(message, innerException)
        {
        }

        protected UnknownPreprocessorException(SerializationInfo info, StreamingContext context) : base(info, context)
        {
        }
    }
}
