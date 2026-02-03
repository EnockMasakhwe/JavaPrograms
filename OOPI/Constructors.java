package OOPI;
public class Constructors{
    //int x = 5;
    int modelYear; 
    String modelName;

    public Constructors(int year,String name){
        //x = 25;
        modelName = name;
        modelYear = year;
    }
    public static void main(String[] args) {
        Constructors construct = new Constructors(2025,"Subaru");
        //System.out.println(construct.x);
        System.out.println("My car is of model: " + construct.modelName + " " + construct.modelYear);
    }
}