class employeePoly{
    String emp_name;
    void details(){
        System.out.println("Name: " + emp_name);
    }
    void details(int salary){
        System.out.println("Salary: " + salary);
    }
    void details(String company){
        System.out.println("Company: " + company);
    }
}  
class Faculty extends employeePoly{
    void details(){
        super.details();
        System.out.println("Welcome Faculty: ");
    }
}

public class Polymorphism {
    public static void main(String[] args) {
        // employeePoly emp = new employeePoly();
        // emp.emp_name = "John Doe";
        // emp.details();
        // emp.details(50000);
        // emp.details("KIET");
        Faculty f1=new Faculty();
        f1.emp_name = "Dr. Smith";
        f1.details();
    }
}