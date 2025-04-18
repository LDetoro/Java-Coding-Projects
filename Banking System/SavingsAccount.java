public class SavingsAccount extends BankAccount {

    public boolean debit(int amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            return true;
        }
        return false;
    }

    @Override
    public void applyInterest() {
        if (balance > 0) {
            balance += (int) (balance * interestRate);
        }
    }

    @Override
    public String accountInfo() {
        return String.format("Type of Account : Savings\n" +
                "Account ID      : %s\n" +
                "Current Balance : $%.2f\n" +
                "Interest rate   : %.2f%%",
                accountID, balance / 100.0, interestRate * 100);
    }
}
