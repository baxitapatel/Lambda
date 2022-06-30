package abc;

public class Car {

    private String name;
    private String Colour;
    private  String Model;

    public Car(String name, String colour, String model) {
        this.name = name;
        Colour = colour;
        Model = model;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColour() {
        return Colour;
    }

    public void setColour(String colour) {
        Colour = colour;
    }
}

