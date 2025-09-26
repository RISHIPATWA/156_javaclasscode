import java.util.HashSet;
public class HashSetExample {

    public static void main(String[] args) {
        HashSet<Integer> set=new HashSet<>();

        //add
        set.add(1);
        set.add(2);
        set.add(3);

        System.out.println(set);
        
        HashSet<Integer> set2=new HashSet<>();
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