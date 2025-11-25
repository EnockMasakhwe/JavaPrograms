package OOPAssignments;

public class Person {

    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args) {
        System.out.println("==== Person Details ====");
        Person person1 = new Person("Kylian Mbappe", 26);
        System.out.println("Name: " + person1.name);
        System.out.println("Age: " + person1.age);


        Person person2 = new Person("Erling Haaland", 23);
        System.out.println("\nName: " + person2.name);
        System.out.println("Age: " + person2.age);
    }
}