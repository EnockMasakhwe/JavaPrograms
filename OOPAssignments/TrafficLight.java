package OOPAssignments;

import java.util.Scanner;

public class TrafficLight {
    String color;
    int duration; // in seconds

    public TrafficLight(String color, int duration) {
        this.color = color;
        this.duration = duration;
    }

    public void changeColor(String newColor){
        this.color = newColor;
        System.out.println("\nTraffic light changed to " + newColor);
    }

    public void checkRed(){
        if(this.color.equalsIgnoreCase("Red")){
            System.out.println("\nStop! The light is Red.");
        }
    }

    public void checkGreen(){
        if(this.color.equalsIgnoreCase("Green")){
            System.out.println("\nGo! The light is Green.");
        }
    }

    public void checkYellow(){
        if(this.color.equalsIgnoreCase("Yellow")){
            System.out.println("\nCaution! The light is Yellow.");
        }
    }

    public void displayInfo(){
        System.out.println("\nCurrent Light Color: " + this.color);
        System.out.println("Duration: " + this.duration + " seconds");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\nEnter initial color of the traffic light (Red/Green/Yellow): ");
        String initialColor = scanner.nextLine();
        System.out.println("Enter duration for the light (in seconds): ");
        int duration = scanner.nextInt();
        scanner.nextLine();

        TrafficLight trafficLight = new TrafficLight(initialColor, duration);

        do {
            System.out.println("\n==== Traffic Light Menu ====");
            System.out.println("1. Change Light Color");
            System.out.println("2. Check if Red");
            System.out.println("3. Check if Green");
            System.out.println("4. Check if Yellow");
            System.out.println("5. Display Light Info");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("\nEnter new color (Red/Green/Yellow): ");
                    String newColor = scanner.nextLine();
                    trafficLight.changeColor(newColor);
                    break;
                case 2:
                    trafficLight.checkRed();
                    break;
                case 3:
                    trafficLight.checkGreen();
                    break;
                case 4:
                    trafficLight.checkYellow();
                    break;
                case 5:
                    trafficLight.displayInfo();
                    break;
                case 6:
                    System.out.println("\nExiting...");
                    break;
                default:
                    System.out.println("\nInvalid choice. Please try again.");
            }
            
        } while (true);

    
    }
}