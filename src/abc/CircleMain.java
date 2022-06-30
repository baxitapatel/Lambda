package abc;

import java.util.Scanner;

public class CircleMain {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Class Circle with default constructor:
        System.out.println("Class Circle - default constructor");
        Circle c1 = new Circle();
        System.out.println("Radius of the circle is " + c1.getRadius());
        System.out.println("Circumference of the circle is " + c1.circumference());
        System.out.println("Area of the circle is " +c1.area() );
        System.out.println();

        //Class Circle with parametrized constructor:

        System.out.println("Class circle - parameterized constructor");
        System.out.println("Enter radius of circle");
        double radius = sc.nextDouble();
        Circle C2 = new Circle(radius);
        System.out.println("Radius of the circle is " + C2.getRadius());
        System.out.println("Circumference of the circle is " + C2.circumference());
        System.out.println("Area of the circle is" + C2.area());
        System.out.println();

        // Class Circle1 - static method:

        System.out.println("class Circle1 - static method");
        System.out.println("enter the radius of the circle");
        double r = sc.nextDouble();
        System.out.println("Circumference of the circle is " + Circle1.circumference(r));
        System.out.println("area of the circle is" + Circle1.area(r));
        System.out.println();


    }

}
