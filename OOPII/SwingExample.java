package OOPII;
import javax.swing.JButton;
import javax.swing.JFrame;

public class SwingExample {
	public static void main(String[] args) {
		JFrame frame = new JFrame("I am not alone");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(300, 300);
		
		JButton button1 = new JButton("Button 1");
		JButton button2 = new JButton("Button 2");
		
		frame.add(button1);
		frame.add(button2);
		frame.setVisible(true);
	}
}