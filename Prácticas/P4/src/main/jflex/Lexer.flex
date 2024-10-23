package main.jflex;

import main.byacc.Parser;
import main.byacc.ParserVal;
import java.io.Reader;


%%

%byaccj

%{

private Parser yyparser;

public Lexer(Reader r, Parser yyparser) {
       this(r);
       this.yyparser = yyparser;
}

public int getLine() { return yyline; }

%}

%public
%class Lexer
%standalone
%unicode
%line

NUM=[0-9]+ ("." [0-9]+)?
NL=\n|\r|\r\n


%%
"+" { return Parser.SUMA; }
"-" { return Parser.RESTA; }
"*" { return Parser.MULT; }
"/" { return Parser.DIV; }
"^" { return Parser.EXP; }
"(" { return Parser.LPAR; }
")" { return Parser.RPAR; }
{NUM} { yyparser.setYylval(new ParserVal(Double.parseDouble(yytext()))); return Parser.NUM; }
{NL} { return Parser.NL; }
[ \t] { /* ignore white space */ }
\b {System.err.println("Illegal character: "+yytext()); return -1; }
[^] {System.err.println("Illegal character: "+yytext()); return -1; }
