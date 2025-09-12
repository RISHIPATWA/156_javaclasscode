import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
public class ArrayListExample {
    public static void main(String[] args) {
    ArrayList<String> fruits = new ArrayList<String>();
    fruits.add("Apple");
    fruits.add("Banana");
    fruits.add("Orange");
    fruits.add(1, "Grapes"); // with index 1

    // print list
    System.out.println(fruits);

    // print each word in new line
    for(String s:fruits){
        System.out.println(s);
    }

    // print iterator
    Iterator itr = fruits.iterator();
    while(itr.hasNext()){
        System.out.println(itr.next());
    } 

    System.out.println(fruits.get(2)); // get element at index 2

    System.out.println(fruits.set(1,"ABC"));
    fruits.remove(3); // remove element at index 3
    System.out.println(fruits);

    System.out.println("Size of the ArrayList: " + fruits.size()); // size of the ArrayList
    

    System.out.println(fruits.contains("Apple")); //contains

    Collections.sort(fruits);
    System.out.println(fruits);

    System.out.println(Collections.binarySearch(fruits, "Apple"));

    fruits.clear(); // clear the ArrayList
    System.out.println("ArrayList after clear(): " + fruits);

    }

}
