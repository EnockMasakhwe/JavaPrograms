import java.util.Scanner;
class Shape{
    public double calculateArea(){
        double area = 0;
        System.out.println("Calculating area..");
        System.out.println(area);
        return area;
    }
}
class Circle extends Shape{
    @Override
    public double calculateArea(){

        Scanner radius = new Scanner(System.in);
        System.out.println("Enter the radius of the circle: ");
        float r = radius.nextFloat();
        double area = Math.PI*r*r;
        System.out.println("Calculating area..");
        System.out.println(area);
        return area;
    }
}
class Rectangle extends Shape{
    @Override
    public double calculateArea(){
        Scanner dimensions = new Scanner(System.in);
        System.out.println("Enter the length of the rectangle: ");
        float length = dimensions.nextFloat();
        System.out.println("Enter the width of the rectangle: ");
        float width = dimensions.nextFloat();
        double area = length*width;
        System.out.println("Calculating area..");
        System.out.println(area);
        return area;
    }
}
class Triangle extends Shape{
    @Override
    public double calculateArea(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the base of the triangle: ");
        float base = input.nextFloat();
        System.out.println("Enter the height of the triangle: ");
        float height = input.nextFloat();
        double area = 0.5*base*height;
        System.out.println("Calculating area..");
        System.out.println(area);
        return area;
    }
}
public class testPolymorphism {

    public static void main(String[] args) {
        Shape s;
        s = new Shape();
        s.calculateArea();
        s = new Circle();
        s.calculateArea();
        s = new Rectangle();
        s.calculateArea();
        s = new Triangle();
        s.calculateArea();

    }
}
