package OOPII;
import javax.swing.*;
// import java.awt.*;
// import java.awt.event.*;

public class ComprehensiveSwingDemo {
    public static void main(String[] args) {
        // 1. Create the Frame
        JFrame frame = new JFrame("Master Swing Example");
        frame.setSize(400, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // 2. Create a Panel with a Layout
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        // 3. Add Components
        panel.add(new JLabel("Full Name:"));
        JTextField nameField = new JTextField();
        panel.add(nameField);

        panel.add(new JLabel("Gender:"));
        JRadioButton r1 = new JRadioButton("Male");
        JRadioButton r2 = new JRadioButton("Female");
        ButtonGroup bg = new ButtonGroup();
        bg.add(r1); bg.add(r2);
        panel.add(r1); panel.add(r2);

        panel.add(new JLabel("Course:"));
        String[] courses = {"Computer Science", "Finance", "Mathematics"};
        JComboBox<String> courseBox = new JComboBox<>(courses);
        panel.add(courseBox);

        JCheckBox agreeCheck = new JCheckBox("I agree to the terms");
        panel.add(agreeCheck);

        JButton submitBtn = new JButton("Submit Form");
        panel.add(submitBtn);

        JTextArea outputArea = new JTextArea(5, 20);
        panel.add(new JScrollPane(outputArea));

        // 4. Action Listener
        submitBtn.addActionListener(e -> {
            String data = "Name: " + nameField.getText() + "\n" +
                         "Course: " + courseBox.getSelectedItem() + "\n" +
                         "Agreed: " + agreeCheck.isSelected();
            outputArea.setText(data);
        });

        // 5. Finalize
        frame.add(panel);
        frame.setVisible(true);
    }
}