public class CreditcardAccount extends BankAccount {

    private int limit = 0;

    // Default constructor initializes values correctly
    public CreditcardAccount() {
        this.accountID = "0000-0000-0000-0000";
        this.balance = 0;
        this.interestRate = 0.0;
        this.limit = 0;
    }

    @Override
    public boolean debit(int amount) {
        if (balance - amount >= -limit) {
            balance -= amount;
            return true;
        }
        return false;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }

    public int getLimit() {
        return limit;
    }

    @Override
    public void applyInterest() {
        if (balance < 0) {
            int interestAmount = (int) (balance * interestRate);
            balance += interestAmount;
        }
    }

    @Override
    public String accountInfo() {
        return String.format(
            "Type of Account : Creditcard\n" +
            "Account ID      : %s\n" +
            "Current Balance : $%.2f\n" +
            "Interest rate   : %.2f%%\n" +
            "Credit Limit    : $%.2f",
            accountID, Math.abs(balance) / 100.0, interestRate * 100, limit / 100.0
        );
    }
}
