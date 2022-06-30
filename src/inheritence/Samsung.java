package inheritence;

public class Samsung extends MobileBase {

    public Samsung(){
        System.out.println("Constructing Samsung");
    }

    public Samsung(String modelName, int rate) {
        super(modelName, rate);
        System.out.println("Constructing Samsung with parameter");
    }
    @Override
    public void calprice(){
        System.out.println("Calculating price of Samsung");
        setPrice(getPrice() + 500);
    }


}
