package main.java;

import java.io.IOException;

import main.jflex.Lexer;
import main.java.Token;

public class Parser2 implements ParserInterface {
    private Lexer lexer;
    private Token actual;
    private String lexemaAct;

    public Parser2(Lexer lexer) {
        this.lexer = lexer;
    }

    public void eat(int claseLexica) {
        if (actual.getClaseLexica() == claseLexica) {
            try {
                lexemaAct = lexer.yytext();
                int token = lexer.yylex();
                this.actual = new Token(token, lexemaAct);
            } catch (IOException ioe) {
                System.err.println("Failed to read next token");
            }
        } else
            System.err.println("Se esperaba el token: " + actual);
    }

    public void error(String msg) {
        System.err.println("ERROR DE SINTAXIS: " + msg + " en la línea " + lexer.getLine());
    }

    public void parse() {
        try {
            lexemaAct = lexer.yytext();
            int token = lexer.yylex();
            this.actual = new Token(token, lexemaAct);
        } catch (IOException ioe) {
            System.err.println("Error: No fue posible obtener el primer token de la entrada.");
            System.exit(1);
        }
        Pr();
        if (actual.getClaseLexica() == 0) //llegamos al EOF sin error
            System.out.println("La cadena es aceptada");
        else
            System.out.println("La cadena no pertenece al lenguaje generado por la gramática");
    }

    public void Pr() { // Pr() = Ds Ss
        Ds();
        Ss();
    }

    public void Ds() { // Ds() = D Ds' | ε
        if (actual.getClaseLexica() == ClaseLexica.INT || actual.getClaseLexica() == ClaseLexica.FLOAT) {
            D();
            Ds_();
        }
    }

    public void Ds_() { // Ds' = D Ds' | ε
        if (actual.getClaseLexica() == ClaseLexica.INT || actual.getClaseLexica() == ClaseLexica.FLOAT) {
            D();
            Ds_();
        }
    }

    public void D() { // D() = T L_V ;
        if (actual.getClaseLexica() == ClaseLexica.INT || actual.getClaseLexica() == ClaseLexica.FLOAT) {
            T();
            L_V();
            eat(ClaseLexica.PYC);
        }
    }

    public void T() { // T() = int | float
        if (actual.getClaseLexica() == ClaseLexica.INT) {
            eat(ClaseLexica.INT);
        } else if (actual.getClaseLexica() == ClaseLexica.FLOAT) {
            eat(ClaseLexica.FLOAT);
        } else {
            error("Se esperaba int o float");
        }
    }

    public void L_V() { // L_V() = id L_V' | ε
        if (actual.getClaseLexica() == ClaseLexica.ID) {
            eat(ClaseLexica.ID);
            L_V_();
        } else {
            error("Se esperaba un identificador");
        }
    }

    public void L_V_() { // L_V' = , id L_V' | ε
        if (actual.getClaseLexica() == ClaseLexica.COMA) {
            eat(ClaseLexica.COMA);
            eat(ClaseLexica.ID);
            L_V_();
        }
    }

    public void Ss() { // Ss() = S Ss' | ε
        if (actual.getClaseLexica() == ClaseLexica.ID || actual.getClaseLexica() == ClaseLexica.IF || actual.getClaseLexica() == ClaseLexica.WHILE) {
            S();
            Ss_();
        }
    }

    public void Ss_() { // Ss' = S Ss' | ε
        if (actual.getClaseLexica() == ClaseLexica.ID || actual.getClaseLexica() == ClaseLexica.IF || actual.getClaseLexica() == ClaseLexica.WHILE) {
            S();
            Ss_();
        }
    }

    public void S() { // S() = id = E ; | if(E) Ss else Ss | while(E) Ss
        if (actual.getClaseLexica() == ClaseLexica.ID) {
            eat(ClaseLexica.ID);
            eat(ClaseLexica.ASIG);
            E();
            eat(ClaseLexica.PYC);
        } else if (actual.getClaseLexica() == ClaseLexica.IF) {
            eat(ClaseLexica.IF);
            eat(ClaseLexica.LPAR);
            E();
            eat(ClaseLexica.RPAR);
            Ss();
            eat(ClaseLexica.ELSE);
            Ss();
        } else if (actual.getClaseLexica() == ClaseLexica.WHILE) {
            eat(ClaseLexica.WHILE);
            eat(ClaseLexica.LPAR);
            E();
            eat(ClaseLexica.RPAR);
            Ss();
        } else {
            error("Se esperaba una sentencia");
        }
    }

    public void E() { // E() = F E'
        F();
        E_();
    }

    public void E_() { // E' = - F E' | ε
        if (actual.getClaseLexica() == ClaseLexica.RESTA) {
            eat(ClaseLexica.RESTA);
            F();
            E_();
        }
    }

    public void F() { // F() = G F'
        G();
        F_();
    }

    public void F_() { // F' = + G F' | ε
        if (actual.getClaseLexica() == ClaseLexica.SUMA) {
            eat(ClaseLexica.SUMA);
            G();
            F_();
        }
    }

    public void G() { // G() = H G'
        H();
        G_();
    }

    public void G_() { // G' = / H G' | ε
        if (actual.getClaseLexica() == ClaseLexica.DIV) {
            eat(ClaseLexica.DIV);
            H();
            G_();
        }
    }

    public void H() { // H() = I H'
        I();
        H_();
    }

    public void H_() { // H' = * I H' | ε
        if (actual.getClaseLexica() == ClaseLexica.MULT) {
            eat(ClaseLexica.MULT);
            I();
            H_();
        }
    }

    public void I() { // I() = ( E ) | id | num
        if (actual.getClaseLexica() == ClaseLexica.LPAR) {
            eat(ClaseLexica.LPAR);
            E();
            eat(ClaseLexica.RPAR);
        } else if (actual.getClaseLexica() == ClaseLexica.ID) {
            eat(ClaseLexica.ID);
        } else if (actual.getClaseLexica() == ClaseLexica.NUM) {
            eat(ClaseLexica.NUM);
        } else {
            error("Se esperaba un identificador, un número o un paréntesis");
        }
    }
}