package inheritence;

public class BlackBerry extends MobileBase {

    public BlackBerry(){
        System.out.println(" Constructing Blackberry ");
    }

    public BlackBerry(String modelName, int rate) {
        super(modelName, rate);
        System.out.println("Constructing Blackberry with parameter");
    }

    @Override
    public void calprice(){
        System.out.println("calculating price of BlackBerry");
        setPrice(getPrice() + 500);

    }
}
