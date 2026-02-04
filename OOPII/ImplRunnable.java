package OOPII;

public class ImplRunnable implements Runnable{

	@Override
	public void run() {
		System.out.println("Thread is running...");
	}
	
	public static void main(String[] args) {
		ImplRunnable m1 = new ImplRunnable();
		Thread t1 = new Thread(m1);
		t1.start();
	}

}
