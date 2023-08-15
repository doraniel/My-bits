import java.util.Scanner;

public class TimesTable {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the size of the times table: ");
        int size = input.nextInt();

        // Create the times table
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= size; j++) {
                System.out.printf("%-4d", i * j); // Use printf to format output
            }
            System.out.println(); // Move to next line after each row
        }

        input.close();
    }
}
