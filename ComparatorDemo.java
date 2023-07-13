import java.io.*;
import java.lang.*;
import java.util.*;

class Student{
    int rollno;
    String name,address;
    public Student(int rollno,String name,String address){
        this.rollno=rollno;
        this.name=name;
        this.address=address;
    }
    public String toString(){
        return this.rollno+""+this.name+""+this.address;
    }
}
class Sortbyroll implements Comparator<Student>
{
    public int compare(Student a,Student b)
    {
        return a.rollno-b.rollno;
    }
}
class Sortbyname implements Comparator<Student>
{
    public int compare(Student a,Student b)
    {
        return a.name.compareTo(b.name);
    }
}

public class ComparatorDemo {
    public static void main(String[] args) {
        ArrayList<Student> al=new ArrayList<Student>();
        al.add(new Student(111,"Ram","Hyd"));
        System.out.println("Unsorted");
        for(int i=0;i<al.size();i++){
            System.out.println(al.get(i));
        }
        Collections.sort(al,new Sortbyroll());
        System.out.println("Sorted by roll:");
        for(int i=0;i<al.size();i++){
            System.out.println(al.get(i));
        }
        Collections.sort(al,new Sortbyname());
        System.out.println("Sorted by name:");
        for(int i=0;i<al.size();i++){
            System.out.println(al.get(i));
        }

        
    }
}
