import java.util.Arrays;
import java.util.Scanner;

public class TableGame {

    private static Scanner scanner;

    public static void main(String[] args) {

        printMessage("Enter how many numbers you want to have in your table: ");
        scanner = new Scanner(System.in);
        int sizeTable = getNumber();
        int[] numbersInTable = new int[sizeTable];
        printMessage("Please enter numbers to your table: ");

        for (int i = 0; i < sizeTable; i++) addToTable(numbersInTable, i);
        printMessage("The biggest value in your table is: " + Arrays.stream(numbersInTable).max().getAsInt());
        printMessage("Yours table avg value is: " + Arrays.stream(numbersInTable).average().getAsDouble());
    }

    private static void addToTable(int[] numbers, int i) {
        {
            int numbersFromUser = getNumber();
            numbers[i] = numbersFromUser;
        }
    }

    public static int getNumber() {

        scanner = new Scanner(System.in);
        while (!scanner.hasNextInt()) {
            printMessage("This is not a number! Please try again:");
            scanner.nextLine();
        }
        return scanner.nextInt();
    }

    private static void printMessage(String x) {
        System.out.println(x);
    }
}
