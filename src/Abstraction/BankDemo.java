package Abstraction;

import java.util.ArrayList;
import java.util.List;

public class BankDemo {

    public static void main(String[] args) {
        Bank b = new TdBank();
        consum(b);

    }
    public static void consum(Bank bank){
        bank.registrationProcess();
        int i = bank.calculateInterest();
    }
}
