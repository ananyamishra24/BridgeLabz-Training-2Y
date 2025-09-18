interface Loanable {
    void applyForLoan(double amount);
    String calculateLoanEligibility();
}

abstract class BankAccount implements Loanable {
    private String accountNumber;
    private String holderName;
    private double balance;

    public BankAccount(String accountNumber, String holderName, double balance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getHolderName() {
        return holderName;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (amount <= balance) balance -= amount;
        else System.out.println("Insufficient balance for withdrawal.");
    }

    public abstract double calculateInterest();

    public void displayDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Holder Name: " + holderName);
        System.out.println("Balance: " + balance);
        System.out.println("Interest: " + calculateInterest());
        System.out.println(calculateLoanEligibility());
        System.out.println("--------------------------------");
    }
}

class SavingsAccount extends BankAccount {
    public SavingsAccount(String accountNumber, String holderName, double balance) {
        super(accountNumber, holderName, balance);
    }

    @Override
    public double calculateInterest() {
        return getBalance() * 0.04;
    }

    @Override
    public void applyForLoan(double amount) {
        System.out.println("Savings Account Loan Applied: " + amount);
    }

    @Override
    public String calculateLoanEligibility() {
        if (getBalance() >= 5000) return "Eligible for Loan";
        return "Not Eligible for Loan";
    }
}

class CurrentAccount extends BankAccount {
    public CurrentAccount(String accountNumber, String holderName, double balance) {
        super(accountNumber, holderName, balance);
    }

    @Override
    public double calculateInterest() {
        return getBalance() * 0.02;
    }

    @Override
    public void applyForLoan(double amount) {
        System.out.println("Current Account Loan Applied: " + amount);
    }

    @Override
    public String calculateLoanEligibility() {
        if (getBalance() >= 10000) return "Eligible for Loan";
        return "Not Eligible for Loan";
    }
}

public class BankingSystem {
    public static void main(String[] args) {
        BankAccount acc1 = new SavingsAccount("SAV123", "Akshay", 8000);
        BankAccount acc2 = new CurrentAccount("CUR456", "Rahul", 15000);

        BankAccount[] accounts = {acc1, acc2};

        for (BankAccount acc : accounts) {
            acc.displayDetails();
            acc.applyForLoan(50000);
        }
    }
}
