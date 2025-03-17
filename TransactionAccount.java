public class TransactionAccount extends BankAccount{

    private final double overDraftLimit = 500;

    public TransactionAccount(String accountNumber, String accountHolderName, double balance) {
        super(accountNumber, accountHolderName, balance);
    }

    @Override
    public void calculateInterest() {
        System.out.println("There is no interest for this account.");
    }

    @Override
    public void withdraw(double amount){
        balance += overDraftLimit;
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
