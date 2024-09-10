package main.java;

/**
 * Enumeración que representa las clases léxicas del lenguaje C_1.
 */
public enum ClaseLexica {
    INT("int"),
    FLOAT("float"),
    IF("if"),
    ELSE("else"),
    WHILE("while"),
    NUMERO(null),
    ID(null),
    PYC(";"),
    COMA(","),
    LPAR("("),
    RPAR(")");

    private String lexemaUnico;

    private ClaseLexica(String lexemaUnico) {
        this.lexemaUnico = lexemaUnico;
    }

    public String getLexemaUnico() {
        return lexemaUnico;
    }
}