package inheritence;

public class XXIphone extends Iphone {


        public XXIphone(){
            System.out.println("Constructing XXIphon");
        }

        public XXIphone(String modelName, int rate) {
            super(modelName, rate);
        }

        @Override
        public void calprice() {
            System.out.println("Calculating price of XXIphon");
            setPrice(getPrice() + 400);
        }
    }

