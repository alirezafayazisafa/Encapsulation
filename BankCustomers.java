import java.util.ArrayList;

public class BankCustomers {
    private ArrayList<BankAccount> accountsList = new ArrayList<>();

    public void addAccount(BankAccount account) {
        accountsList.add(account);
    }

    public void showAllBalances() {
        if (accountsList.isEmpty()) {
            System.out.println("No accounts available.");
            return;
        }
        for (BankAccount account : accountsList) {
            System.out.println("Account Holder Name is " + account.getAccountHolderName());
            System.out.println("Account Number is " + account.getAccountNumber());
            System.out.println("Account Balance is " + account.getBalance());
            System.out.println("*----* *----* *----*");
        }
    }

    public BankAccount findAccount(String accountNumber) {
        for (BankAccount account : accountsList) {
            if (accountNumber.equals(account.getAccountNumber())) {
                System.out.println("Account Holder Name is " + account.getAccountHolderName());
                System.out.println("Account Number is " + account.getAccountNumber());
                System.out.println("Account Balance is " + account.getBalance());
                System.out.println("*----* *----* *----*");
                return account;
            }
        }
        System.out.println("User Not Found!");
        System.out.println("*----* *----* *----*");
        return null;
    }
}
