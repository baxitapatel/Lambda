package inheritence;

public class Iphone extends MobileBase {

    public Iphone(){
        System.out.println("Constructing Iphone");
    }

    public Iphone(String modelName, int rate) {
        super(modelName, rate);
        System.out.println("Constructing Iphone with parameter");
    }
    @Override
    public void calprice(){
        System.out.println("calculating price of Iphone");
        setPrice(getPrice() + 200);
    }
}
