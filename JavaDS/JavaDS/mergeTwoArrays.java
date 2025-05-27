package JavaDS;

import java.util.HashSet;

public class mergeTwoArrays{
    public static void main(String[] args) {
        int[] array1 = {1,2,3,4,5};
        int[] array2 = {3,4,5,6,7};

        HashSet<Integer> allElements = new HashSet<>();
        HashSet<Integer> duplicates = new HashSet<>();
        HashSet<Integer> seen = new HashSet<>();

        for(int i: array1){
            allElements.add(i);
            seen.add(i);
        }

        for(int j: array2){
            if(seen.contains(j)){
                duplicates.add(j);
            }
            allElements.add(j);
        }

        System.out.println("Merged Array: " + allElements);
        System.out.println("Duplicates: " + duplicates);
    }
}