import java.util.Scanner;
class Person{
    private String name;
    private int age;

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age = age;
    }
}
public class personEncapsulation{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Person P = new Person();
        System.out.println("Enter your name: ");
        String Name = input.nextLine();
        P.setName(Name);
        System.out.println("Enter your age: ");
        int Age = input.nextInt();
        P.setAge(Age);
        
        System.out.println("My name is " + P.getName() + " and I am " + P.getAge() + " years old.");
    }
}