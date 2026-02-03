package OOPII;

import javax.swing.*;

public class WaterCalc {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Water Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);
        frame.setLayout(null);

        JLabel label1 = new JLabel("How much water should I take?");
        JLabel label2 = new JLabel("Enter your weight");
        JTextField weightField = new JTextField();
        JButton calcBtn = new JButton("Calculate");

        label1.setBounds(50, 20, 200, 30);
        label2.setBounds(50, 50, 150, 30);
        weightField.setBounds(180, 50, 50, 30);
        calcBtn.setBounds(100, 90, 100, 30);

        calcBtn.addActionListener(e -> {
            JOptionPane.showMessageDialog(frame, "You should drink 2.6 L a day");
        });

        frame.add(label1); frame.add(label2); frame.add(weightField); frame.add(calcBtn);
        frame.setVisible(true);
    }
}