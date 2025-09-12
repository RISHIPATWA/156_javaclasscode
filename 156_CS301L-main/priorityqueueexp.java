import java.util.PriorityQueue;
public class priorityqueueexp {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq=new PriorityQueue<>();

        pq.add(30);
        pq.add(10);
        pq.add(20);
        //min heap in background

        System.out.println("Queue : "+pq);
        //order is acc to min heap not in order we added to qp

        System.out.println("added using offer: "+pq.offer(25));
        //can be added or not when not when capacity is full or restriction mostly true
        

        //delete and print root element
        //if empty return NULL
        System.out.println("Deleted: "+pq.poll());
        System.out.println("Deleted: "+pq.poll());


        System.out.println(pq.peek());
        //throw exception and terminate the code when empty
        System.out.println(pq.remove());

        pq.clear();
        System.out.println(pq.isEmpty());


    }
}