public class CircleCalculator {
    public static void main(String[] args) {
        double circleRadius;
        circleRadius = 12;
        System.out.println("Radius is: " + circleRadius);

        double circleDiameter;
        circleDiameter = 2 * circleRadius;
        System.out.println("Diameter is:" + circleDiameter);

        double circleCircumference;
        circleCircumference = circleDiameter * 3.14;
        System.out.println("Circumference is: " + circleCircumference);

        double circleArea;
        circleArea = 3.14 * (circleRadius * circleRadius);
        System.out.println("Area is: " + circleArea);
    }
}
