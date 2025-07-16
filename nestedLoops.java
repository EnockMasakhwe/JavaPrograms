import java.util.Scanner;

public class nestedLoops {
    public void drawingSquare(){
        Scanner user = new Scanner(System.in);
        System.out.println("Enter the size of the square you would wish to have: ");
        int columns = user.nextInt();
        int i, j;

        for (i = 1; i < columns; i++) {
            for (j = 1; j < columns; j++) {
                System.out.print("* ");
            }
            System.out.println();
            
        }
    }
    public void drawingTriangle(){
        Scanner user = new Scanner(System.in);
        System.out.println("Enter the number of rows you would wish to have: ");
        int rows = user.nextInt();
        int i, j;

        for(i = 1; i <= rows;i++){
            for(j = 1; j <= i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public void drawingPyramid(){
        Scanner user = new Scanner(System.in);
        System.out.println("Enter the number of rows you would wish to have: ");
        int rows = user.nextInt();
        int i, j, k;

        for(i = 1; i <= rows;i++){
            for(j = i; j < rows;j++){
                System.out.print(" ");
            }
            for(k = 1; k <= (2*i-1);k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        nestedLoops output = new nestedLoops();
        output.drawingSquare();
        output.drawingTriangle();
        output.drawingPyramid();

    
    }
}

