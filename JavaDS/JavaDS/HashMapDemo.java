package JavaDS;

import java.util.HashMap;

public class HashMapDemo{
    public static void main(String[] args) {
        HashMap<String, Integer> myHashMap = new HashMap<>();
        myHashMap.put("Eliaro",20);
        myHashMap.put("Ombindi", 26);
        myHashMap.put("Esekon", 32);
        myHashMap.put("Nande",30);
        myHashMap.put("Inda",34);
        myHashMap.put("Tuwei",25);

        for(String i: myHashMap.keySet()){
            System.out.println("Key: " + i + ", Value: " + myHashMap.get(i));
        }
    }
}