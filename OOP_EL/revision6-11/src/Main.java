public class Main {

    public static void main(String[] args) {

        BankAccount.resetCounters();

        BankAccount account1 = new BankAccount();
        BankAccount account2 = new BankAccount("Malek");
        BankAccount account3 = new BankAccount("Arios", 300);

        System.out.println("--Printing info for all 3 accounts to test constructor--");

        account1.displayAccountInfo();
        account2.displayAccountInfo();
        account3.displayAccountInfo();

        System.out.println("--Add money to one account--");
        // account2.getBalance(); // this is wrong, cuz it returns the value but it ignores (nothing prints)
        System.out.println("Account Holder: " + account2.getAccountHolder() + "\nBalance before the deposit: " + account2.getBalance()); // shows old balance
        account2.deposit(600); // deposits the amount to the account
        System.out.println("Account Holder: " + account2.getAccountHolder() + "\nBalance after deposit: " + account2.getBalance()); // shows new balance

        System.out.println("--Remove money from one account account--");

        System.out.println("Account Holder: " + account3.getAccountHolder() + "\nBalance Before the withdrawl: " + account3.getBalance());
        account3.withdraw(250);
        System.out.println("Account Holder: " + account3.getAccountHolder() + "\nBalance after withdrawl: " + account3.getBalance());

        System.out.println("--Transfering money between two accounts--");

        System.out.println("Sender Account holder: "+ account2.getAccountHolder() + "\nSender Balance before the wire: " + account2.getBalance());
        System.out.println("Receiving Account holder: "+ account3.getAccountHolder() + "\nReceiver Balance before the wire: " + account3.getBalance());
        account2.transferMoney(account3,500);
        System.out.println("Sender Account holder: "+ account2.getAccountHolder() + "\nSender Balance after the wire: " + account2.getBalance());
        System.out.println("Receiving Account holder: "+ account3.getAccountHolder() + "\nReceiver Balance after the wire: " + account3.getBalance());

        System.out.println("--Displaying Account information--");
        System.out.println("Account info of: "+ account2.getAccountHolder());
        account2.displayAccountInfo(">>>");

        System.out.println("--Combining two accounts into one account--");
        // account2.combineAccounts(account1); //combining accounts but not storing them anywhere

        //BankAccount jointAccount = new BankAccount(); // could also be written
        //jointAccount = account2.combineAccounts(account3); // could also be written

        BankAccount jointAccount = account2.combineAccounts(account3); // new object called combined.. account 2 calling the method. .. account3 is passed as a parameter
        System.out.println("JointAccount details: ");
        jointAccount.displayAccountInfo();




    }


}
