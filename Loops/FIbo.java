package Loops;

import java.util.Scanner;

public class FIbo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int num1 = 0;
        int num2 = 1;
        int count = 2;

        while ( count <= n) {
            int tempNum = num2;
            num2 = num2 + num1;
            num1 = tempNum;

            count++;
        }
        System.out.println(num2);
    }
}
