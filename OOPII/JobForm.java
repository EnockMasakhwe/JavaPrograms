package OOPII;
import javax.swing.*;
import java.awt.*;

public class JobForm {
    public static void main(String[] args) { 
        JFrame frame = new JFrame("Job Application Form");
        frame.setLayout(new GridLayout(6, 2, 10, 10));
        
        frame.add(new JLabel("Full Name:")); frame.add(new JTextField());
        frame.add(new JLabel("Telephone:")); frame.add(new JTextField());
        
        frame.add(new JLabel("Gender:"));
        JPanel genderPanel = new JPanel();
        genderPanel.add(new JRadioButton("Male"));
        genderPanel.add(new JRadioButton("Female"));
        frame.add(genderPanel);
        
        frame.add(new JLabel("Position Applied:"));
        String[] positions = {"Developer", "Analyst", "Manager"};
        frame.add(new JComboBox<>(positions));
        
        frame.add(new JLabel("Salary:")); frame.add(new JTextField());
        
        frame.add(new JButton("Submit")); frame.add(new JButton("Reset"));
        
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
    
}