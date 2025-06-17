public class BankAccount {

    // Instance Variables
    private String accountHolder;
    private int accountNumber;
    private double accountBalance;


    //Static variables
    private static int totalAccounts; //tracks how many accounts exist
    private static int nextAccountNumber; //assigns unique account numbers. starts at 0, shared by all accounts

    // Constructor

    public BankAccount(){ // has to be class name not variable name
        accountHolder = "Unknown";
        // accountNumber = 0; shouldn't be set to zero
        accountNumber = ++nextAccountNumber;
        accountBalance = 0;
        totalAccounts++;
    }

    public BankAccount(String accountHolder){
        this.accountHolder = accountHolder; // we used this to indicate that this is the object we are working with and we can use AccountHolder as a parameter
        accountNumber = 0;
        accountBalance = 0;
        totalAccounts++; // **the counter was missing
    }

    public BankAccount(String accountHolder, int accountBalance){
        this (accountHolder);
        this.accountBalance = accountBalance;
        // accountNumber = 0; ** dont see account number = 0, let the other constructor handle it
    }

    //Instance Methods

    public void deposit(double amount){ // adds to balance
    accountBalance += amount; // i dont know why we have used this
    }

    public void withdraw(double amount){ // subtracts from balance
        accountBalance -= amount; // i dont know why
    }
    // moves money from accounts // **** should be void, not return bankAccount
    public void transferMoney(BankAccount otherAccount, double amount) // this part needs revison
    {
        this.accountBalance -=amount; //remove the money from the current account
        otherAccount.accountBalance += amount; // add the moeny from account1 to other account
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
    public void displayAccountInfo(){
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Balance: " + accountBalance);
    }

    public void displayAccountInfo(String prefix){
        System.out.println(prefix + "Account Holder: " + accountHolder);
        System.out.println(prefix + "Account Number: " + accountNumber);
        System.out.println(prefix + "Account Balance: " + accountBalance);
    }
     public BankAccount combineAccounts(BankAccount otherAccount){
        BankAccount otherBankAccount = new BankAccount();
        otherBankAccount.accountHolder = this.accountHolder; // i dont know why
         return otherBankAccount;
     }

     // Static methods
    public int getTotalAccounts(){
        return totalAccounts;
    }
    public void resetCounters(){
        totalAccounts = 0;
        nextAccountNumber = 0;
    }

}
