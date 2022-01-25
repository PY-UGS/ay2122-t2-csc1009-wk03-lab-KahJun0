import java.util.Scanner;

public class AverageCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter 3 numbers: ");
        double firstNumber = input.nextDouble();
        double secondNumber = input.nextDouble();
        double thirdNumber = input.nextDouble();
        double average = (firstNumber + secondNumber + thirdNumber)/3;
        System.out.format("The average of the 3 numbers (%.1f, %.1f, %.1f) is %.1f",firstNumber, secondNumber, thirdNumber, average);
    }
}
