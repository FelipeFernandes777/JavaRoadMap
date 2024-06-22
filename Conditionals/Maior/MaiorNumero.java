package Conditionals.Maior;

import java.util.Scanner;

public class MaiorNumero {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int num1 = in.nextInt();
        int num2 = in.nextInt();
        int num3 = in.nextInt();

        //Encontre o maior numero das 3 variaveis.

//        int max = num1;
//
//        if (num2 > max) {
//            max = num2;
//        }
//        if(num3 > max) {
//            max = num3;
//        }

        int max = Math.max(num1,Math.max(num2,num3));
        System.out.println(max);
    }
}
