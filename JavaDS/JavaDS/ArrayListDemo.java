package JavaDS;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListDemo{
    public static void stringArrayList(){
        ArrayList<String> myArrayList = new ArrayList<>();
        myArrayList.add("Enock");
        myArrayList.add("Faith");
        myArrayList.add("Samwel");
        myArrayList.add("Grace");

        myArrayList.set(3, "Neema");
        System.out.println(myArrayList.get(2));
        for (int i = 0; i < myArrayList.size(); i++) {
            System.out.println(myArrayList.get(i));
        }

        myArrayList.remove(0);
        myArrayList.add(0, "Eliaro");
        Collections.sort(myArrayList);

        for(String k: myArrayList){
            System.out.println(k);
        }
    }

    public static void intArrayList(){
        ArrayList<Integer> secondArrayList = new ArrayList<>(Arrays.asList(3,5,8,4,7,1,9,10));
        Collections.sort(secondArrayList);
        for(int i: secondArrayList){
            System.out.println(i);
        }
    }
    
    public static void main(String[] args) {
        intArrayList();
    }
        
}