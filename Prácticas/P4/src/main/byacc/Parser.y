%{
  import java.lang.Math;
  import java.io.Reader;
  import java.io.IOException;
  import main.jflex.Lexer;
%}

/* YACC Declarations */
%token NUM NL
%token SUMA RESTA MULT DIV EXP NEG LPAR RPAR
%left RESTA SUMA
%left MULT DIV
%right EXP /* exponentiation */
%left NEG /* negation--unary minus */
%nonassoc LPAR RPAR

 /* Grammar follows */
%%
input: /* empty string */
| input line
;

line: NL
| exp NL { System.out.println(" " + $1.dval + " "); }
;

exp: NUM { $$ = $1; }
| exp SUMA exp { $$ = new ParserVal($1.dval + $3.dval); }
| exp RESTA exp { $$ = new ParserVal($1.dval - $3.dval); }
| exp MULT exp { $$ = new ParserVal($1.dval * $3.dval); }
| exp DIV exp { $$ = new ParserVal($1.dval / $3.dval); }
| RESTA exp %prec NEG { $$ = new ParserVal(-$2.dval); }
| exp EXP exp { $$ = new ParserVal(Math.pow($1.dval, $3.dval)); }
| LPAR exp RPAR { $$ = $2; }
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