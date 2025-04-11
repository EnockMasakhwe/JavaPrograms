class Person {
	public void activity() {
		System.out.println("He lives.");
	}
}
class Student extends Person{
	@Override
	public void activity() {
		System.out.println("He studies.");
	}
}
class Teacher extends Person{
	@Override 
	public void activity() {
		System.out.println("He teaches.");
	}
}
class Customer extends Person{
	@Override
	public void activity() {
		System.out.println("He shops.");
    }
}

public class polymorphism2{
	public static void main(String [] args) {
		Person p;
		p = new Person();
		p.activity();
		p = new Student();
		p.activity();
		p = new Teacher();
		p.activity();
		p = new Customer();
		p.activity();

	}
}

