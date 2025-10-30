package bankingsystem;

import java.util.ArrayList;

public class Main {

public static void processAccounts(ArrayList<BankAccount> accounts) {
     System.out.println("\n=== BANK ACCOUNT SUMMARY ===");

     for (BankAccount acc : accounts) {
         acc.displayAccountDetails();
         double interest = acc.calculateInterest();

         Loanable loanHandler = null;
         String loanDetails = "No loan policy available";

         if (acc instanceof SavingsAccount) {
             loanHandler = new SavingsLoan("SL-101");
             loanDetails = ((SavingsLoan) loanHandler).getLoanDetails();
         } else if (acc instanceof CurrentAccount) {
             loanHandler = new CurrentLoan("CL-202");
             loanDetails = ((CurrentLoan) loanHandler).getLoanDetails();
         }

         double eligibility = 0;
         if (loanHandler != null) {
             eligibility = loanHandler.calculateLoanEligibility(acc.getBalance());
         }

         System.out.println("Calculated Interest: " + interest);
         System.out.println("Loan Details: " + loanDetails);
         System.out.println("Loan Eligibility: " + eligibility);
     }
 }

 public static void main(String[] args) {
     ArrayList<BankAccount> accounts = new ArrayList<>();

     SavingsAccount sa = new SavingsAccount("SAV123", "Alice", 50000, 5);
     CurrentAccount ca = new CurrentAccount("CUR456", "Bob", 100000, 20000);

     sa.deposit(2000);
     ca.withdraw(5000);

     accounts.add(sa);
     accounts.add(ca);

     processAccounts(accounts);
 }
}
