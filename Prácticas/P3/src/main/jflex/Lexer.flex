package main.jflex;

import main.java.ClaseLexica;
import main.java.Token;

%%

%{

public Token actual;
public int getLine() { return yyline; }

%}

%public
%class Lexer
%standalone
%unicode
%line

espacio=[ \t\n]
num = ([1-9]([0-9])*|0)+(\.[0-9]+)?([eE][+-]?[0-9]+)?
id = [a-zA-Z_][a-zA-Z0-9_]*

%%

{espacio}+ { /* No hacer nada */ }
"int" { System.out.println("Encontramos una palabra reservada"); return ClaseLexica.INT; }
"float" { System.out.println("Encontramos una palabra reservada"); return ClaseLexica.FLOAT; }
"if" { System.out.println("Encontramos una palabra reservada"); return ClaseLexica.IF; }
"else" { System.out.println("Encontramos una palabra reservada"); return ClaseLexica.ELSE; }
"while" { System.out.println("Encontramos una palabra reservada"); return ClaseLexica.WHILE; }
{num} { System.out.println("Encontramos un num"); return ClaseLexica.NUM; }
{id} { System.out.println("Encontramos un id"); return ClaseLexica.ID; }
";" { System.out.println("Encontramos una palabra reservada"); return ClaseLexica.PYC; }
"=" { System.out.println("Encontramos una palabra reservada"); return ClaseLexica.ASIG; }
"+" { System.out.println("Encontramos una palabra reservada"); return ClaseLexica.SUMA; }
"-" { System.out.println("Encontramos una palabra reservada"); return ClaseLexica.RESTA; }
"*" { System.out.println("Encontramos una palabra reservada"); return ClaseLexica.MULT; }
"/" { System.out.println("Encontramos una palabra reservada"); return ClaseLexica.DIV; }
"(" { System.out.println("Encontramos una palabra reservada"); return ClaseLexica.LPAR; }
")" { System.out.println("Encontramos una palabra reservada"); return ClaseLexica.RPAR; }
"," { System.out.println("Encontramos una palabra reservada"); return ClaseLexica.COMA; }
<<EOF>> { return 0; }
. { return -1; }
