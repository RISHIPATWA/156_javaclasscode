interface Institude{
    void Register();
    void Infrastructure();
    void Student();
    void Staff();
   
    static void staticConcrete(){
        System.out.println("This is static concrete method in interface");
    }
    default void defConcrete(){
        privateConcrete();
        System.out.println("This is default concrete method in interface");
    }
    private void privateConcrete(){
        System.out.println("This is private concrete method in interface");
    }
}
class ABES implements Institude{
    public void Register(){
            System.out.println("Registeration done");
    }
    public void Infrastructure(){
            System.out.println("Good Infrastructure");
    }
    public void Student(){
            System.out.println("Student are good");
    }
    public void Staff(){
            System.out.println("Staff are well educated");
    }

}

public class InterfaceExample {
    public static void main(String[] args) {
        Institude ii;
        ii  = new ABES();
        ii.Register();
        ii.Infrastructure();
        ii.Student();
        ii.Staff();
        ii.defConcrete(); // default concrete method will be called by object
        Institude.staticConcrete(); //will be called directly by interface name
    }
}
