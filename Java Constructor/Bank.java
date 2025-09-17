import java.util.Scanner;

public class Bank{
static class BankAccount {
    public int accountNumber;
    protected String accountHolder;
    private double balance;

    public BankAccount(int accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void inputDetails() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Account Number: ");
        accountNumber = sc.nextInt();
        sc.nextLine(); // consume newline
        System.out.print("Enter Account Holder Name: ");
        accountHolder = sc.nextLine();
        System.out.print("Enter Initial Balance: ");
        balance = sc.nextDouble();
    }
}

static class SavingsAccount extends BankAccount {
    public SavingsAccount(int accountNumber, String accountHolder, double balance) {
        super(accountNumber, accountHolder, balance);
    }

    public void displayAccountInfo() {
        System.out.println("Account Number: " + accountNumber); // public access
        System.out.println("Account Holder: " + accountHolder); // protected access
        System.out.println("Balance: " + getBalance()); // private via getter
    }
}

    public static void main(String[] args) {
        SavingsAccount sa = new SavingsAccount(0, "", 0.0);
        sa.inputDetails();
        sa.displayAccountInfo();
    }
}
