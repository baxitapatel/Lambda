package abc;

public class Bicycle {

    private String colour;
    private int price;

    public Bicycle(String name, String colour, String model, String colour1, int price) {

        this.colour = colour1;
        this.price = price;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}


