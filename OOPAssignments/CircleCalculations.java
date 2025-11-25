package OOPAssignments;

public class CircleCalculations {

    private double radius;

    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    public double calculateCircumference() {
        return 2 * Math.PI * radius;
    }

    public static void main(String[] args) {
        CircleCalculations circle = new CircleCalculations();
        circle.setRadius(7.0);

        double area = circle.calculateArea();
        double circumference = circle.calculateCircumference();

        System.out.println("==== Circle Calculations ====");
        System.out.printf("The area of the circle is: %.2f%n", area);
        System.out.printf("The circumference of the circle is: %.2f%n", circumference);
    }
}