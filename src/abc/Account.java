package abc;

public class Account {
    private static final String branch = "abc";
    private long accountNumber;
    private String accountHolderName;

    private double balance;

    public Account(long accountNumber, String accountHolderName) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;

        System.out.println("account open successfully");
    }
    public void depositBalance(double amount){
        balance = balance + amount;
        System.out.println(amount + " amount deposited successfully");
    }
    public double checkBalance(){
        return this.balance;
    }
    public void withdrawnBalance(double amount){
        if (balance<amount){
            System.out.println("insufficient balance");
            return;
        }
        balance= balance - amount;
        System.out.println(amount + "amount withdrawn successfully");
    }
}
