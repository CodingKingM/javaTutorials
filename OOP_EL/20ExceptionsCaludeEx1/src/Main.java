public class Main {

    public static void main(String[] args) {


        try {
            BankAccount fynn = new BankAccount("Fynn", -500);
            fynn.withdraw(500);
            System.out.println(fynn.getBalance());
        }
        catch (InsufficientFundsException | InvalidBalanceException e) {
            System.out.println("Insufficient Funds broke ass " + e.getMessage());

        }

    }
}
