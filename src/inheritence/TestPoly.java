package inheritence;

public class TestPoly {

    public static void main(String[] args) {
        //Creating object using loose coupling
        MobileBase a , b , c, ax , axx;

        a = new Iphone("iphone" ,900);
        b = new Samsung("Samsung",200);
        c = new BlackBerry("Blackberry",400);
        ax = new XIphone("XIphone" , 300);
        axx = new XXIphone("XXIphone", 400);

        //Calculating the prices of mobile

        a.calprice();
        b.calprice();
        c.calprice();
        ax.calprice();
        axx.calprice();

        //Displaying the prices of mobile

        System.out.println("price of Iphone " +a.getPrice() );
        System.out.println("price of Samsung " +b.getPrice());
        System.out.println("price of Blackberry" +c.getPrice());
        System.out.println("price of XIphone " +ax.getPrice());
        System.out.println("price of XXIphone " +axx.getPrice());

    }
}

