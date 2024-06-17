package Loops;

public class Loops {
    public static void main(String[] args) {
        // Mostre os numeros de 1 a 5

        sintaxFor();
    }

    public static  void sintaxFor(){
        /**
         Syntax for loops:

         for (initialisation; condition; increment/decrement) {
         //body
         }
         */

        for (int num = 1; num <= 5; num++){
            System.out.println(num);
        }
    }
}
