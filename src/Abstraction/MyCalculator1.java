package Abstraction;

public class MyCalculator1 implements Calculator {


        int a = 10;
        int b = 4;
        @Override
        public void add() {
            int sum = a+b;
            System.out.println("Sum is :"+sum);


        }

        @Override
        public void sub() {
            int sub = a - b;
            System.out.println("Sub is : " +sub);

        }
}
