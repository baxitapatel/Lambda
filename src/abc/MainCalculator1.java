package abc;

public class MainCalculator1 {

    public static void main(String[] args) {
        Calculator1 c = new Calculator1();
        int add = c.add(4, 4);
        System.out.println("The sum is " +add);
        int result = c.subtraction(8, 3);
        System.out.println("The subtraction is " +result);
        double result2 = c.divide(8, 4);
        System.out.println("The Division is " +result2);

    }
}
