package OOPII;

public class ThreadTest {

	public static void main(String[] args) {
		Thread t1 = Thread.currentThread();
		Thread t2 = Thread.currentThread();

		t1.setName("MainThread");
		t2.setName("MainThread");

		
		System.out.println("Name of thread is " + t2);
	}

}
