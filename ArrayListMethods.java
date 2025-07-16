import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListMethods {

    public static void main(String[] args) {
        //Putting elements one by one
        List <Integer> grades = new ArrayList<>();
        grades.add(3);
        grades.add(5);
        grades.add(4);
        grades.add(3, 6);
        System.out.println(grades.get(2));
        //Putting elements all at once
        List <Integer> marks = Arrays.asList(0,1,2,7,8,9);
        System.out.println(marks);
        //Working with a 2D list
        List <List<Integer>> students = new ArrayList<>();
        
        students.add(Arrays.asList(1,2,3,4,5)); 
        students.add(Arrays.asList(1,4,2,3,5));
        students.add(Arrays.asList(3,4,5,6,7));
        
        for (List<Integer> student : students) {
            System.out.print(student);
            System.out.println();
        }

    }
}