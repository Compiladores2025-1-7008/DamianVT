%{
  import java.lang.Math;
  import java.io.Reader;
  import java.io.IOException;
  import main.jflex.Lexer;
%}

/* YACC Declarations */
%token NUM NL
%left '-' '+'
%left '*' '/'
%left NEG /* negation--unary minus */
%right '^' /* exponentiation */

 /* Grammar follows */
%%
input: /* empty string */
| input line
;

line: NL
| NUM { System.out.println(" " + $1.dval + " "); }
;

exp: NUM { $$ = $1; }
| exp '+' exp { $$ = new ParserVal($1.dval + $3.dval); }
| exp '-' exp { $$ = new ParserVal($1.dval - $3.dval); }
| exp '*' exp { $$ = new ParserVal($1.dval * $3.dval); }
| exp '/' exp { $$ = new ParserVal($1.dval / $3.dval); }
| '-' exp %prec NEG { $$ = new ParserVal(-$2.dval); }
| exp '^' exp { $$ = new ParserVal(Math.pow($1.dval, $3.dval)); }
| '(' exp ')' { $$ = $2; }
;


%%


Lexer scanner;


public Parser(Reader r) {
  this.scanner = new Lexer(r, this);
}

public void setYylval(ParserVal yylval) {
  this.yylval = yylval;
}

public void parse() {
  this.yyparse();
}

void yyerror(String s)
{
  System.out.println("Error sintactico:"+s);
}


int yylex()
{
  int yyl_return = -1;
  try {
    yyl_return = scanner.yylex();
  }
  catch (IOException e) {
    System.err.println("IO error :"+e);
  }
  return yyl_return;
}




