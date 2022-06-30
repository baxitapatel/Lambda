package abc;

public class Calculator {


    public static void main(String[] args) {
        int a=addition(5,8);
        System.out.println(a);
        float s=subtraction (40,30);
        System.out.println(s);
        double m= multiply(3.4,3.7);
        System.out.println(m);
        int d=division(8,2);
        System.out.println(d);
    }
    public static int addition(int x, int y) {
        int  add=x+y;
        return add;
    }
    public static float subtraction ( float a,float b) {
        float sub = a-b;
        return sub;
    }
    public static double multiply(double x, double y) {
        double multiply = x*y;
        return multiply;
    }
    public static int division (int x, int y) {
        int division = x/y;
        return division;
    }
}
