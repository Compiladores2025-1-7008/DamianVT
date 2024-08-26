/**
* Escáner que detecta números y palabras
*/

%%

%public
%class Lexer
%standalone

digito=[0-9]
letra=[a-zA-Z]
palabra={letra}+
espacio=[ \t\n]

%%

{espacio}+  /* La acción léxica puede ir vacía si queremos que el
escáner ignore la regla */ 
{digito}+ { System.out.println("Encontré un número: " + yytext()+"\n"); }
{palabra} { System.out.println("Encontré una palabra: " + yytext()+"\n"); }