import java.util.*;
public class StackEx
{
    public static void main(String[] args)
    {
        Stack st = new Stack();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(6);
        st.push(5);
        st.push(6);
        st.push(6);
        System.out.println(st);
        st.remove(new Integer(6)); //removed from first inserted one
        System.out.println(st);
        //popping element at top
        st.pop();
        System.out.println("stack after popping:");
        System.out.println(st);
        st.remove(1);
        System.out.println("stack after popping:");
        System.out.println(st);
        System.out.println("peeking first element of stack:");
        System.out.println(st.peek());
        st.clear();
        System.out.println(st.empty()); //checks if the stack is empty or not
        System.out.println("stack after removing all elements:");
        System.out.println(st); //stack underflow
        System.out.println(st.peek()); //if no elements throws exception
    }
}
