package bankingsystem;

interface Loanable {
    boolean applyForLoan(double amount);
    double calculateLoanEligibility(double balance);
}