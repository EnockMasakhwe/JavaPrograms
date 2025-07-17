package JavaDS;

import java.util.Arrays;
import java.util.HashSet;

public class HashSetDemo{
    public static void main(String[] args) {
        HashSet<Integer> myHashSet = new HashSet<>(Arrays.asList(23,34,54,23,67,80,98,67,34,54,90));
        for(int i: myHashSet){
            System.out.println(i);
        }
        int[] myArray = {5,3,7,8,9,2,4,5,3,7,8,9,6,1,4};
        HashSet<Integer> unique = new HashSet<>();
        HashSet<Integer> duplicates = new HashSet<>();

        for(int i: myArray){
            if(!unique.add(i)){
                duplicates.add(i);
            }
        }
        System.out.println("Unique: " + unique);
        System.out.println("Duplicates: " + duplicates);
    }
}