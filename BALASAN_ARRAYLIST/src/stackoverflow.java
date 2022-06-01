public class stackoverflow
{
    public static void recursion()
    {
        recursion();
    }
    public static void main(String[] args)
    {
        recursion();
    }
}

//stack overflows when method is called recursively without any condition set