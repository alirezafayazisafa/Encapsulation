public abstract class BankAccount {

    final private String accountNumber;
    private String accountHolderName;
    protected double balance;

    public BankAccount(String accountNumber, String accountHolderName, double balance){
        this.balance = balance;
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;

    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public abstract void calculateInterest();

    public void deposit(double amount){

        if(amount < 0) {
            var exception = new IllegalArgumentException("Amount cannot be negative!");
            throw exception;
        }
        else{
            balance += amount;
            System.out.println("The requested amount has been added to the balance.");
        }
    }

    public void withdraw(double amount){
        if(amount <= balance) {
            if (amount < 0) {
                var exception = new IllegalArgumentException("Amount cannot be negative!");
                throw exception;
            } else {
                balance = balance - amount;
                System.out.println("The requested amount was removed from the balance.");
            }
        }
        else
            System.out.println("Insufficient inventory");

    }



}
