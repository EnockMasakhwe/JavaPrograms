package OOPI;   
class Animals {
    public void eat(){
            System.out.println("All animals like eating.");
    }
}
    
class Mammals extends Animals{
    public void breastFeed(){
            System.out.println("All Mammals breast feed their young ones");
    }
}
public class singleInheritance{
    public static void main(String[] args) {
        Mammals run = new Mammals();
        run.eat();
        run.breastFeed();
    } 
}


