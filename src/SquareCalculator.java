import java.util.Scanner;
public class SquareCalculator {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        double Width = reader.nextDouble();
        double Height = reader.nextDouble();

        System.out.println("Height is: ");
        double height = reader.nextInt();
        System.out.println(Height);
        System.out.println("Width is: ");
        double width = reader.nextInt();
        System.out.println(Width);

        double Perimeter;
        Perimeter = 2 * (Height + Width);
        System.out.println("Perimeter is: " + Perimeter);

        double area;
        area = Height * Width;
        System.out.println("Area is: " + area);


    }
}
