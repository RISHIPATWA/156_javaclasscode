import java.util.Vector;
public class vectorexp {
    public static void main(String[] args) {
        //default 10 size
        Vector <String> vc=new Vector<>();   
        //size 4
        // Vector <String> vc=new Vector<>(4);
        //size 4 and inc 1 when ele more than 4 addded
       // Vector <String> vc=new Vector<>(4,1);
        
        //by default capacity is 10 similiar to arraylist
        System.out.println(vc.capacity());

        vc.add("1");
        vc.add("2");
        vc.add("3");
        vc.add("4");

        System.out.println(vc.capacity());
        vc.add("4");

        System.out.println(vc.capacity());
        System.out.println(vc.size());
        
        System.out.println("Vector is "+ vc);

        Vector <String> vc2=new Vector<>();   
        
        vc2.add("A");
        vc2.add("B");
        vc2.add("C");
        vc2.add("D");

        System.out.println("SEcond vector is"+vc2);

        vc.addAll(vc2);
        System.out.println(vc);

        vc.addElement("Z");//it is a legacy method thus only with vector

        //first ele
        System.out.println(vc.firstElement());
        //last
        System.out.println(vc.lastElement());


        //clear method-empty
        vc.clear();

        
    }
}
// synchronized-multiple thread ko ek sath access na krpaye eg,vector
// unsynch-ll,array list

//Constructor 3 types vector(),vector(intinitialCapacity),