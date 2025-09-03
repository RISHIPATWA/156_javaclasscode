class Example {
    int salary;

    Example(int salary) throws IllegalArgumentException {
        if (salary <= 0) {
            throw new IllegalArgumentException("salary cannot be negative");
        }
        this.salary = salary;
        System.out.println(salary);
    }
}

public class Throws {
    public static void main(String[] args) {
        try {
            Example e = new Example(12000);
        } catch (IllegalArgumentException e1) {
            System.out.println(e1);

        }

    }

}