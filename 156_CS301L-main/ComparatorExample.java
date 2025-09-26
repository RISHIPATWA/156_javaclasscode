import java.util.*;

// Class representing a Student (no Comparable implemented)
class Student {
    String name;
    int age;
    double marks;

    // Constructor
    Student(String name, int age, double marks) {
        this.name = name;
        this.age = age;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return name + " | Age: " + age + " | Marks: " + marks;
    }
}

// Custom Comparator to sort by marks
class MarksComparator implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        return Double.compare(s2.marks, s1.marks); // descending order by marks
    }
}

public class ComparatorExample {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Alice", 22, 88.5));
        students.add(new Student("Bob", 20, 92.0));
        students.add(new Student("Charlie", 21, 85.0));

        System.out.println("=== Original List ===");
        for (Student s : students) {
            System.out.println(s);
        }

        // Sorting using Comparator (by marks)
        Collections.sort(students, new MarksComparator());
        System.out.println("\n=== Sorted by Marks (Comparator) ===");
        for (Student s : students) {
            System.out.println(s);
        }

        // Sorting using Comparator with lambda (by name)
        students.sort((s1, s2) -> s1.name.compareTo(s2.name));
        System.out.println("\n=== Sorted by Name (Lambda Comparator) ===");
        for (Student s : students) {
            System.out.println(s);
        }
    }
}