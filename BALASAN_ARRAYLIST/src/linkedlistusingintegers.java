import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.ListIterator;
//14.swap two arraylist elements

import java.util.*;
public class linkedlistusingintegers
{
    public static void main(String[] args)
    {
        LinkedList<Integer> al = new LinkedList<>(Arrays.asList(1,2,3,4,5,6,7,8));
        //swapping oth index with last index
        System.out.println("original arraylist:");
        System.out.println(al);
        Collections.swap(al,0,al.size()-1);
        System.out.println("Arraylist after swapping :");
        System.out.println(al);

        //15.join two arraylists
        LinkedList<Integer> al2 = new LinkedList<>(Arrays.asList(9,10,11,12,13));
        al.addAll(al2);
        System.out.println("Arraylist : al after joining with al2:");
        System.out.println(al);

        //16.clone an array list to another arraylist;
        LinkedList<Integer> al3 = new LinkedList<Integer>() ;
        al3 = (LinkedList)al.clone();
        System.out.println("Arraylist : al3 after cloning with al:");
        System.out.println(al3);

        //TO check deep copy creation
        al.set(0,15);
        System.out.println(al3);
        System.out.println(al);

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

        //19.TRIM THE CAPACITY OF LINKEDLIST SIZE TO CURRENT ARRAY SIZE
        /*Parameter: It does not accepts any parameter.
        Return Value: It does not returns any value.
        It trims the capacity of this ArrayList instance to the number of the element it contains.*/
       /* You can't trim linked at all, because it's nonsensical to trim a LinkedList ;
       they do not allocate additional buffer space past their capacity as appending to a LinkedList is always O(1),
       where as appending to a full ArrayList is O(n).
        */

        //20. Increase LINKEDlist size
        /*LinkedList by nature does not have "capacity",
        since it does not allocate memory to the items before the items are added to the list.
        Each item in a LinkedList holds a pointer to the next in the list.
         */


        //21.To print elements, first we’ll create a String ArrayList and store weekdays name as strings into it and display them using following ways:
        /*
        For-loop
        For-each loop
        Using iterator
        Using List-iterator*/// - it is bidirectional
        //Using list iterator
        ListIterator i = al.listIterator();
        System.out.println("Printing trimarray using iterator");
//        Iterator i = trimarray.iterator();
        while(i.hasNext())
        {
            System.out.println(i.next());
        }

    }
}

