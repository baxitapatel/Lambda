package abc;

import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter some number");
        int x = sc.nextInt();
        int a = 0;
        int b = 1;
        System.out.println(a);
        System.out.println(b);
        int fib;
        for (int i = 3; i <= x; i++) {
            fib = a + b;
            System.out.println(fib);
            a = b;
            b = fib;
        }
    }
}
