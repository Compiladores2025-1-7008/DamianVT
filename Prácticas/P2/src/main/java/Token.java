package main.java;

/**
 * Clase que representa un token en el lenguaje C_1.
 */
public class Token {
    private ClaseLexica clase;
    private String lexema;

    public Token(ClaseLexica clase, String lexema) {
        this.clase = clase;
        if(clase.getLexemaUnico() != null && lexema.equals(clase.getLexemaUnico())){
            this.lexema = null;
        } else {
            this.lexema = lexema;
        }
    }

    @Override
    public String toString() {
        if(lexema == null){
            return "<" + this.clase + ">";
        } else {
            return "<" + this.clase + "," + this.lexema + ">";
        }
    }
}