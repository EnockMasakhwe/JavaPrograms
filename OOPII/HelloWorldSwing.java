package OOPII;

import javax.swing.*;

public class HelloWorldSwing{
    public static void main(String args []){
        JFrame frame = new JFrame("Hello World");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400,500);

        JLabel label = new JLabel("Hello World!");

        frame.add(label);
        frame.setVisible(true);
    }
}