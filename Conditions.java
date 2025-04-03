import java.util.Scanner;

public class Conditions{
    //If statements
    public void checkMember1(){
        System.out.println("Hey, What's your name? ");

        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        if(name.equals("Enock")||name.equals("Faith")||name.equals("Grace")||name.equals("Samuel")){
            System.out.println("Wow! You are a member of the Masakhwe's family \n");
        }else{
            System.out.println("Oups! You don't belong to the Masakhwe's family. \n");
        }
    }
    //While loop
    public void checkMember2(){
        System.out.println("Hey, What's your name? ");
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        while(!name.equals("Enock")){
            System.out.println("Oups! You don't belong to the Masakhwe's family. ");
            System.out.println("\nHey, What's your name? ");
            name = input.nextLine();

        }
        System.out.println("Wow! You are a member of the Masakhwe's family \n");
    }
    //Do While loop
    public void checkMember3(){
        System.out.println("Hey, What's your name? ");
        Scanner input = new Scanner(System.in);
        String name;
        do { 
            System.out.println("Oups! You don't belong to the Masakhwe's family. ");
            System.out.println("\nHey, What's your name? ");
            name = input.nextLine(); 
        } while (!name.equals("Enock"));
        System.out.println("Wow! You are a member of the Masakhwe's family \n");
    }
    //For loop (Using numbers)
    public void checkMember4(){
        System.out.println("Hey, How old are you? ");
        Scanner input = new Scanner(System.in);
        int age = input.nextInt();
        System.out.println("The following have been your age since you were born: ");
        for(int i = 0;i<=age;i++){
            System.out.println(i + " Years");
        }

    }
    //Switch
    public void checkMember5(){
        System.out.println("Hey, How old are you? ");
        Scanner input = new Scanner(System.in);
        int age = input.nextInt();
        System.out.println("Let's find out if your current age is lucky...\n");

        switch (age) {
            case 10:
            case 20:
            case 30:
            case 40:
            case 50:
                System.out.println("Congratulations! Your current age is lucky! ");
                break;
            default:
                System.out.println("Oups! You're not in the lucky age. ");
        }
    }

    public static void main(String [] args){
        Conditions family = new Conditions();
        family.checkMember5();
    }
}