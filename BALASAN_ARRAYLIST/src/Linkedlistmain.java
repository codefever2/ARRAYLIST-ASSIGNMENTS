import java.util.*;
import java.lang.*;
class Linkedlistmain
{
    static Student getinputentry()
    {
        Scanner sc = new Scanner(System.in);
        Student f = new Student();
        f.setMobilenumber(sc.nextLong());
        f.setID(sc.nextLong());
        f.setName(sc.next());
        f.setGender(sc.next().charAt(0));
        f.setAge(sc.nextInt());
        return f;
    }
    static void printstudententry(int number,LinkedList<Student> e,int p)
    {
        for (int i = p; i < number; i++)
        {
            System.out.println("Age : " + e.get(i).getAge());
            System.out.println("Mobilenumber : " + e.get(i).getMobilenumber());
            System.out.println("ID : " + e.get(i).getID());
            System.out.println("Name : " + e.get(i).getName());
            System.out.println("Gender : " + e.get(i).getGender());
            System.out.println("\n");
        }
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of employees :");
        int number = sc.nextInt();
        LinkedList<Student> e = new LinkedList<Student>();
        Student d = new Student();

        //1.Getting student details input from console
        for (int i = 0; i < number; i++) {
            d = getinputentry();
            e.add(d);
        }

        //2.printing all student details
        printstudententry(number,e,0);

        //3.inserting student detail at 0th index
        System.out.println("Enter the student details to insert at 0th index : ");
        d=getinputentry();
        e.add(0,d);
        number += 1;
        System.out.println("After inserting a new student detail at 0th index printing all student details");
        printstudententry(number,e,0);

        //4.to retrieve information from specified index //specify the position
        System.out.println("Enter the index position to retrieve student information: ");
        int index=sc.nextInt();
        printstudententry(index+1,e,index);

        //5.update student specific detail(mobilenumber) based on roll no
        System.out.println("Enter the roll number to update student specific detail(mobilenumber):");
        int r=sc.nextInt();
        for(int i=0;i<number;i++)
        {
            if(e.get(i).getID() == r)
            {
                System.out.println("Enter the mobile number");
                e.get(i).setMobilenumber(sc.nextLong());
                break;
            }
        }
        System.out.println("printing after updating mobilenumber :");
        printstudententry(number,e,0);



        //6.remove third element from arraylist
        e.remove(3);
        number -= 1;
        printstudententry(number,e,0);


        //7.printing some details like  name and mobilenumber details based on ID of employee
        System.out.println("Enter the number of queries to perform:");
        int queries = sc.nextInt();
        for (int i = 0; i < queries; i++) {
            System.out.println("Enter the ID to print the employee details:");
            long IDS = sc.nextLong();
            for (int j = 0; j < number; j++) {
                if ((e.get(j).getID()) == IDS) {
                    System.out.println("Name : " + e.get(j).getName());
                    System.out.println("Mobilenumber : " + e.get(j).getMobilenumber());
                    System.out.println("\n");
                    break;
                }
            }
        }

        //8.sort student list based on their name in ascending order
        e.sort(new namecomparator());
        printstudententry(number,e,0);


        //9.copy one arraylist to another arraylist
        LinkedList<Student> newal = new LinkedList<Student>(e);
        System.out.println("printing new arraylist - newal  afer copying from old arraylist - e");
        printstudententry(number,newal,0);

        //10 shuffle student info in arraylist
        Collections.shuffle(newal);
        System.out.println("Printing after shuffling :");
        printstudententry(number,newal,0);

        //11.reversing the order
        Collections.reverse(newal);
        printstudententry(number,newal,0);

        //12.extract a portion of student info in a array list
        //extracting ID,NAME,GENDER alone from student array list
        System.out.println("Extracting only a portion eg : ID,NAME,GENDER alone from student array list");
        for(int i=0;i<number;i++)
        {
            System.out.println("index value : "+i);
            System.out.println("ID : " + e.get(i).getID());
            System.out.println("Name : " + e.get(i).getName());
            System.out.println("Gender : " + e.get(i).getGender());
            System.out.println("\n");
        }

        //13.comparing two arraylists
        boolean comparingresult = e.equals(newal);
        System.out.println("Result of comapring to two arraylists:"+comparingresult);






    }
}


