public class DeclaracionVariables {

    public static void main(String[] args) {
        /*
        * datos primitivos:
        * int = enteros,
        * doubles = numeros con parte decimal,
        * char = que es un caracter 'a',
        * long = numero grande 8 bits,
        * boolean = verdadero o falso,
        *
        * String = son considerados una "clase", todo lo que se escriba con comilla dobe es un string,
        * */

        int numero1; // Declarando una variable

        numero1 = 5; // Asignando o inicializando un variable

        System.out.println("El valor de la variable numero1 es: " + numero1);

        numero1 = 8;

        System.out.println("El nuevo valor de la variable numero1 es: " + numero1);


        /* final tipo_dato nombre_variable
        *  si una variable comienza con la palabra final, significa que su valor no varia por ejemplo*/

        final double PI = 3.14159;

        System.out.println("El valor de la variable final PI es: " + PI);

        /*Operadores aritmeticos
        * + suma, - resta, * multiplicación,/ division,
        *
        * Operadores de condición
        * < menor que, > mayor que, <= menor igual que, >= mayor igual que, == igual de, != distinto de
        *
        * Operadores logios o de desición
        * && Y logico
        * || O logico*/
    }
}
