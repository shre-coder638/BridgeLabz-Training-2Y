package bankingsystem;


class SavingsLoan implements Loanable {
 private String loanPolicyNumber;

 public SavingsLoan(String loanPolicyNumber) {
     this.loanPolicyNumber = loanPolicyNumber;
 }

 @Override
 public boolean applyForLoan(double amount) {
     System.out.println("Loan application submitted for Savings Account: " + amount);
     return amount <= 100000;
 }

 @Override
 public double calculateLoanEligibility(double balance) {
     return balance * 2; 
 }

 public String getLoanDetails() {
     return "Savings Loan Policy: " + loanPolicyNumber;
 }
}

class CurrentLoan implements Loanable {
 private String loanPolicyNumber;

 public CurrentLoan(String loanPolicyNumber) {
     this.loanPolicyNumber = loanPolicyNumber;
 }

 @Override
 public boolean applyForLoan(double amount) {
     System.out.println("Loan application submitted for Current Account: " + amount);
     return amount <= 200000;
 }

 @Override
 public double calculateLoanEligibility(double balance) {
     return balance * 3;
 }

 public String getLoanDetails() {
     return "Current Loan Policy: " + loanPolicyNumber;
 }
}
