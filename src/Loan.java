import java.lang.Math;

public class Loan {
    private double annualInterestRate;
    private int numberOfYears;
    private double loanAmount;
    private java.util.Date loanDate;

    public Loan(double annualIR, int noYrs, double loanAmt) {
        annualInterestRate = annualIR;
        numberOfYears = noYrs;
        loanAmount = loanAmt;
        loanDate = new java.util.Date();
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public int getNumberOfYears() {
        return numberOfYears;
    }

    public double getLoanAmount() {
        return loanAmount;
    }

    public java.util.Date getLoanDate() {
        return loanDate;
    }

    public void setAnnualInterestRate(double interestRate) {
        annualInterestRate = interestRate;
    }

    public void setNumberOfYears(int numOfYears) {
        numberOfYears = numOfYears;
    }

    public void setLoanAmount(double loanAmt) {
        loanAmount = loanAmt;
    }

    public double getMonthlyPayment() {
        double monthlyInterestRate = annualInterestRate/12/100;
        return ((loanAmount * monthlyInterestRate) / (1 - Math.pow((1+monthlyInterestRate), numberOfYears*12*-1)));
    }

    public double getTotalPayment() {
        return getMonthlyPayment() * numberOfYears * 12;
    }
}

