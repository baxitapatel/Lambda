package inheritence;

public class XIphone extends Iphone{

    public XIphone(){
        System.out.println("Constructing XIphon");

    }

    public XIphone(String modelName, int rate) {
        super(modelName, rate);
    }

    @Override
    public void calprice() {
        System.out.println("Calculating Price of XIphon");
        setPrice(getPrice() + 500);
    }
}
