package abc;

public class Assingnment {

    public static void main(String[] args) {

        // largest number
        int x = 6;
        int y = 3;
        int z = 1;
        if (x > y && x > z) {
            System.out.println("x is largest number");
        } else if (z > x && z > y) {
            System.out.println("z is largest number");
        } else if (y> x && y> z){
            System.out.println("y is largest number");
        } else
            System.out.println("all equal");

        // positive or negative
        int c=9;
        if (c>0){
            System.out.println("c is positive");
        } else if (c<0) {
            System.out.println("c is negative");
        } else {

        }

        // even or odd
        int a = 7;
        if (a % 2 == 0) {
            System.out.println( "a is even");
        }
        else{
            System.out.println("a is odd");
        }
    }
}
