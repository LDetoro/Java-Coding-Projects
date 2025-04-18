public class CheckingAccount extends BankAccount {

    private int overdraftFee = 0;

    @Override
    public boolean debit(int amount)
    {
        balance -= amount;
        if(balance < 0)
        {
            balance -= overdraftFee;
        }
        return true;
    }

    public void setFee(int overdraftFee) {
        this.overdraftFee = overdraftFee;
    }

    public int getFee() {
        return overdraftFee;
    }

    @Override
    public void applyInterest() {
        if (balance > 0) {
            balance += (int) (balance * interestRate);
        }
    }

    @Override
    public String accountInfo() {
        return String.format("Type of Account : Checking\n" +
                "Account ID      : %s\n" +
                "Current Balance : $%.2f\n" +
                "Interest rate   : %.2f%%\n" +
                "Overdraft Fee   : $%.2f",
                accountID, balance / 100.0, interestRate * 100, overdraftFee / 100.0);
    }
}
