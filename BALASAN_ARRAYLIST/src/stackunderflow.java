import java.util.*;

public class stackunderflow
{
    public static void stackremoval(Stack st)
    {
        st.pop();
        stackremoval(st);
    }
    public static void main(String[] args)
    {
        Stack st = new Stack();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        stackremoval(st);
    }
}
//stack underflows when we try removing element from stack ,even if stack is empty
