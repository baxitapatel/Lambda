package inheritence;

public class Pizza extends Food {

    private String make;

    public Pizza(int price, String name, String test, String make) {
        super(price, name, test);
        this.make = make;

    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

}
