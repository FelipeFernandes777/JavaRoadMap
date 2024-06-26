package Loops;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int resultado = 0;

        while(true){
            //Pega o operador que será utilizado
            System.out.println("Coloque o operador: ");
            char operador = in.next().trim().charAt(0);
            if(operador == '+' || operador == '-' || operador == '*' || operador == '/' || operador == '%') {
                // Entrada de 2 numeros
                System.out.println("Adicione 2 numeros: ");
                int numero1 = in.nextInt();
                int numero2 = in.nextInt();

                if(operador == '+') {
                    resultado = numero1 + numero2;
                }
                if(operador == '-') {
                    resultado = numero1 - numero2;
                }
                if(operador == '*') {
                    resultado = numero1 * numero2;
                }
                if(operador == '/') {
                    if (numero2 != 0) {
                        resultado = numero1 / numero2;
                    }
                }
                if(operador == '%') {
                    resultado = numero1 % numero2;
                }
            } else if (operador == 'x' || operador == 'X') {
                break;
            } else {
                System.out.println("Operador Invalido");
            }
            System.out.println("Resultado: " + resultado);
        }
    }
}
