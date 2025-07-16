public class Methods{
    static void myMethod(){
        System.out.println("Hello World!");
    }
    public void demoMethod(){
        System.out.println("Hello Hello!");
    
    }
    public static void main(String[] args) {
        myMethod();
        myMethod();
        myMethod();
        Methods otherMethod = new Methods();
        otherMethod.demoMethod();
    }
}