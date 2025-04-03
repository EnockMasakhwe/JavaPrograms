//This is a practice code to implement the basic java syntax, Input and Output, and variables concept

import java.util.Scanner;
public class Variables{
    @SuppressWarnings("resource")
    public static void main(String [] args){
        Scanner input = new Scanner (System.in);

        System.out.println("What is your name?");
        String name = input.nextLine();

        System.out.println("What is your Registration Number?");
        String regNo = input.nextLine();

        System.out.println("How old are you?");
        int age = input.nextInt();
        input.nextLine(); // Consume the leftover newline

        System.out.println("What is your phone number?");
        String phone = input.nextLine();

        System.out.println("Are you available on WhatsApp?");
        String answer = input.nextLine();

        System.out.println("Hello " + name + ", here are your details:");
        System.out.println("\nUser Details: ");
        System.out.println("Name: " + name);
		System.out.println("Age: " + age);
		System.out.println("Phone Number: " + phone);
        System.out.println("Registration Number: " + regNo);
        System.out.println("WhatsApp: " + answer);




    }
}
