package abc;

public class MainAccount {


    public static void main(String[] args) {
        Account A = new Account(43555, "baxita");
        A.depositBalance(500.0);
        A.depositBalance(500.0);
        A.depositBalance(500.0);
        A.withdrawnBalance(400);

        System.out.println( "Current balance is : " + A.checkBalance());
    }

}
