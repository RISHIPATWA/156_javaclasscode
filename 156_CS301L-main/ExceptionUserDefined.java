class InvalidEmployeeId extends Exception {
    public InvalidEmployeeId(String message) {
        super(message);
    }

}
class Emp_inyee{
    int empid;
    String name;

    Emp_inyee(int empid, String name) throws InvalidEmployeeId {
        if (empid <= 0) {
            throw new InvalidEmployeeId("Invalid Employee ID");
        }
        this.empid = empid;
        this.name = name;
        System.out.println("Employee created: " + this.name);
    }
}
//Tester Class
public class ExceptionUserDefined {
    public static void main(String[] args) {
        try {
            Emp_inyee emp1 = new Emp_inyee(101, "Alice");
            Emp_inyee emp2 = new Emp_inyee(-5, "Bob"); // This will throw an exception
        } catch (InvalidEmployeeId e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}