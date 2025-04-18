// Main class for testing
public class Main {
    public static void main(String[] args) {
        // Creating an instance of TestAccount (since BankAccount is abstract)
        TestAccount account = new TestAccount();

        // Setting account details
        account.setAccountID("1234-5678-9012-3456");
        account.setInterestRate(0.02); // 2% interest rate

        // Crediting and debiting
        account.credit(5000); // Adding 5000 cents ($50)
        System.out.println(account.accountInfo());

        account.debit(2000); // Subtracting 2000 cents ($20)
        System.out.println(account.accountInfo());

        // Applying interest
        account.applyInterest();
        System.out.println("After interest: " + account.accountInfo());
    }
}
