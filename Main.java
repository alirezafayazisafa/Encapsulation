public class Main {
    public static void main(String[] args) {

        BankCustomers customers = new BankCustomers();

        BankAccount account1 = new TransactionAccount("62191111", "Alireza Fayazi", 10000);
        BankAccount account2 = new TransactionAccount("62192222", "Test2", 20000);
        BankAccount account3 = new TransactionAccount("62193333", "Teat3", 30000);

        BankAccount account4 = new SavingAccount("62194444", "Test4", 40000);
        BankAccount account5 = new SavingAccount("62195555", "Test5", 50000);
        BankAccount account6 = new SavingAccount("62196666", "Test6", 60000);


        customers.addAccount(account1);
        customers.addAccount(account2);
        customers.addAccount(account3);
        customers.addAccount(account4);
        customers.addAccount(account5);
        customers.addAccount(account6);

        customers.findAccount("62191111");
        customers.findAccount("62197777");

        System.out.println(account1.getBalance());
        System.out.println("*----* *----* *----*");

        account1.deposit(1000);
        System.out.println(account1.getBalance());
        System.out.println("*----* *----* *----*");

            /*account4.deposit(-1000);
        System.out.println(account4.getBalance());
        System.out.println("*----* *----* *----*");*/

        account2.withdraw(10000);
        System.out.println(account2.getBalance());
        System.out.println("*----* *----* *----*");

        account5.calculateInterest();
        System.out.println(account5.getBalance());
        System.out.println("*----* *----* *----*");

        account3.calculateInterest();
        System.out.println(account3.getBalance());
        System.out.println("*----* *----* *----*");

        account1.withdraw(10000);
        System.out.println(account1.getBalance());
        System.out.println("*----* *----* *----*");
        account2.withdraw(11000);
        System.out.println(account2.getBalance());
        System.out.println("*----* *----* *----*");
        //account3.withdraw(-1000);
        System.out.println(account3.getBalance());
        System.out.println("*----* *----* *----*");

        account4.withdraw(500000);
        System.out.println(account4.getBalance());
        System.out.println("*----* *----* *----*");
        account5.withdraw(3000);
        System.out.println(account5.getBalance());
        System.out.println("*----* *----* *----*");
        account6.withdraw(-1000);
        System.out.println(account6.getBalance());
        System.out.println("*----* *----* *----*");

        customers.showAllBalances();



    }
}