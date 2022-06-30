package abc;

public class Enums {
    public static void main(String[] args) {
        ShirtFactory factory = new ShirtFactory();
        System.out.println(factory.getShirt("red", Size.S));
    }

}
enum Size{
    S("small"),M("medium"),L("large");

    Size(String S) {
    }
}

class ShirtFactory {
    public Shirt getShirt(String colour, Size size) {
        return new Shirt(size, colour);
    }

}
class Shirt {
    private Size size;
    private String colour;

    public Shirt(Size size, String colour) {
        this.size = size;
        this.colour = colour;
    }

    @Override
    public String toString() {
        return "Shirt{" +
                "size='" + size + '\'' +
                ", colour='" + colour + '\'' +
                '}';
    }
}
