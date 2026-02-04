package OOPII;

public class TestMultipleCatchBlock {

	public static void main(String[] args) {
		try {
			int[] a = new int [5];
			a[5] = 30/0;
		}catch(ArithmeticException e){
			System.out.println("Task one is completed");
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Task two is completed");
		}catch(Exception e){
			System.out.println("Common task completed");
		}
		
		System.out.println("Rest of the code...");
	}
	

}
