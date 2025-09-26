import java.util.Hashtable;
public class HashTableDEmo {
    public static void main(String[] args) {
        Hashtable<Integer,String> table=new Hashtable<>();

        table.put(1, "abc");
        table.put(2, "xyz");
        table.put(3, null);
        //if key same then overwrite  hongi values
        System.out.println(table);
        //only put when no such key is there
        System.out.println(table.putIfAbsent(4, "fyv"));

        
    }
}