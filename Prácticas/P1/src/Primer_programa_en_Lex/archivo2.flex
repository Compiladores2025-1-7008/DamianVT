/**
* Escáner que detecta números y palabras
*/

%%

%public
%class Lexer
%standalone
digito=[0-9]
letra=[a-zA-Z]
hexa =[0-9a-fA-F]
p_reservadas=("public"|"private"|"protected"|"static"|"final"|"void"|"int")
identificador = {letra}({letra}|{digito}|_){0,31}
espacio=[ \t\n]
hexadecimal=0[xX]{hexa}+

%%

{espacio}+  { System.out.println("Encontré un espacio: " + yytext()+"\n"); }
{hexadecimal} { System.out.println("Encontré un hexadecimal: " + yytext()+"\n"); }
{digito}+ { System.out.println("Encontré un número: " + yytext()+"\n"); }
{p_reservadas} { System.out.println("Encontré una palabra reservada: " + yytext()+"\n"); }
{identificador} { System.out.println("Encontré un identificador válido: " + yytext()+"\n"); }
{letra}+ { System.out.println("Encontré una palabra: " + yytext()+"\n"); }