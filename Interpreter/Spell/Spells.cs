using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using Wandlab_interpreter.Interpreter.ErrorHandling;
using Wandlab_interpreter.Interpreter.Runes;

namespace Wandlab_interpreter.Interpreter.Spell
{
    public abstract class SuperSpell
    {
        protected Respell _respell;
        public abstract void Execute(ExecutionContext ctx);
        public void SetRespell(Respell respell)
        {
            _respell = respell;
        }
    }

    // Todo: Convert respells to a tag/attribute system for better performance and control
    public abstract class Respell
    { 
        public abstract object Execute(ExecutionContext ctx);
    }

    #region Super spells
    public class XiSpell : SuperSpell
    {
        private int _rune = 0;
        private MultiValue _value;

        public XiSpell(int arg1, MultiValue arg2)
        {
            _rune = arg1;
            _value = arg2;
        }

        public override void Execute(ExecutionContext ctx)
        {
            if (_respell is GammaSpell || _respell is ChiSpell)
                _value = (MultiValue)_respell.Execute(ctx);

            int repeats = 1;

            if (_respell is TauSpell)
                repeats = (int)_respell.Execute(ctx);

            for (int i = 0; i < repeats; i++)
            {
                ctx.runes[_rune].SetValue(_value.GetValueType(), _value.GetValue());
            }

            ctx.programCounter += 1;
        }
    }

    public class OmicronSpell : SuperSpell
    {
        private int _arg;

        public OmicronSpell(int arg)
        {
            _arg = arg;
        }

        public override void Execute(ExecutionContext ctx)
        {
            int repeats = 1;

            if (_respell is TauSpell)
                repeats = (int)_respell.Execute(ctx);

            for (int i = 0; i < repeats; i++)
            {
                Console.Write("Input: ");
                string input = Console.ReadLine();
                int res = 0;

                switch (ctx.workingDataType)
                {
                    case ValueType.NONE:
                    case ValueType.POINTER:
                    case ValueType.NUMBER:
                        if (!int.TryParse(input, out res))
                            throw new FormatException($"Input \"{input}\" couldn't be cast to type \"NUMBER\"");

                        ctx.runes[_arg].SetValue(ValueType.NUMBER, res);
                        ctx.workingDataType = ValueType.NUMBER; // Set in case of workingDataType being ValueType.NONE or ValueType.POINTER
                        break;
                    case ValueType.STRING:
                        ctx.runes[_arg].SetValue(ValueType.STRING, input);
                        break;
                    default:
                        throw new ArgumentOutOfRangeException($"Encountered unexpected working type \"{ctx.workingDataType}\" ({(int)ctx.workingDataType})");
                }
            }

            ctx.programCounter += 1;
        }
    }

    public class OmegaSpell : SuperSpell
    {
        private int _arg;

        public OmegaSpell(int arg)
        {
            _arg = arg;
        }

        public override void Execute(ExecutionContext ctx)
        {
            Rune r = new Rune();

            if (_respell is GammaSpell || _respell is ChiSpell)
            {
                MultiValue temp = (MultiValue)_respell.Execute(ctx);
                r.SetValue(temp.GetValueType(), temp.GetValue());
            }
            else
            {
                r = ctx.runes[_arg];
            }

            int repeats = 1;

            if (_respell is TauSpell)
                repeats = (int)_respell.Execute(ctx);

            for (int i = 0; i < repeats; i++)
            {
                Console.Write(r.GetValue(ctx.workingDataType));
            }

            ctx.workingDataType = ValueType.NONE;
            ctx.programCounter += 1;
        }
    }

    public class LambdaSpell : SuperSpell
    {
        private List<SuperSpell> _lambdaBody;

        public LambdaSpell(List<SuperSpell> body)
        {
            _lambdaBody = body;
        }
        public override void Execute(ExecutionContext ctx)
        {
            int repeats = 1;

            if (_respell is TauSpell)
                repeats = (int)_respell.Execute(ctx);

            for (int i = 0; i < repeats; i++)
            {
                foreach (SuperSpell spell in _lambdaBody)
                {
                    if (spell == null)
                        continue;

                    spell.Execute(ctx);
                }
            }


            ctx.programCounter += 1;
        }
    }

    #endregion

    #region Respells
    public class GammaSpell : Respell
    {
        private MultiValue _arg;

        public GammaSpell(MultiValue arg)
        {
            _arg = arg;
        }

        public override object Execute(ExecutionContext ctx)
        {
            return _arg;
        }
    }

    public class ChiSpell : Respell
    {
        private int _arg;

        public ChiSpell(int arg)
        {
            _arg = arg;
        }

        public override object Execute(ExecutionContext ctx)
        {
            Random r = new Random();
            return new MultiValue(ValueType.NUMBER, r.Next(_arg + 1));
        }
    }

    public class TauSpell : Respell
    {
        private int _arg;

        public TauSpell(int arg)
        {
            _arg = arg;
        }

        public override object Execute(ExecutionContext ctx)
        {
            return _arg;
        }
    }
    #endregion
}