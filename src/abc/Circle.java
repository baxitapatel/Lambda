package abc;

public class Circle {


    public static final double PI = 3.14;//static final
    private double radius;// instance variable

    // Default constructor:
    public Circle () {
    }
    // parameterized constructor:
    public Circle(double radius) {
        this.radius = radius;
    }
    // Instance method to get the radius:
    public double getRadius(){
        return radius;
    }
    // Instance method to calculate the circumference of a circle:
    public double circumference(){
        return 2 * PI * radius;
    }
    // Instance method to calculate the area of a circle:
    public double area() {
        return PI * radius * radius;
    }
}

