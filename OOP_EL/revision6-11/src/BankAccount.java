public class BankAccount {

    // Instance Variables
    private String accountHolder;
    private int accountNumber;
    private double accountBalance;


    //Static variables
    private static int totalAccounts; //tracks how many accounts exist
    private static int nextAccountNumber; //assigns unique account numbers

    // Constructor

    public BankAccount(){ // has to be class name not variable name
        accountHolder = "Unknown";
        accountNumber = 0;
        accountBalance = 0;
        totalAccounts++;
    }

    public BankAccount(String accountHolder){
        this.accountHolder = accountHolder; // we used this to indicate that this is the object we are working with and we can use AccountHolder as a parameter
        accountNumber = 0;
        accountBalance = 0;
    }

    public BankAccount(String accountHolder, int accountBalance){
        this (accountHolder);
        this.accountBalance = accountBalance;
        accountNumber = 0;
    }

    //Instance Methods

    public void deposit(double amount){ // adds to balance
    accountBalance += amount; // i dont know why we have used this
    }

    public void withdraw(double amount){ // subtracts from balance
        accountBalance -= amount; // i dont know why
    }
    // moves money from accounts
    public BankAccount transferMoney(BankAccount otherAccount, double amount) // this part needs revison
    {

    }
    // getters
    public double getBalance(){
        return accountBalance;
    }
    public String getAccountHolder(){
        return accountHolder;
    }
    public int getAccountNumber(){
        return accountNumber;
    }
}
