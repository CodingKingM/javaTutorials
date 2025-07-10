public class BankAccount {

    private String name;
    private double balance;

    //Constrctor where we introduce our exceptions

    public BankAccount(String name, double balance) throws InvalidBalanceException {
        if (balance < 0) throw new InvalidBalanceException("Invalid Balance");
        this.name = name; // why do we use this.name = name; to store it ?
        this.balance = balance;
    }

    // method

    public void withdraw(double amount) throws InsufficientFundsException {
        if (amount > balance) throw new InsufficientFundsException("Insufficient Funds");
        balance -= amount;
    }

    // dont we need to mention before it else {  ?


// getter

    public double getBalance() {
        return balance;
    }
}

