package OOPI;
import java.util.LinkedList;

public class LinkedListDemo{
   public static void main(String[] args) {
       LinkedList<Integer> myLinkedList = new LinkedList<>();
       myLinkedList.add(3);
       myLinkedList.addFirst(2);
       myLinkedList.addLast(4);

       for(int i: myLinkedList){
        System.out.println(i);
       }
   } 
}