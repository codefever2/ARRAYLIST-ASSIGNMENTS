import java.util.*;

//14.swap two arraylist elements
public class vectorusingintegers
{
    public static void main(String[] args)
    {
        Vector<Integer> al = new Vector<>(Arrays.asList(1,2,3,4,5,6,7,8));
        //swapping oth index with last index
        System.out.println("original arraylist:");
        System.out.println(al);
        Collections.swap(al,0,al.size()-1);
        System.out.println("Arraylist after swapping :");
        System.out.println(al);

        //15.join two arraylists
        Vector<Integer> al2 = new  Vector<>(Arrays.asList(9,10,11,12,13));
        al.addAll(al2);
        System.out.println("Arraylist : al after joining with al2:");
        System.out.println(al);

        //16.clone an array list to another arraylist;
        Vector<Integer> al3 = new  Vector<Integer>() ;
        al3 = ( Vector)al.clone();
        System.out.println("Arraylist : al3 after cloning with al:");
        System.out.println(al3);
        //TO check deep copy creation
//        al.set(0,15);
//        System.out.println(al3);
//        System.out.println(al);

        //using copy method to create new arraylist from old arraylist.destination arraylist size must be greater than or equal to source size
//        else index out of bound exception will happen
//      ArrayList<Integer> al4 = new ArrayList<Integer>(8) ;
//       al4.add(90);
//        Collections.copy(al4,al);
//        System.out.println(al4);
//        System.out.println(al);

        //17.empty an arraylist
        al3.removeAll(al3);
//          al3.clear();
        /*The difference between an empty and a new arraylist is the size of backing array.
        As clear() method does not resize the backing array, so after clear method you may have a list
         which has backing array of a larger size (if list was pretty big before clear() method was called)*/
        System.out.println(al3);

        //18.TESTING WHETHER ARRAYLIST IS EMPTY OR NOT
        System.out.println("IF al3 arraylist is empty ,print TRUE, else FALSE : "+al3.isEmpty());
        System.out.println("IF al arraylist is empty ,print TRUE, else FALSE : "+al.isEmpty());

        //19.TRIM THE CAPACITY OF ARRAYLIST SIZE TO CURRENT ARRAY SIZE
        /*Parameter: It does not accepts any parameter.
        Return Value: It does not returns any value.
        It trims the capacity of this ArrayList instance to the number of the element it contains.*/

        Vector<Integer> trimarray = new  Vector<>();
        trimarray.add(1);
        trimarray.add(2);
        trimarray.add(3);
        trimarray.add(4);
        trimarray.add(5);
        trimarray.add(6);
        trimarray.add(7);
        trimarray.add(8);
        trimarray.add(9);
        trimarray.add(10);
        trimarray.add(11);
        trimarray.add(12);
        System.out.println(trimarray.size());
        trimarray.add(13);
        trimarray.trimToSize();
        trimarray.add(14);
        System.out.println(trimarray.size());

        //20. Increase arraylist size
        /*However, ensureCapacity() method of java.util.ArrayList class can be used to increase the capacity of an ArrayList instance,
        if necessary, to ensure that it can hold at least the number of elements specified by the minimum capacity argument.
         */
        trimarray.ensureCapacity(16);
        trimarray.add(14);
        trimarray.add(15);
        trimarray.add(16);
        trimarray.add(17);
        System.out.println(trimarray);

        //21.To print elements, first we’ll create a String ArrayList and store weekdays name as strings into it and display them using following ways:
        /*
        For-loop
        For-each loop
        Using iterator
        Using List-iterator*/// - it is bidirectional
        //Using list iterator
        ListIterator<Integer> i = trimarray.listIterator();
        System.out.println("Printing trimarray using iterator");
//        Iterator i = trimarray.iterator();
        while(i.hasNext())
        {
            System.out.println(i.next());
        }

    }
}
