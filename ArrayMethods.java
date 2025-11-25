import java.util.Arrays;
import java.util.Scanner;


public class ArrayMethods {

    public static void main(String[] args) {
        Scanner getInput = new Scanner(System.in);

        System.out.println("Enter the size of the array you would like to construct: ");
        int size = getInput.nextInt();
        System.out.println("Enter " + size + " numbers to be stored in the array");

        int[] myArray = new int[size];
        for(int i = 0;i < size;i++){
            int values = getInput.nextInt();
            myArray[i] = values;
        }

        //Sorting methods
        Arrays.sort(myArray);
        Arrays.parallelSort(myArray);
        //Comparing two equal arrays
        int[] secondArray = {2,5,3,8,12,45,62};
        if (Arrays.equals(myArray, secondArray)){
            System.out.println("The two arrays are equal!");
        }else{
            System.out.println("The two arrays are not equal.");
        }

        System.out.println(Arrays.toString(myArray));
        getInput.close();
    }
}