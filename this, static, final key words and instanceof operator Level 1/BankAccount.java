class BankAccount {
    // Static variable (shared across all accounts)
    private static String bankName = "State Bank of India";
    private static int totalAccounts = 0;

    // Instance variables
    private String accountHolderName;
    private final String accountNumber;   // Final: cannot be reassigned once set
    private double balance;

    // Constructor using "this" to resolve ambiguity
    public BankAccount(String accountHolderName, String accountNumber, double balance) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;  // final assigned once
        this.balance = balance;
        totalAccounts++;
    }

    // Instance method to display account details (with instanceof check)
    public void displayAccountDetails() {
        if (this instanceof BankAccount) {   // Using instanceof
            System.out.println("Bank Name: " + bankName);
            System.out.println("Account Holder: " + accountHolderName);
            System.out.println("Account Number (final): " + accountNumber);
            System.out.println("Balance: " + balance);
        } else {
            System.out.println("Invalid account object!");
        }
    }

    // Static method to display total accounts
    public static void getTotalAccounts() {
        System.out.println("Total Accounts Created: " + totalAccounts);
    }

    // Static method to update bank name
    public static void setBankName(String name) {
        bankName = name;
    }
}

// Driver Class
public class BankAccountSystem {
    public static void main(String[] args) {
        // Create account objects
        BankAccount acc1 = new BankAccount("Akshay", "ACC1001", 5000.0);
        BankAccount acc2 = new BankAccount("Rahul", "ACC1002", 10000.0);

        // Display account details
        acc1.displayAccountDetails();
        System.out.println("-----------------------");
        acc2.displayAccountDetails();

        System.out.println("=======================");
        // Static method call
        BankAccount.getTotalAccounts();

        // Change bank name
        BankAccount.setBankName("HDFC Bank");

        System.out.println("\nAfter Changing Bank Name:");
        acc1.displayAccountDetails();
        acc2.displayAccountDetails();
    }
}
