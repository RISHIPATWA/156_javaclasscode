import java.util.Stack;
public class stackexp {
    public static void main(String[] args) {
        Stack<Integer> st=new Stack<>();
        
        //1 based indexing
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        st.push(6);
        st.push(7);
        System.out.println(st.peek());
        st.pop();
        st.pop();
        System.out.println(st.peek());
        System.out.println(st.search(6));
        System.out.println(st.search(5));
        System.out.println( st.empty());
        System.out.println(st);
    }
}