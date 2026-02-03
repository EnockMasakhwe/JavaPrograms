package OOPI;
abstract class Animal{
    abstract void makeSound();
}
class dog extends Animal{
    public void makeSound(){
        System.out.println("Dog barks!");
    }
}
class cat extends Animal{
    public void makeSound(){
        System.out.println("Cat meaows!");
    }
}
public class animalSoundPolymorphism{
    public static void main(String[] args) {
       dog D = new dog();
       D.makeSound(); 
       cat C = new cat();
       C.makeSound();
    }
}

