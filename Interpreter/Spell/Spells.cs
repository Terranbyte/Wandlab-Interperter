using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using Wandlab_interpreter.Interpreter.ErrorHandling;
using Wandlab_interpreter.Interpreter.Runes;

namespace Wandlab_interpreter.Interpreter.Spell
{
    public interface ISpell
    {
        void Execute(RuneTable runes, ExecutionContext ctx);
    }

    public abstract class SuperSpell : ISpell
    {
        protected Respell _respell;
        public abstract void Execute(RuneTable runes, ExecutionContext ctx);
        public void SetRespell(Respell respell)
        {
            _respell = respell;
        }
    }

    public abstract class Respell : ISpell
    {
        public abstract void Execute(RuneTable runes, ExecutionContext ctx);
    }

    #region Super spells
    public class OmicronSpell : SuperSpell
    {
        private int _arg;

        public OmicronSpell(int arg)
        {
            _arg = arg;
        }

        public override void Execute(RuneTable runes, ExecutionContext ctx)
        {
            string input = Console.ReadLine();
            int res = 0;

            switch (ctx.workingDataType)
            {
                case ValueType.STRING:
                    runes[_arg].SetValue(ValueType.STRING, input);
                    break;
                case ValueType.POINTER:
                    if (!int.TryParse(input, out res))
                        throw new FormatException($"Input \"{input}\" couldn't be cast to type \"POINTER\"");

                    runes[_arg].SetValue(ValueType.POINTER, res);
                    break;
                case ValueType.NUMBER:
                    if (!int.TryParse(input, out res))
                        throw new FormatException($"Input \"{input}\" couldn't be cast to type \"NUMBER\"");

                    runes[_arg].SetValue(ValueType.NUMBER, res);
                    break;
                default:
                    throw new ArgumentOutOfRangeException($"Encountered unexpected working type \"{ctx.workingDataType}\" ({(int)ctx.workingDataType})");
            }
        }
    }

    public class LambdaSpell : SuperSpell
    {
        private ISpell[] _lambdaBody;

        public LambdaSpell(ISpell[] body)
        {
            _lambdaBody = body;
        }

        public override void Execute(RuneTable runes, ExecutionContext ctx)
        {
            foreach (ISpell spell in _lambdaBody)
            {
                spell.Execute(runes, ctx.CreateNew());
            }
        }
    }

    #endregion

    #region Respells

    #endregion
}