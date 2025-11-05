import java.util.*;
public class remove_duplicates {
    public static void remove(int ar[])
    {
        Set<Integer>st=new HashSet<>();
        for(int i=0;i<ar.length;i++)
        {
            st.add(ar[i]);
        }
        Iterator it=st.iterator();
        while(it.hasNext())
        {
            System.out.print(it.next()+" ");
        }
        System.out.println();
        System.out.print(st);
    }
    public static void main(String[] args) {
        int ar[]={1,2,3,1,2,3,4,5,3,7};
        remove(ar);
        

    }
}
