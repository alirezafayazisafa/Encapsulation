public class SavingAccount extends BankAccount{

    private final double interestRate = 0.03 ;

    public SavingAccount(String accountNumber, String accountHolderName, double balance) {
        super(accountNumber, accountHolderName, balance);
    }

    @Override
    public void calculateInterest() {
        double In = balance * interestRate;
        deposit(In);
    }

    @Override
    public void withdraw(double amount){
        System.out.println("This command is not valid for capital account!");
    }


}
