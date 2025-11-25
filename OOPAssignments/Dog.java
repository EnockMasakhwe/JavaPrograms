package OOPAssignments;

public class Dog {
    private String name;
    private String breed;

    public Dog(String name, String breed) {
        this.name = name;
        this.breed = breed;
    }

    public String getName() {
        return name;
    }
    public String getBreed() {
        return breed;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setBreed(String breed) {
        this.breed = breed;
    }   
    
    public static void main(String[] args) {
        System.out.println("==== Dog Details ====");
        Dog dog1 = new Dog("Buddy", "Bulldog");
        Dog dog2 = new Dog("Max", "German Shepherd");

        dog1.setName("Charlie");
        dog1.setBreed("Beagle");
        dog2.setName("Simba");
        dog2.setBreed("Labrador Retriever");


        System.out.println("Name: " + dog1.getName());
        System.out.println("Breed: " + dog1.getBreed());

        System.out.println("\nName: " + dog2.getName());
        System.out.println("Breed: " + dog2.getBreed());
    }
    
}