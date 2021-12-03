using System;
using System.Collections;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Wandlab_interpreter.Interpreter.Runes
{
    public class RuneEnumerator : IEnumerator<Rune>
    {
        public Rune Current
        {
            get
            {
                if ((_currRune < 0) || (_currRune == _runes.Length))
                    throw new InvalidOperationException();
                return _runes[_currRune];
            }
        }

        object IEnumerator.Current => Current;

        private Rune[] _runes;
        private int _currRune = 0;

        public RuneEnumerator(Rune[] table)
        {
            _currRune = 0;
            _runes = table;
        }

        public void Dispose()
        {
            _runes = null;
        }

        public bool MoveNext()
        {
            if (_currRune >= _runes.Length)
                return false;

            _currRune += 1;
            return true;
        }

        public void Reset()
        {
            _currRune = 0;
        }
    }

    public class RuneTable : IReadOnlyList<Rune>
    {
        public Rune this[int index] => _runes[index];
        public Rune this[int index, int ptrDepth] => ReslovePointer(index, ptrDepth);

        public int Count => throw new NotImplementedException();

        private Rune[] _runes = new Rune[0];

        public IEnumerator<Rune> GetEnumerator()
        {
            return new RuneEnumerator(_runes);
        }

        IEnumerator IEnumerable.GetEnumerator()
        {
            return GetEnumerator();
        }

        private Rune ReslovePointer(int index, int ptrDepth)
        {
            for (int i = 0; i < ptrDepth; i++)
            {
                Rune rune = _runes[i];
                //if (rune)
            }
        }
    }
}
