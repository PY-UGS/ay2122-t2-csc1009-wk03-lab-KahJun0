import java.lang.Math;

public class Loan {
    private double annualInterestRate;
    private int numberOfYears;
    private double loanAmount;
    private java.util.Date loanDate = new java.util.Date();

    public Loan(double annualIR, int noYrs, double loanAmt) {
        this.annualInterestRate = annualIR;
        this.numberOfYears = noYrs;
        this.loanAmount = loanAmt;
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
        this.annualInterestRate = interestRate;
    }

    public void setNumberOfYears(int numberOfYears) {
        this.numberOfYears = numberOfYears;
    }

    public void setLoanAmount(double loanAmount) {
        this.loanAmount = loanAmount;
    }

    public double getMonthlyPayment() {
        double monthlyInterestRate = this.annualInterestRate/12/100;
        return ((this.loanAmount * monthlyInterestRate) / (1 - Math.pow((1+monthlyInterestRate), this.numberOfYears*12*-1)));
    }

    public double getTotalPayment() {
        return getMonthlyPayment() * this.numberOfYears * 12;
    }
}

