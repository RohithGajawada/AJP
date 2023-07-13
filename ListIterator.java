import java.util.ArrayList;

public class ListIterator{
    public static void main(String[] args) {
        ArrayList al=new ArrayList();
        for(int i=0;i<10;i++)
        al.add(i);
        System.out.println(al);
        ListIterator Itr=al.listIterator();
            while(Itr.hasNext()){
                int i=(Integer)Itr.next();
                System.out.println(i+"");
                if(i%2==0)
                {
                    i++;
                    Itr.set(i);
                    Itr.add(i);

                }
            }
            System.out.println(al);

    }
}
