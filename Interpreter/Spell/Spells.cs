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
        protected Respells _respell;
        protected MultiValue _respellArg;

        public virtual void Execute(ExecutionContext ctx)
        {
            switch (_respell)
            {
                case Respells.Gamma:
                    GammaRespell(ctx);
                    break;
                case Respells.Chi:
                    ChiRespell(ctx);
                    break;
                case Respells.Tau:
                    TauRespell(ctx);
                    break;
                case Respells.Phi:
                    PhiRespell(ctx);
                    break;
                case Respells.None:
                default:
                    break;
            }

            ExecuteInternal(ctx);

            ctx.programCounter += 1;
        }

        protected abstract void ExecuteInternal(ExecutionContext ctx);
        
        public void SetRespell(Respells respell)
        {
            _respell = respell;
        }

        public void SetRespell(Respells respell, MultiValue arg)
        {
            _respell = respell;
            _respellArg = arg;
        }

        protected virtual void GammaRespell(ExecutionContext ctx)
        {
            throw new NotImplementedException();
        }

        protected virtual void ChiRespell(ExecutionContext ctx)
        {
            throw new NotImplementedException();
        }

        protected virtual void TauRespell(ExecutionContext ctx)
        {
            int repeats = (int)_respellArg.GetValue();

            switch (_respellArg.GetValueType())
            {
                case ValueType.POINTER:
                    repeats = (int)ctx.runes[(int)_respellArg.GetValue()].GetValue(ValueType.NONE);
                    break;
                case ValueType.NUMBER:
                    break;
                default:
                    throw new IllegalTypeException($"Expected number or pointer in argument, got \"{_respellArg.GetValueType()}\"");
            }

            for (int i = 0; i < repeats - 1; i++)
            {
                ExecuteInternal(ctx);
            }
        }

        protected virtual void PhiRespell(ExecutionContext ctx)
        {
            throw new NotImplementedException();
        }
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
            base.Execute(ctx);
            ctx.workingDataType = ValueType.NONE;
        }

        protected override void ExecuteInternal(ExecutionContext ctx)
        {
            ctx.runes[_rune].SetValue(ctx.workingDataType == ValueType.NONE ? _value.GetValueType() : ctx.workingDataType, _value.GetValue());
        }

        protected override void GammaRespell(ExecutionContext ctx)
        {
            _value = _respellArg;
        }

        protected override void ChiRespell(ExecutionContext ctx)
        {
            Random r = new Random(DateTime.Now.Millisecond);
            _value = new MultiValue(ValueType.NUMBER, r.Next(0, (int)_respellArg.GetValue()));
        }

        protected override void PhiRespell(ExecutionContext ctx)
        {
            throw new IllegalRespellException("Phi cannot be bound to Xi");
        }
    }

    public class OmicronSpell : SuperSpell
    {
        private MultiValue _arg;

        public OmicronSpell(MultiValue arg)
        {
            _arg = arg;
        }

        protected override void ExecuteInternal(ExecutionContext ctx)
        {
            Console.Write("Input: ");
            string input = Console.ReadLine();
            MultiValue v = MultiValue.Parse(input);

            switch (_arg.GetValueType())
            {
                case ValueType.POINTER:
                    ctx.runes[(int)_arg.GetValue()].SetValue(ctx.workingDataType == ValueType.NONE ? v.GetValueType() : ctx.workingDataType, v.GetValue());
                    break;
                case ValueType.NUMBER:
                    ctx.runes[(int)_arg.GetValue(), true].SetValue(ctx.workingDataType == ValueType.NONE ? v.GetValueType() : ctx.workingDataType, v.GetValue());
                    break;
                default:
                    throw new IllegalTypeException($"Expected number or pointer in argument, got \"{_arg.GetValueType()}\"");
            }
        }

        protected override void GammaRespell(ExecutionContext ctx)
        {
            throw new IllegalRespellException("Gamma cannot be bound to Omicron");
        }

        protected override void ChiRespell(ExecutionContext ctx)
        {
            throw new IllegalRespellException("Chi cannot be bound to Omicron");
        }

        protected override void PhiRespell(ExecutionContext ctx)
        {
            throw new IllegalRespellException("Phi cannot be bound to Omicron");
        }
    }

    public class OmegaSpell : SuperSpell
    {
        private MultiValue _arg;

        public OmegaSpell(MultiValue arg)
        {
            _arg = arg;
        }

        public override void Execute(ExecutionContext ctx)
        {
            base.Execute(ctx);
            ctx.workingDataType = ValueType.NONE;
        }

        protected override void ExecuteInternal(ExecutionContext ctx)
        {
            if (_respell.HasFlag(Respells.Gamma) || _respell.HasFlag(Respells.Chi))
            {
                Console.Write(_respellArg.GetValue());
                return;
            }


            switch (_arg.GetValueType())
            {
                case ValueType.POINTER:
                    Console.Write(ctx.runes[(int)_arg.GetValue(), true].GetValue(ctx.workingDataType));
                    break;
                case ValueType.NUMBER:
                    Console.Write(ctx.runes[(int)_arg.GetValue()].GetValue(ctx.workingDataType));
                    break;
                default:
                    throw new IllegalTypeException($"Expected number or pointer in argument, got \"{_arg.GetValueType()}\"");
            }
        }

        protected override void GammaRespell(ExecutionContext ctx)
        {
            _arg = _respellArg;
        }

        protected override void ChiRespell(ExecutionContext ctx)
        {
            Random r = new Random();
            _arg = new MultiValue(ValueType.NUMBER, r.Next(0, (int)_respellArg.GetValue()));
        }

        protected override void PhiRespell(ExecutionContext ctx)
        {
            throw new IllegalRespellException("Phi cannot be bound to Omega");
        }
    }

    public class MuSpell : SuperSpell
    {
        public MultiValue _arg1;
        public MultiValue _arg2;

        public MuSpell(MultiValue arg1, MultiValue arg2)
        {
            _arg1 = arg1;
            _arg2 = arg2;
        }

        protected override void ExecuteInternal(ExecutionContext ctx)
        {
            int arg1 = 0;
            int arg2 = 0;

            switch (_arg1.GetValueType())
            {
                case ValueType.POINTER:
                    arg1 = (int)ctx.runes[(int)_arg1.GetValue(), true].GetValue(ValueType.NONE);
                    break;
                case ValueType.NUMBER:
                    arg1 = (int)ctx.runes[(int)_arg1.GetValue()].GetValue(ValueType.NONE);
                    break;
                default:
                    throw new IllegalTypeException($"Expected number or pointer in argument, got \"{_arg1.GetValueType()}\"");
            }

            switch (_arg2.GetValueType())
            {
                case ValueType.POINTER:
                    arg2 = (int)ctx.runes[(int)_arg2.GetValue(), true].GetValue(ValueType.NONE);
                    break;
                case ValueType.NUMBER:
                    arg2 = (int)ctx.runes[(int)_arg2.GetValue()].GetValue(ValueType.NONE);
                    break;
                default:
                    throw new IllegalTypeException($"Expected number or pointer in argument, got \"{_arg1.GetValueType()}\"");
            }

            Rune temp = ctx.runes[arg1];
            ctx.runes[arg1].SetValue(ctx.runes[arg2].GetValue(ValueType.NONE));
            ctx.runes[arg2].SetValue(temp.GetValue(ValueType.NONE));
        }

        protected override void GammaRespell(ExecutionContext ctx)
        {
            throw new IllegalRespellException("Gamma cannot be bound to Mu");
        }
        
        protected override void ChiRespell(ExecutionContext ctx)
        {
            throw new IllegalRespellException("Chi cannot be bound to Mu");
        }

        protected override void PhiRespell(ExecutionContext ctx)
        {

        }
    }

    public class PiSpell : SuperSpell
    {
        private MultiValue _arg1;
        private MultiValue _arg2;

        public PiSpell(MultiValue arg1, MultiValue arg2)
        {
            _arg1 = arg1;
            _arg2 = arg2;
        }

        public override void Execute(ExecutionContext ctx)
        {
            base.Execute(ctx);
            ctx.workingDataType = ValueType.NONE;
        }

        protected override void ExecuteInternal(ExecutionContext ctx)
        {
            Rune r = null;
            object a = null;
            object b = null;
            ValueType aType = ValueType.NONE;
            ValueType bType = ValueType.NONE;

            switch (_arg1.GetValueType())
            {
                case ValueType.POINTER:
                    r = ctx.runes[(int)_arg1.GetValue(), true];
                    a = r.GetValue(ctx.workingDataType);
                    aType = r.GetValueType();
                    break;
                case ValueType.NUMBER:
                    r = ctx.runes[(int)_arg1.GetValue()];
                    a = r.GetValue(ctx.workingDataType);
                    aType = r.GetValueType();
                    break;
                default:
                    throw new IllegalTypeException($"Expected number or pointer in argument, got \"{_arg1.GetValueType()}\"");
            }

            switch (_arg2.GetValueType())
            {
                case ValueType.NONE:
                    b = _respellArg.GetValue();
                    break;
                case ValueType.POINTER:
                    r = ctx.runes[(int)_arg2.GetValue(), true];
                    b = r.GetValue(ctx.workingDataType);
                    bType = r.GetValueType();
                    break;
                case ValueType.NUMBER:
                    r = ctx.runes[(int)_arg2.GetValue()];
                    b = r.GetValue(ctx.workingDataType);
                    bType = r.GetValueType();
                    break;
                default:
                    throw new IllegalTypeException($"Expected number or pointer in argument, got \"{_arg2.GetValueType()}\"");
            }

            // If the types don't mach and one of them is a string or null
            if (aType != bType &&
                (aType == ValueType.STRING || bType == ValueType.STRING))
                throw new TypeMixingException($"Pi spell cannot be cast on type \"{aType}\" and \"{bType}\"");

            if (bType == ValueType.NONE)
                return;

            switch (aType)
            {
                case ValueType.NONE:
                    ctx.runes[(int)_arg1.GetValue(), true].SetValue(bType, b);
                    break;
                case ValueType.STRING:
                    ctx.runes[(int)_arg1.GetValue(), true].SetValue(ValueType.STRING, _respell.HasFlag(Respells.Phi) ? ((string)a).Replace((string)b, string.Empty) : (string)a + (string)b);
                    break;
                case ValueType.POINTER:
                    ctx.runes[(int)_arg1.GetValue()].SetValue(ValueType.POINTER, _respell.HasFlag(Respells.Phi) ? (int)a - (int)b : (int)a + (int)b);
                    break;
                case ValueType.NUMBER:
                    ctx.runes[(int)_arg1.GetValue()].SetValue(ValueType.NUMBER, _respell.HasFlag(Respells.Phi) ? (int)a - (int)b : (int)a + (int)b);
                    break;
                default:
                    break;
            }
        }

        protected override void GammaRespell(ExecutionContext ctx)
        {
            
        }

        protected override void ChiRespell(ExecutionContext ctx)
        {
            Random r = new Random();
            _respellArg = new MultiValue(ValueType.NUMBER, r.Next(0, (int)_respellArg.GetValue()));
        }

        protected override void PhiRespell(ExecutionContext ctx)
        {

        }
    }

    public class AlphaSpell : SuperSpell
    {
        public override void Execute(ExecutionContext ctx)
        {
            base.Execute(ctx);

            if (_respell.HasFlag(Respells.Phi))
                ctx.workingDataType ^= ValueType.NUMBER;
        }

        protected override void ExecuteInternal(ExecutionContext ctx)
        {
            ctx.workingDataType = ValueType.NUMBER;
        }

        protected override void GammaRespell(ExecutionContext ctx)
        {
            throw new IllegalRespellException("Gamma cannot be bound to Alpha");
        }

        protected override void ChiRespell(ExecutionContext ctx)
        {
            throw new IllegalRespellException("Chi cannot be bound to Alpha");
        }

        protected override void PhiRespell(ExecutionContext ctx)
        {

        }
    }

    public class BetaSpell : SuperSpell
    {
        public override void Execute(ExecutionContext ctx)
        {
            base.Execute(ctx);

            if (_respell.HasFlag(Respells.Phi))
                ctx.workingDataType ^= ValueType.STRING;
        }

        protected override void ExecuteInternal(ExecutionContext ctx)
        {
            ctx.workingDataType = ValueType.STRING;
        }

        protected override void GammaRespell(ExecutionContext ctx)
        {
            throw new IllegalRespellException("Gamma cannot be bound to Beta");
        }

        protected override void ChiRespell(ExecutionContext ctx)
        {
            throw new IllegalRespellException("Chi cannot be bound to Beta");
        }

        protected override void PhiRespell(ExecutionContext ctx)
        {

        }
    }

    public class ThetaSpell : SuperSpell
    {
        public override void Execute(ExecutionContext ctx)
        {
            base.Execute(ctx);

            if (_respell.HasFlag(Respells.Phi))
                ctx.workingDataType ^= ValueType.POINTER;
        }

        protected override void ExecuteInternal(ExecutionContext ctx)
        {
            ctx.workingDataType = ValueType.POINTER;
        }

        protected override void GammaRespell(ExecutionContext ctx)
        {
            throw new IllegalRespellException("Gamma cannot be bound to Theta");
        }

        protected override void ChiRespell(ExecutionContext ctx)
        {
            throw new IllegalRespellException("Chi cannot be bound to Theta");
        }

        protected override void PhiRespell(ExecutionContext ctx)
        {

        }
    }

    public class LambdaSpell : SuperSpell
    {
        private List<SuperSpell> _body;

        public LambdaSpell(List<SuperSpell> body)
        {
            _body = body;
        }

        protected override void ExecuteInternal(ExecutionContext ctx)
        {
            int pc = ctx.programCounter;

            foreach (SuperSpell spell in _body)
            {
                spell.Execute(ctx);
            }

            ctx.programCounter = pc;
        }

        protected override void GammaRespell(ExecutionContext ctx)
        {
            throw new IllegalRespellException("Gamma cannot be bound to Lambda");
        }

        protected override void ChiRespell(ExecutionContext ctx)
        {
            throw new IllegalRespellException("Lambda cannot be bound to Lambda");
        }

        protected override void PhiRespell(ExecutionContext ctx)
        {
            throw new IllegalRespellException("Phi cannot be bound to Lambda");
        }
    }

    public class SigmaSpell : SuperSpell
    {
        private List<SuperSpell> _body;

        public SigmaSpell(List<SuperSpell> body)
        {
            _body = body;
        }

        protected override void ExecuteInternal(ExecutionContext ctx)
        {
            int pc = ctx.programCounter;
            Random r = new Random(DateTime.Now.Millisecond);
            int i = r.Next(_body.Count);

            _body[i].Execute(ctx);

            ctx.programCounter = pc;
        }

        protected override void GammaRespell(ExecutionContext ctx)
        {
            throw new IllegalRespellException("Gamma cannot be bound to Lambda");
        }

        protected override void ChiRespell(ExecutionContext ctx)
        {
            throw new IllegalRespellException("Lambda cannot be bound to Lambda");
        }

        protected override void PhiRespell(ExecutionContext ctx)
        {
            throw new IllegalRespellException("Phi cannot be bound to Lambda");
        }
    }

    public class DeltaSpell : SuperSpell
    {
        protected override void ChiRespell(ExecutionContext ctx)
        {
            base.ChiRespell(ctx);
        }

        protected override void ExecuteInternal(ExecutionContext ctx)
        {
            throw new NotImplementedException();
        }

        protected override void GammaRespell(ExecutionContext ctx)
        {
            base.GammaRespell(ctx);
        }

        protected override void PhiRespell(ExecutionContext ctx)
        {
            base.PhiRespell(ctx);
        }
    }
    #endregion
}