package Abstraction;

public class MainCalculator {

    public static void main(String[] args) {
        MyCalculator1 c1 = new MyCalculator1();
        c1.add();
        c1.sub();
        MyCalculator2 c2 = new MyCalculator2();
        c2.add();
        c2.sub();
        MyCalculator3 c3 = new MyCalculator3();
        c3.add();
        c3.sub();
    }
}
