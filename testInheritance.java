class Animal{
    public void makeSound(){
        System.out.println("Producing sound..");
    }
}
class Mammal extends Animal{
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
        Animal animal = new Animal();
        animal.makeSound();
        Mammal mammal = new Mammal();
        mammal.makeSound();
        mammal.giveBirth();
        Dog dog = new Dog();
        dog.giveBirth();
        dog.makeSound();

    }
}