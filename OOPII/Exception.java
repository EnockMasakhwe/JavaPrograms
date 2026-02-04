package OOPII;

class Ex {
	
	void display() {
		try {
			int a = 5/0;
		}
		
		catch(ArithmeticException e) {
			System.out.println(e);
		}
		
		
		//int a = 5/0; System.out.println("Exception handled!");
		 
	}
}

public class Exception{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ex obj = new Ex();
		obj.display();
	}

}
