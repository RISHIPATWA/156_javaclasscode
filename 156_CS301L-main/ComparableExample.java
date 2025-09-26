import java.util.*;

// Class representing a Student implementing Comparable
class Student implements Comparable<Student> {
    String name;
    int age;
    double marks;

    // Constructor
    Student(String name, int age, double marks) {
        this.name = name;
        this.age = age;
        this.marks = marks;
    }

    // Natural ordering by age (Comparable)
    @Override
    public int compareTo(Student other) {
        return this.age - other.age; // ascending order by age
    }

    @Override
    public String toString() {
        return name + " | Age: " + age + " | Marks: " + marks;
    }
}

public class ComparableExample {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Alice", 22, 88.5));
        students.add(new Student("Bob", 20, 92.0));
        students.add(new Student("Charlie", 21, 85.0));

        System.out.println("=== Original List ===");
        for (Student s : students) {
            System.out.println(s);
        }

        // Sorting using Comparable (natural order: by age)
        Collections.sort(students);

        System.out.println("\n=== Sorted by Age (Comparable) ===");
        for (Student s : students) {
            System.out.println(s);
        }
    }
}