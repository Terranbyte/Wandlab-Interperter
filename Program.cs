using Antlr4.Runtime;
using Antlr4.Runtime.Tree;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using Wandlab_interpreter.Interpreter;
using Wandlab_interpreter.Interpreter.Runes;

namespace Wandlab_interpreter
{
    internal class Program
    {
        static void Main(string[] args)
        {
            string program = "Omicorn|0-Omicorn|1-Lambda[Pi|3|->0]^Tau|->1";
            ICharStream charStream = CharStreams.fromString(program);
            ITokenSource tokenSource = new WandlabLexer(charStream);
            ITokenStream tokenStream = new CommonTokenStream(tokenSource);
            WandlabParser wandlabParser = new WandlabParser(tokenStream);
            IParseTree parseTree = wandlabParser.program();
            WandlabInterpreter wandlab = new WandlabInterpreter();
            wandlab.Visit(parseTree);
        }
    }
}
