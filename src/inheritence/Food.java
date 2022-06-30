package inheritence;

public class Food {

    private int price;
    private String name;
    private String test;

    public Food(int price, String name, String test) {
        this.price = price;
        this.name = name;
        this.test = test;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTest() {
        return test;
    }

    public void setTest(String test) {
        this.test = test;
    }
}

