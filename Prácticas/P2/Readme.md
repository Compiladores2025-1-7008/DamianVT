<p  align="center">
  <img  width="200"  src="https://www.fciencias.unam.mx/sites/default/files/logoFC_2.png"  alt="">  <br>Compiladores  2025-1 <br>
<<<<<<< HEAD
  Práctica 0: Sistema de procesamiento de Lenguaje <br> Profesora: Ariel Adara Mercado Martínez
=======
  Práctica 2: Analizadores léxicos con Lex (JFlex) <br> Profesora: Ariel Adara Mercado Martínez
>>>>>>> 67e681d98202598642746859c1649c5e705560de
</p>

## Analizador léxico para el lenguaje C_1
### Objetivo:
Que el alumno conozca y utilice los principios para generar analizadores léxicos utilizando Lex.

### Introducción
Lex es una herramienta para generar analizadores léxicos, que se deben describir mediante las expresiones regulares de los tokens que serán reconocidas por el analizador léxico (scanner o lexer). Originalmente fue desarrollado para el sistema operativo Unix, pero con la popularidad de Linux se creo una versión para este sistema llamada Flex.

### Estructura del directorio
```c++
<<<<<<< HEAD
p2
├── README.md
└── src
    ├── C_1
    │   ├── Lexer.hpp //archivo de cabecera del analizador
    │   ├── lexer.ll //definición del analizador léxico en Flex 
    │   ├── main.cpp //contiene la función principal del programa
    │   ├── prueba //archivo de entrada para el analizador léxico
    │   └── tokens.hpp //definición de tokens
    └── Primer programa en Lex
=======
P2
├── README.md
└── src
    ├── main
    │   ├── java
    │   │   ├── ClaseLexica.java // Enum que contendrá todas las clases léxicas
    │   │   └── Token.java // Estructura de datos que representa un componente léxico
    │   └── jflex
    │       └── Lexer.flex // Definición de nuestro analizador léxico
    └── tst
        └── prueba.txt // Archivo de entrada de prueba
>>>>>>> 67e681d98202598642746859c1649c5e705560de
```

### Uso

#### Compilación

```bash
<<<<<<< HEAD
$ jflex src/main/jflex/definicion.flex
=======
$ jflex src/main/jflex/Lexer.flex
>>>>>>> 67e681d98202598642746859c1649c5e705560de
$ javac --source-path src -d build src/main/jflex/Lexer.java
```

#### Ejecución

```bash
$ java -cp build main.jflex.Lexer input.txt  
```


#### Salida esperada
```
<<<<<<< HEAD
12, int
15, float
11, if
14, else
13, while
12, int
16, 12345
16, 1.2e6
10, a1
10, a_23
10, ___
10, id2
10, if3
10, while4
10, _b
9, ;
8, ,
6, (
7, )
12, int
7, )
10, a
10, _qbc
=======
<INT, int>
<FLOAT, float>
<IF, if>
<ELSE, else>
<WHILE, while>
<INT, int>
<NUMERO, 12345>
<NUMERO, 1.2e6>
<ID, a1>
<ID, a_23>
<ID, ___>
<ID, id2>
<ID, if3>
<ID, while4>
<ID, _b>
<PYC, ;>
<COMA, ,>
<LPAR, (>
<RPAR, )>
<INT, int>
<RPAR, )>
<ID, a>
<ID, _qbcaaa>
>>>>>>> 67e681d98202598642746859c1649c5e705560de
```


#### Ejercicios

<<<<<<< HEAD
8. Describir el conjunto de terminales y la expresión regular que reconoce a cada uno  en _lexer.flex_. (2 pts)
9. Generar acciones léxicas para cada terminal de nuestro lenguaje en _Lexer.cpp_, de modo que se muestre en pantalla la slida esperada con el archivo _prueba_. (2 pts)
10. Crear un _Makefile_. (1 pt)
=======
1. Describir el conjunto de terminales en y la expresión regular que reconoce a cada uno  en _lexer.flex_. (4 pts)
2. Generar acciones léxicas para cada terminal de nuestro lenguaje en _Lexer.cpp_, de modo que se muestre en pantalla la salida esperada con el archivo _prueba.txt_. (4 pts)
3. Crear un _build.xml_ para Java Ant que suplemente los pasos de compilación y ejecución descritos. (2 pt)
>>>>>>> 67e681d98202598642746859c1649c5e705560de

---
#### Extras

<<<<<<< HEAD
11. Incluir lo necesario para producir la misma salida que en la práctica 1 (2 pts.)
12. Documentar el código. (0.25pts)
13. Proponer 4 archivos de prueba nuevos, 2 válidos y 2 inválidos. (0.25pts)
=======
4. Modificar lo necesario para producir una salida que considere no guardar lexemas que son los únicos miembros de su clase léxica. (0.5 pts.)
5. Documentar el código. (0.25 pts.)
6. Proponer 4 archivos de prueba nuevos, 2 válidos y 2 inválidos. (0.25 pts.)
>>>>>>> 67e681d98202598642746859c1649c5e705560de



