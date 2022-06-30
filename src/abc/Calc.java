package abc;

public class Calc {

    private static int z ;// static blocks
    static {
        System.out.println("in static block");
        z=10;
    }

    private int x;
    private int y;


    public Calc(int x, int y) {
        System.out.println(" in con");
        this.x = x;
        this.y = y;

    }
}
