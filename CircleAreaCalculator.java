import java.util.Scanner;


public class CircleAreaCalculator {
    public static void main(String[] args) {
        final double PI = 3.14159;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter radius of circle: ");
        double radius = input.nextFloat();
        double area = PI * radius * radius;
        System.out.format("Area of circle is %10f\n", area);
    }
}