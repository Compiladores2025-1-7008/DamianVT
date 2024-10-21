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
"+" | "-" | "*" | "/" | "^" | "(" | ")" { return yytext().charAt(0); }
{NUM} { yyparser.setYylval(new ParserVal(Double.parseDouble(yytext()))); return Parser.NUM; }
{NL} { return Parser.NL; }
[ \t] { /* ignore white space */ }
\b {System.err.println("Illegal character: "+yytext()); return -1; }
[^] {System.err.println("Illegal character: "+yytext()); return -1; }
