package OOPII;

interface WaterBottleInterface{
	String color = "Blue";
	void fillUp();
	void pourOut();
}

public class WaterBottle implements WaterBottleInterface {
	public static void main(String[] args) {
		System.out.println(color);
		
		WaterBottle bottle = new WaterBottle();
		bottle.fillUp();
	}
	
	@Override
	public void fillUp() {
		System.out.println("It is filled up.");
		
	}

	@Override
	public void pourOut() {
		System.out.println("Poured out.");
		
	}

}
