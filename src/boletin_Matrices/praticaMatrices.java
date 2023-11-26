package PracticaEvaluable;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class PrincipalAlumnos {
    public static final int TAM = 4;
    public static final int INTENTOS = 5;
    public static final char OCULTO = '#';
    static char[][] matriz = new char[TAM][TAM];
    static boolean[][] matrizVisible = new boolean[TAM][TAM];


    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        /*
        matrizVisible es una matriz de booleanos que nos servirá para saber si una celda está visible u oculta.
        Por defecto, todas las celdas estarán ocultas, por lo que inicializamos la matriz a false.
         */
        ocultarTodaLaMatriz(matrizVisible);


        /*
         * La estrategia que seguiremos será la siguiente: Rellenaremos la matriz con los valores de la A a la letra final
         * (que vendrá determinada por A + TAM * TAM / 2) dos veces. Una vez rellenada la matriz, la recorreremos y cambiaremos
         * su valor por otra celda de la matriz obtenida aleatoriamente.
         */


        fillMatrix(matriz); // llamada al metodo fillMatrix
        printMatrix2(matriz); // llamada al metodo printMatrix2
        randomizeMatrix(matriz); // llamada al metodo randomizeMatrix
        printMatrix(matriz); // llamada al metodo printMatrix


        int intentosRestantes = INTENTOS;
        while (!checkFinished(matrizVisible) && intentosRestantes > 0) {
            printVisibleMatrix(matriz, matrizVisible);
            int fila1;
            int columna1;

            do {
                System.out.println("Intentos restantes: " + intentosRestantes); // muestra el numero de intentos
                System.out.println("Introduce la fila empezando en 0 (la matriz tiene " + matriz.length + " filas): ");
                fila1 = teclado.nextInt();
                System.out.printf("Introduce la columna empezando en 0 (la matriz tiene " + matriz[0].length + " columnas): ");
                columna1 = teclado.nextInt();
            } while (fila1 >= matriz.length || columna1 >= matriz[0].length);
            /* lo primero se le pregunta al usuario la primera pregunta para que escriba por teclado una vez ya dado el valor por el usuario pasará lo siguiente,
            si la fila2 u la columna2 es mayor o igual se seguirá el juego, en el caso de sea al contrario se le volverá a pedir el valor al usuario hasta que entre dentro de los valores
            * */

            if (matrizVisible[fila1][columna1]) {
                System.out.println("Lo siento, esta casilla ya ha sido levantada");
                continue;
            }
            /*Este if evalua si la casilla de esa posicion ha sido levantada ya o no, en el caso de que no este levantada continua sin entrar en el propio if
            , pero si esta levantada le imprimira un mensaje notificandoselo
            * */

            mostrarCasilla(matriz, matrizVisible, fila1, columna1);
            printVisibleMatrix(matriz, matrizVisible);

            System.out.println("Ingresa las coordenadas de la segunda letra:");

            int fila2;
            int columna2;

            do {
                System.out.println("Introduce la fila empezando en 0 (la matriz tiene " + matriz.length + " filas): ");
                fila2 = teclado.nextInt();
                System.out.printf("Introduce la columna empezando en 0 (la matriz tiene " + matriz[0].length + " columnas): ");
                columna2 = teclado.nextInt();
            } while (fila2 >= matriz.length || columna2 >= matriz[0].length);
            /* lo primero se le pregunta al usuario la primera pregunta para que escriba por teclado una vez ya dado el valor por el usuario pasará lo siguiente,
            si la fila2 u la columna2 es mayor o igual se seguirá el juego, en el caso de sea al contrario se le volverá a pedir el valor al usuario hasta que entre dentro de los valores
            * */

            if (matrizVisible[fila2][columna2]) {
                System.out.println("Lo siento, esta casilla ya ha sido levantada");
                ocultarCasilla(matrizVisible, fila1, columna1);
                continue;
            }
            /*Este if evalua si la casilla de esa posicion ha sido levantada ya o no, en el caso de que no este levantada continua sin entrar en el propio if
            , pero si esta levantada le imprimira un mensaje notificandoselo
            * */

            mostrarCasilla(matriz, matrizVisible, fila2, columna2);

            if (matriz[fila1][columna1] == matriz[fila2][columna2]) {
                System.out.println("Felicidades Campeón, has acertado!!");

            } else {
                System.out.println("Te has equivocado las letras no coinciden");
                ocultarCasilla(matrizVisible, fila1, columna1);
                ocultarCasilla(matrizVisible, fila2, columna2);
                intentosRestantes--; /* esto hace que una vez que se equivoque el propio usuario introduciendo el valor le reste una vidaç
                                      , pero si acierta no tiene que quitarle nada debe seguir con la misma */
            }
            /*Compara las letras en las casillas especificadas por las coordenadas y si las letras son iguales se le muestra un mensaje de felicitacion,
             si no son iguales imprime un mensaje de equivocacion*/
        }

        if (checkFinished(matrizVisible)) {
            System.out.println("¡Enhorabuena! Has ganado");
        } else {
            System.out.println("¡Vaya! Has perdido. Vuelve a jugar otra vez.");
        }
    }

    private static void mostrarCasilla(char[][] matriz, boolean[][] matrizVisible, int fila, int columna) {
        matrizVisible[fila][columna] = true;
        System.out.println("EL CONTENIDO DE LA CASILLA ES: (" + fila + "," + columna + "): " + matriz[fila][columna]);
    }
    /*Este metodo proporciona una forma de modificar el estado de visibilidad de una casilla en especifico dentro de la matriz visible (marcándola como visible)
     y muestra el contenido de esa casilla en la matriz
     * */

    private static void ocultarCasilla(boolean[][] matrizVisible, int fila, int columna) {
        matrizVisible[fila][columna] = false;
    }
    /*Este metodo proporciona una forma de modificar el estado de visibilidad de una casilla en especifico dentro de la matriz visible
     * */


    // TODO : EXPLICACION METODO printMatrix :
    private static void printMatrix(char[][] matriz) {
        System.out.println("MATRIZ DESORDENADA: ");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
    /*Este metodo lo que lleva acabo es imprimir la matriz
     * */

    // TODO : EXPLICACION METODO printMatrix2 :
    private static void printMatrix2(char[][] matriz) {
        System.out.println("MATRIZ ORGINAL: ");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
    /* se que este metodo no lo has proporcionado tu en el ejercicio, realiza la misma funcion que el metodo printMatrix
    pero lo que ocurre es que cuando haga la llamada al metodo de printMatrix me sale mensaje de "MATRIZ DESORDENADA:"
    y he querido hacer otro printMatrix para identificar cual es cada una, este printMatrix2 dara la matriz original
    y el printMatrix dara la ordenada
    * */

    //TODO : EXPLICACION METODO printVisibleMatrix POR PARTES:

    /**
     * Imprime la matriz visible por pantalla, mostrando las celdas ocultas con el valor de la constante OCULTO
     *
     * @param matriz
     * @param matrizVisible
     */
    private static void printVisibleMatrix(char[][] matriz, boolean[][] matrizVisible) {
        System.out.println("MATRIZ VISIBLE: ");
        // Recorre la matriz
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                // Verifica la visibilidad de la misma
                if (matrizVisible[i][j]) {
                    // lo que realiza esto es que si el elemento es visible, que lo imprima
                    System.out.print(matriz[i][j] + " ");
                } else {
                    // y este realiza que si el elemento no es visible, que imprima el carácter oculto
                    System.out.print(OCULTO + " ");
                }
            }
            System.out.println();
        }
        // esto lo pongo para separar visualmente la salida
        System.out.println();
    }

    //TODO : EXPLICACION METODO fillMatrix POR PARTES:

    /**
     * Rellena la matriz con los valores de la A a la letra final (que vendrá determinada por A + TAM * TAM / 2) dos veces
     *
     * @param matriz
     */
    public static void fillMatrix(char[][] matriz) {
        char letra = 'A';
        char[] letras = new char[TAM * TAM];

        for (int i = 0; i < letras.length; i += 2) {
            letras[i] = letra;
            letras[i + 1] = letra;
            letra++;
        }
        /*Este for llena el array (letras) con pares consecutivos de letras comenzando desde la letra que hemos implementado que es la A
        y esta seguira asi en orden alfabetico hasta que este llena la matriz por dichos valores
        * */

        int n = 0;
        for (int i = 0; i < TAM; i++) {
            for (int j = 0; j < TAM; j++) {
                matriz[i][j] = letras[n];
                n++;
            }
        }
        /*Este for recorre cada posicion de la matriz y asigna los elementos del array letras en orden,
         utilizamos la variable n como indice para seguir el array asegurandonos de que este elemento se asigne correctamente
        * */
    }

    //TODO: EXPLICACION METODO randomizeMatrix POR PARTES:
    private static void randomizeMatrix(char[][] matriz) {
        char[] letras = new char[TAM * TAM];
        int l = 0;
        for (int i = 0; i < TAM; i++) {
            for (int j = 0; j < TAM; j++) {
                letras[l] = matriz[i][j];
                l++;
            }
        }
        /*
         * Este for en cuestion lo que realiza es copiar los elementos de la matriz en orden de fila por fila en el array 
         * */
        for (int i = letras.length - 1; i > 0; i--) {
            int j = (int) (Math.random() * (i + 1));
            char acum = letras[i];
            letras[i] = letras[j];
            letras[j] = acum;
        }
        /*Este for lo que realiza partiendo de la array letras , su función es mezclar de manera aleatoria,
         por ejemplo este for lo que haría es barajar las cartas antes de exponerlas
        * */

        l = 0;
        for (int i = 0; i < matriz.length; i++) {
            char[] fila = matriz[i];
            for (int j = 0; j < fila.length; j++) {
                fila[j] = letras[l++];

            }
        }
        /* Este for recorre la matriz (matriz) y se le da los valores a cada posicion de la propia matriz,
        es decir se le da los valores que nos propociona el anterior for el cual nos da los valores mezclados
        y este los copia para implementar los valores mezclados en la matriz
        * */


    }

    //TODO: EXPLICACION METODO ocultarTodaLaMatriz

    /**
     * Este metodo recorre cada elemento de la matriz (matrizVisible) y este le asignamos un valor false
     * a cada uno de ellos, lo que esto hará será dejar todos los elementos de la matriz no visibles u ocultos
     */
    private static void ocultarTodaLaMatriz(boolean[][] matrizVisible) {
        for (int i = 0; i < TAM; i++) {
            for (int j = 0; j < TAM; j++) {
                matrizVisible[i][j] = false;
            }
        }
    }


    //TODO: EXPLICACION METODO checkFinished

    /* Este metodo realiza lo siguiente: verifica si todos los elementos de la matriz (matrizVisible)
    , esto quiere decir que es visible lo iguale a true, pero retorna true si todos los elementos son visibles,
     y false en cuanto encuentra un elemento que no es visible.
    * */
    private static boolean checkFinished(boolean[][] matrizVisible) {
        for (int i = 0; i < TAM; i++) {
            for (int j = 0; j < TAM; j++) {
                if (!matrizVisible[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }
}
