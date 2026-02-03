package OOPI;
class human{ 
	public void activity() {
		System.out.println("He lives.");
	}
}
class Student extends human{
	@Override
	public void activity() {
		System.out.println("He studies.");
	}
}
class Teacher extends human{
	@Override 
	public void activity() {
		System.out.println("He teaches.");
	}
}
class Customer extends human{
	@Override
	public void activity() {
		System.out.println("He shops.");
    }
}

public class polymorphism2{
	public static void main(String [] args) {
		human p;
		p = new human();
		p.activity();
		p = new Student();
		p.activity();
		p = new Teacher();
		p.activity();
		p = new Customer();
		p.activity();

	}
}

