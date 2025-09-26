
class MyTask implements Runnable{
    public void run(){
        System.out.println(Thread.currentThread().getName()+" is running.");
    }
}
public class MT2 {
    public static void main(String[] args) {
        //runnable obj
        MyTask task=new MyTask(); //class ka obj bnao
        //pass runnable to thread
        Thread t=new Thread(task); //then pass the reference to Thread interface
        t.start();

        Thread t1=new Thread(task);
        t1.start();

    }
}