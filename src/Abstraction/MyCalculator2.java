package Abstraction;

public class MyCalculator2 implements Calculator {

    int a = 10;
    int b = 5;

    @Override
    public void add() {
        System.out.println("Sum is"+(a+b));

    }

    @Override
    public void sub() {
        System.out.println("Difference is "+(a-b));
    }
}
