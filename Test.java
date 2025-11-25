import java.util.Scanner;
import java.util.Arrays;

public class Test {

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.println("Enter the length/size of the array: ");
        int size = userInput.nextInt();
        
        int[] array = new int[size];
        System.out.println("Enter " + size + " random elements of the array: ");
        
        for(int i=0;i<size;i++){
            int values = userInput.nextInt();
            array[i] = values;
        }
        System.out.println("Your unsorted array: " + Arrays.toString(array));
        Arrays.sort(array);
        System.out.println("Your sorted array: " + Arrays.toString(array));

        userInput.close();  
    }

}