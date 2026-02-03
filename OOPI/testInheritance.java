package OOPI;
class AnimalType{
    public void makeSound(){
        System.out.println("Producing sound..");
    }
}
class Mammal extends AnimalType{
    public void giveBirth(){
        System.out.println("Giving birth..");
    }
}
class Dog extends Mammal{
    @Override
    public void makeSound(){
        System.out.println("Woof..");
    }
}

public class testInheritance{
    public static void main(String[] args) {
        AnimalType animal = new AnimalType();
        animal.makeSound();
        Mammal mammal = new Mammal();
        mammal.makeSound();
        mammal.giveBirth();
        Dog dog = new Dog();
        dog.giveBirth();
        dog.makeSound();

    }
}