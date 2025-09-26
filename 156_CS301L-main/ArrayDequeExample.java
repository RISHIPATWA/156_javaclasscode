import java.util.ArrayDeque;
public class ArrayDequeExample {
    public static void main(String[] args) {
        ArrayDeque<Integer> ad=new ArrayDeque<>();

       ad.add(30);
       ad.addFirst(10);
       ad.addLast(20);

       ad.offer(40);//adds at end safely
       ad.offerFirst(30);
       ad.offerLast(50);
       //null return krdega add terminate
       
       //acess
       System.out.println(ad.peek());
       System.out.println(ad.peekFirst());
       System.out.println(ad.peekLast());

       //remove
       System.out.println(ad.removeFirst());
       System.out.println(ad.removeLast());
       System.out.println(ad.pollFirst());
       System.out.println(ad.pollLast());

       System.out.println(ad);

       


    }
}   