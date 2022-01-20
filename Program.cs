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
        public static Random r = new Random();
        public static bool s_ok = true;

        static void Main(string[] args)
        {
            //string program = "Lambda[Omega^Gamma|\"Hello world! \n\"]^Tau|5";
            //string program = "Sigma[Omega^Gamma|1-Omega^Gamma|2-Omega^Gamma|3-Omega^Gamma|4-Omega^Gamma|5]^Tau|10";
            //string program = "Theta-Xi|0^Gamma|2-Xi|1^Gamma|12-Xi|2^Gamma|30-Pi|0|1-Alpha-Omega|2";
            //string program = "Omicron|0-Omicron|1-Lambda[Pi|2|0]^Tau|->1-Beta-Omega|2";
            //string program = "Xi|0^Gamma|1-Omega^Gamma|\"1 \n\"-Delta|0^Phi";
            string program = "Omicron|0-Xi|1^Gamma|1-Eta|0|1-Lambda[Omega|0-Delta|1^Phi]Omega|0";

            ICharStream charStream = CharStreams.fromString(program);
            ITokenSource tokenSource = new WandlabLexer(charStream);
            ITokenStream tokenStream = new CommonTokenStream(tokenSource);
            WandlabParser wandlabParser = new WandlabParser(tokenStream);
            wandlabParser.AddErrorListener(new WandlabErrorListener());
            IParseTree parseTree = wandlabParser.program();
            WandlabInterpreter wandlab = new WandlabInterpreter();
            List<SuperSpell> spellProgram = (List<SuperSpell>)wandlab.Visit(parseTree);

            if (!s_ok)
            {
                Console.ReadLine();
                return;
            }

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
