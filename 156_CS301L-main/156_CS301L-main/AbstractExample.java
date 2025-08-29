abstract class college{
    abstract void Register();
    abstract void Infrastructure();
    abstract void Student();
    abstract void Staff();
    void medicalFacility();{

        System.out.println("Medical Facility are optional");
    }
}
    class KIET extends college{
        void Register(){
            System.out.println("Registeration done");
        }
        void Infrastructure(){
            System.out.println("Good Infrastructure");
        }
        void Student(){
            System.out.println("Student are good");
        }
        void Staff(){
            System.out.println("Staff are well educated");
        }
        void medicalFacility(){
            System.out.println("Medical Facility are available");
        }
    }


public class AbstractExample {
    
    public static void main(String[] args) {
        college c = new KIET();
        c.Register();
        c.Infrastructure();
        c.Student();
        c.Staff();
        c.medicalFacility();
    }
}
