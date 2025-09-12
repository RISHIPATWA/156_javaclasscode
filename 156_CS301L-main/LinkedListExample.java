import java.util.*;

public class LinkedListExample {
    public static void main(String[] args){
        LinkedList<String> employees = new LinkedList<>();
        employees.add("John"); // add at end
        employees.add(1,"Raj");  // add at index
        employees.addFirst("Vikas"); // add at beginning
        employees.addLast("Kishan"); // add at end
        System.out.println(employees);

        // access methods
        System.out.println(employees.getFirst());
        System.out.println(employees.getLast());
        System.out.println(employees.get(2));

        // set method
        employees.set(2,"Priya"); // replace at index
        System.out.println(employees);

        // Remove method
        employees.remove();
        employees.remove("Raj");
        employees.remove(1);
        employees.removeFirst();
        employees.removeLast();
        System.out.println(employees);

        // search method
        System.out.println(employees.contains("John"));
        System.out.println(employees.indexOf("Kishan"));
        System.out.println(employees.size());
        employees.clear();
        System.out.println(employees);
        
        
    }
}
