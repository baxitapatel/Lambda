package Abstraction;

public interface Bank {


    public default void  registrationProcess(){
        System.out.println("hello");
    }
    public abstract int calculateInterest();
    public abstract int calculateInterest(int i);
    public abstract int calculateInterest(String s);

}
