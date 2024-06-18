package Loops;

import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        // Mostre os numeros de 1 a 5

        sintaxDoWhile();
    }

    public static void sintaxFor(){
        /**
         Syntax for loops:

         for (Inicialização; condição; Incremento/Decremento) {
         //Instrução ou codigo a ser executado
         }
         */

        //Recomendado usar quando se sabe a quantidade de vezes que o loop será executado
        for (int num = 1; num <= 5; num++){
            System.out.println(num);
        }

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        for (int num = 1; num <= n; num++){
            System.out.println(num + " ");
        }
    }

    public static void sintaxWhile(){
        /**
          Syntax while loops:

            while(condição) {
                //Instrução ou codigo que será executado
            }
         **/


        int num = 1;
        //Recomendado usar quando não se sabe a quantidade total de vezes que o loop será executado.
        while (num <= 5) {
            System.out.println(num);
            num++;
        }
    }

    public static void sintaxDoWhile(){
        /**
          Syntax while loops:
            do{
         //Instrução ou codigo que será executado
         }
         while(condição) {
            }
         **/

        int num = 1;
        do {
            System.out.println("Hello World");
        } while (num != 1);
    }
}
