/**
* Escáner que detecta números y palabras
*/

%%

%public
%class Lexer
%standalone

digito=[0-9]
letra=[a-zA-Z]
hexadeciaml =[0-9a-fA-F]
palabra={letra}+
identificador = {letra}({letra}|{digito}|_){0,31}
espacio=[ \t\n]

%%

{espacio}+  { System.out.println("Encontré un espacio: " + yytext()+"\n"); }
/* La acción léxica puede ir vacía si queremos que el
escáner ignore la regla */ 
0[xX]{hexadeciaml}+ { System.out.println("Encontré un hexadecimal: " + yytext()+"\n"); }
"public"|"private"|"protected"|"static"|"final" { System.out.println("Encontré una palabra reservada: " + yytext()+"\n"); }
{identificador} { System.out.println("Encontré un identificador válido: " + yytext()+"\n"); }
{digito}+ { System.out.println("Encontré un número: " + yytext()+"\n"); }
{palabra} { System.out.println("Encontré una palabra: " + yytext()+"\n"); }

