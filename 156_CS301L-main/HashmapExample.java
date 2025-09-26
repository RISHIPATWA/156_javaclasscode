import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
public class HashmapExample {
    public static void main(String[] args) {
        HashMap<Integer,String> map=new HashMap<>();

        map.put(1,"Tanya");
        map.put(2,"Kukku");
        map.put(3,"Neha");

        map.put(3,null);
        map.put(null,"laxmi");

        System.out.println(map);

        //traverse via key
        for(Integer k:map.keySet()){
            System.out.println(k+ " "+ map.get(k));
        }

        //traversing via value
        for(Map.Entry<Integer,String> entry:map.entrySet()){
            System.out.println(entry.getKey()+ " "+ entry.getValue());
        }

        //via iterator
        Iterator<Map.Entry<Integer,String>> it=map.entrySet().iterator();
        while(it.hasNext()){
            Map.Entry<Integer,String> entry=it.next();
            System.out.println(entry.getKey()+" "+entry.getValue());
        }
    }
}