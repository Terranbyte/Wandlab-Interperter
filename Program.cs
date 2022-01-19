using Antlr4.Runtime;
using Antlr4.Runtime.Tree;
using System;
using System.Collections.Generic;
using System.IO;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using Wandlab_interpreter.Interpreter;
using Wandlab_interpreter.Interpreter.Runes;
using Wandlab_interpreter.Interpreter.Spell;

namespace Wandlab_interpreter
{
    internal class Program
    {
        public static bool s_ok = true;

        static void Main(string[] args)
        {
            //string program = "Omicron|0-Omicron|1-Lambda[Pi|3|->0]^Tau|->1";
            string program = "Lambda[Omega^Gamma|\"Hello world! \n\"]^Tau|5";
            ICharStream charStream = CharStreams.fromString(program);
            ITokenSource tokenSource = new WandlabLexer(charStream);
            ITokenStream tokenStream = new CommonTokenStream(tokenSource);
            WandlabParser wandlabParser = new WandlabParser(tokenStream);
            wandlabParser.AddErrorListener(new WandlabErrorListener());
            IParseTree parseTree = wandlabParser.program();
            WandlabInterpreter wandlab = new WandlabInterpreter();
            List<SuperSpell> spellProgram = (List<SuperSpell>)wandlab.Visit(parseTree);

            if (!s_ok)
                return;

            ExecutionContext ctx = new ExecutionContext(1024);

            while (ctx.programCounter >= 0 && ctx.programCounter < spellProgram.Count)
            {
                spellProgram[ctx.programCounter].Execute(ctx);
            }

            Console.ReadLine();
        }
    }

    internal class WandlabErrorListener : IAntlrErrorListener<IToken>
    {
        public void SyntaxError(TextWriter output, IRecognizer recognizer, IToken offendingSymbol, int line, int charPositionInLine, string msg, RecognitionException e)
        {
            output.WriteLine($"Error({line}:{charPositionInLine}): {msg} [{e.Message}]");
            Program.s_ok = false;
        }
    }
}
