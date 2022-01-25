import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double interestRate;
        int numberOfYears;
        double loanAmount;
        java.util.Date date = new java.util.Date();
        Scanner input = new Scanner(System.in);
        System.out.print("Enter annual interest rate, for example 8.25: ");
        interestRate = input.nextDouble();
        System.out.print("Enter number of years as an integers: ");
        numberOfYears = input.nextInt();
        System.out.print("Enter loan amount, for example, 120000.95: ");
        loanAmount = input.nextDouble();
        Loan myLoan = new Loan(interestRate, numberOfYears, loanAmount);
        System.out.format("The loan was created on %s.\n", date);
        System.out.format("The monthly payment is $%.2f.\n", myLoan.getMonthlyPayment());
        System.out.format("The total payment is $%.2f.\n", myLoan.getTotalPayment());
    }
}
