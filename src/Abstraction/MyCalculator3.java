package Abstraction;

public class MyCalculator3 implements Calculator {

    int a= 7;
    int b = 3;

    @Override
    public void add() {
        System.out.println("Sum is :" +(a+b));

    }

    @Override
    public void sub() {
        System.out.println("Difference is" +(a-b));
    }
}
