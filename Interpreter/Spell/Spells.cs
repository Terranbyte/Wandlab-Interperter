using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Wandlab_interpreter.Interpreter.Spell
{
    public abstract class SuperSpell
    {
        Respell respell;
        public abstract void Execute();
    }

    public abstract class Respell
    {

    }

    public class spell : SuperSpell
    {
        public override void Execute()
        {
            throw new NotImplementedException();
        }
    }
}
