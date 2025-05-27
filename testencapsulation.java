class Student{
    private int Age;
    private String firstName;
    private String lastName;

    public String getfirstName(){
        return firstName;
    }
    public String getlastName(){
        return lastName;
    }
    public int getAge(){
        return Age;
    }

    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    public void setAge(int Age){
        this.Age = Age;
    }
}

public class testEncapsulation{
    public static void main(String[] args) {
        Student student = new Student();
        student.setAge(20);
        student.setFirstName("Enock");
        student.setLastName("Eliaro");

        System.out.println("My name is " + student.getfirstName() + " " + student.getlastName() + ".");
        System.out.println("I am " + student.getAge() + " years old.");
    }
}