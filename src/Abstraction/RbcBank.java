package Abstraction;

public class RbcBank  implements Bank{


    @Override
    public int calculateInterest() {
        return 3;
    }

    @Override
    public int calculateInterest(int i) {
        return 0;
    }

    @Override
    public int calculateInterest(String s) {
        return 0;
    }
}

