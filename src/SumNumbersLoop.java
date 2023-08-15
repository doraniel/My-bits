import java.util.Scanner;

public class SumNumbersLoop {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print
                ("Input a number to sum to: ");
        int sumTo = reader.nextInt();

        int sumTotal = 0;
        while(sumTotal <= sumTo) {
            sumTotal = sumTotal +1;
            ++1;
        }
        System.out.println("Sum of " +sumTotal+ "numbers is:"+sumTotal);

    }
}
