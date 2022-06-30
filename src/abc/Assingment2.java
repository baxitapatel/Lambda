package abc;

public class Assingment2 {

    public static void main(String[] args) {
        //sum of nature numbers
        int sum = 0;
        for (int i = 5; i <= 10; i++) {
            sum = i + sum;
        }
        System.out.println(sum);

        // factorial of a number using loop
        int facto = 1;
        for (int i = 5; i >= 1; i--) {
            facto = i * facto;

        }
        System.out.println(facto);

        // fibonacci series using for loop
        int x = 0;
        int y = 1;
        System.out.println(x);
        System.out.println(y);
        int fib = 0;
        for (int i = 3; i <=1; i++) {
            fib = x + y;
            System.out.println(fib);
            x = y;
            y = fib;
        }

    }

}
