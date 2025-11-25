package OOPAssignments;

import java.util.Scanner;

public class RectangleCalculations {
    int length;
    int width;

   Scanner scanner = new Scanner(System.in);

    public void inputDimensions() {
        System.out.print("Enter length of the rectangle: ");
        length = scanner.nextInt();
        System.out.print("Enter width of the rectangle: ");
        width = scanner.nextInt();
    }

    public int calculateArea() {
        return length * width;
    }
    public int calculatePerimeter() {
        return 2 * (length + width);
    }

    public static void main(String[] args) {
        RectangleCalculations rectangle = new RectangleCalculations();
        rectangle.inputDimensions();
        int area = rectangle.calculateArea();
        int perimeter = rectangle.calculatePerimeter();

        System.out.println("\n==== Rectangle Calculations ====");
        System.out.println("The perimeter of the rectangle is: " + perimeter);
        System.out.println("The area of the rectangle is: " + area);
    }
    
}