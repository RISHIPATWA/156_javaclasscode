import java.util.HashSet;
import java.util.LinkedHashSet;
public class LinkedHashSetExample {
    public static void main(String[] args) {
        LinkedHashSet<Integer> set=new LinkedHashSet<>();

    //add
    set.add(1);
    set.add(2);
    set.add(3);
    System.out.println(set);
       
    LinkedHashSet<Integer> set2=new LinkedHashSet<>();
    set2.add(1);
    set2.add(2);
    set2.add(7);
    set2.add(9);
    System.out.println(set2);
            
    set2.addAll(set);
    System.out.println(set2);

    set2.removeAll(set);
    System.out.println(set2);

    set2.retainAll(set);
    System.out.println(set2);
    }
}