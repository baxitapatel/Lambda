package inheritence;

public abstract class MobileBase {

    private String modelName;
    private int price;
    public MobileBase(){
        System.out.println("Constructing MobileBase");
    }

    public MobileBase(String modelName, int price) {
        System.out.println("Constructing MobilBase with parameter");
        this.modelName = modelName;
        this.price = price;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int rate) {
        price = rate;
    }

    public abstract void calprice();


}
