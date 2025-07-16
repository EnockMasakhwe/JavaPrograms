import java.util.Scanner;

public class personalInfo{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to my personal info program :)");
        System.out.println("=".repeat(35));

        System.out.println("Enter your first name: ");
        String firstName = scanner.nextLine();

        System.out.println("Enter your lastName: ");
        String lastName = scanner.nextLine();

        System.out.println("Enter your birth year: ");
        int  birthYear = scanner.nextInt();

        System.out.println("What is your current age? ");
        int userCurrentAge = scanner.nextInt();

        System.out.println("Enter your favorite number: ");
        int favoriteNum = scanner.nextInt();

        String fullName = firstName + " " +lastName;
        System.out.println("Hey " + fullName + " , here is your personal information report.\n\n");

        int currentYear = 2025;
        int currentAge = currentYear - birthYear;
        int ageNextYear = currentAge +1;
        int squaredFav = favoriteNum*favoriteNum;
        int doubleFav = favoriteNum*favoriteNum;

        System.out.println("You were born in " + birthYear + ".");
        System.out.println("You are " + ageNextYear + " years old in 2026.");
        System.out.println("Your favorite number is " + favoriteNum + ".");
        System.out.println("Your doubled favorite number is " + doubleFav + ".");
        System.out.println("Your squared favorite number is " + squaredFav + ".\n\n");

        if(currentAge != userCurrentAge){
            System.out.println("Oups, I think you are lying about your age or there is a mixup somewhere because the calculations don't agree.");
        }else{
            System.out.println("Wow! I appreciate your honesty. The calculated age is equal to what your input.");
        }

        int numOfDays = currentAge*365;
        int numOfHours = numOfDays*24;
        System.out.println("\n\n                 Fun Calculations");
        System.out.println("=".repeat(35));
        System.out.println("You have lived " + numOfDays + " days on earth");
        System.out.println("You have lived " + numOfHours + " hours on earth");




        
    }
}