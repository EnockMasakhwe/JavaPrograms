package OOPI;
abstract class Vehicle{
    abstract void startEngine();
    abstract void stopEngine();
}
class Car extends Vehicle{

    @Override
    void startEngine() {
        System.out.println("The car is starting in a few seconds..");
    }

    @Override
    void stopEngine() {
        System.out.println("The car is stopping in a few seconds..");
    }
    
}
public class testAbstraction {

    public static void main(String[] args) {
        Car c = new Car();
        c.startEngine();
        c.stopEngine();

    }
}