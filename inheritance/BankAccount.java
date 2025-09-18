// Superclass: BankAccount
class BankAccount {
    protected String accountNumber;
    protected double balance;

    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Method to display basic account details
    public void displayAccountInfo() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: ₹" + balance);
    }
}

// Subclass 1: SavingsAccount
class SavingsAccount extends BankAccount {
    private double interestRate;

    public SavingsAccount(String accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    public void displayAccountType() {
        System.out.println("Account Type: Savings Account");
        displayAccountInfo();
        System.out.println("Interest Rate: " + interestRate + "%");
        System.out.println("--------------------------");
    }
}

// Subclass 2: CheckingAccount
class CheckingAccount extends BankAccount {
    private double withdrawalLimit;

    public CheckingAccount(String accountNumber, double balance, double withdrawalLimit) {
        super(accountNumber, balance);
        this.withdrawalLimit = withdrawalLimit;
    }

    public void displayAccountType() {
        System.out.println("Account Type: Checking Account");
        displayAccountInfo();
        System.out.println("Withdrawal Limit: ₹" + withdrawalLimit);
        System.out.println("--------------------------");
    }
}

// Subclass 3: FixedDepositAccount
class FixedDepositAccount extends BankAccount {
    private int tenureMonths;
    private double interestRate;

    public FixedDepositAccount(String accountNumber, double balance, int tenureMonths, double interestRate) {
        super(accountNumber, balance);
        this.tenureMonths = tenureMonths;
        this.interestRate = interestRate;
    }

    public void displayAccountType() {
        System.out.println("Account Type: Fixed Deposit Account");
        displayAccountInfo();
        System.out.println("Tenure: " + tenureMonths + " months");
        System.out.println("Interest Rate: " + interestRate + "%");
        System.out.println("--------------------------");
    }
}

// Driver Class
public class BankAccountSystem {
    public static void main(String[] args) {
        // Create objects
        SavingsAccount sa = new SavingsAccount("SA101", 50000, 4.5);
        CheckingAccount ca = new CheckingAccount("CA102", 25000, 10000);
        FixedDepositAccount fd = new FixedDepositAccount("FD103", 100000, 12, 6.0);

        // Display account types
        sa.displayAccountType();
        ca.displayAccountType();
        fd.displayAccountType();
    }
}
