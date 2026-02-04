package OOPII;

interface PaymentMethod{
	void pay (double amount);
}

class MpesaPayment implements PaymentMethod{

	@Override
	public void pay(double amount) {
		System.out.println("Pay " + amount + " via Mpesa.");
	}
}

class CreditCardPayment implements PaymentMethod{

	@Override
	public void pay(double amount) {
		System.out.println("Pay " + amount + " using credit card.");
	}	
}

public class Payment {
	public static void main(String[] args) {
		PaymentMethod mpesaPayment = new MpesaPayment();
		mpesaPayment.pay(500.0);
		
		PaymentMethod cardPayment = new CreditCardPayment();
		cardPayment.pay(500.0);
		
	}
}
