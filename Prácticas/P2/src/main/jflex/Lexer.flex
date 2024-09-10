/**
 * Escáner que detecta el lenguaje C_1
*/

package main.jflex;

import main.java.ClaseLexica;
import main.java.Token;

%%

%{

public Token actual;

%}

%public
%class Lexer
%standalone
%unicode

espacio=[ \t\n]
INT = "int"
FLOAT = "float"
IF = "if"
ELSE = "else"
WHILE = "while"
NUMERO = ([1-9]([0-9])*|0)+(\.[0-9]+)?([eE][+-]?[0-9]+)?
ID = [a-zA-Z_][a-zA-Z0-9_]*
PYC = ";"
COMA = ","
LPAR = "("
RPAR = ")"

%%


{INT} {System.out.println(new Token(ClaseLexica.INT,yytext()));}
{FLOAT} {System.out.println(new Token(ClaseLexica.FLOAT,yytext()));}
{IF} {System.out.println(new Token(ClaseLexica.IF,yytext()));}
{ELSE} {System.out.println(new Token(ClaseLexica.ELSE,yytext()));}
{WHILE} {System.out.println(new Token(ClaseLexica.WHILE,yytext()));}
{NUMERO} {System.out.println(new Token(ClaseLexica.NUMERO,yytext()));}
{ID} {System.out.println(new Token(ClaseLexica.ID,yytext()));}
{PYC} {System.out.println(new Token(ClaseLexica.PYC,yytext()));}
{COMA} {System.out.println(new Token(ClaseLexica.COMA,yytext()));}
{LPAR} {System.out.println(new Token(ClaseLexica.LPAR,yytext()));}
{RPAR} {System.out.println(new Token(ClaseLexica.RPAR,yytext()));}
{espacio} {/* La acción léxica puede ir vacía si queremos que el escáner ignore la regla */}