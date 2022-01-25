import java.util.Hashtable;
import java.util.Scanner;

public class ZodiacSignCalculator {
    public static void main(String[] args) {
        Hashtable<Integer, String> zodiacSigns = new Hashtable<>();
        Scanner input = new Scanner(System.in);
        zodiacSigns.put(0, "Monkey");
        zodiacSigns.put(1, "Rooster");
        zodiacSigns.put(2, "Dog");
        zodiacSigns.put(3, "Pig");
        zodiacSigns.put(4, "Rat");
        zodiacSigns.put(5, "Ox");
        zodiacSigns.put(6, "Tiger");
        zodiacSigns.put(7, "Rabbit");
        zodiacSigns.put(8, "Dragon");
        zodiacSigns.put(9, "Snake");
        zodiacSigns.put(10, "Horse");
        zodiacSigns.put(11, "Sheep");
        System.out.print("Enter year: ");
        int year = input.nextInt();
        System.out.format("Zodiac sign for year %d is %s", year, zodiacSigns.get(year%12));
    }
}
