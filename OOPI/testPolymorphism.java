package OOPI;
import java.util.Scanner;

class Shapes{
    public double calculateArea(){
        double area = 0;
        System.out.println("Calculating area..");
        System.out.println(area);
        return area;
    }
}
class Circles extends Shapes{
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
class Rectangles extends Shapes{
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
class Triangles extends Shapes{
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
        Shapes s;
        s = new Shapes();
        s.calculateArea();
        s = new Circles();
        s.calculateArea();
        s = new Rectangles();
        s.calculateArea();
        s = new Triangles();
        s.calculateArea();

    }
}
