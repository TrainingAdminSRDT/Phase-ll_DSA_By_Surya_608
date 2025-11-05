import java.util.*;
public class d_arraylists {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<ArrayList<Integer>>mainlist=new ArrayList<>();
        ArrayList<Integer>ar1=new ArrayList<>();
        ArrayList<Integer>ar2=new ArrayList<>();
        ArrayList<Integer>ar3=new ArrayList<>();
        for(int i=1;i<=5;i++)
        {
        ar1.add(i*2);
        ar2.add(i*3);
        ar3.add(i*4);
        }
        mainlist.add(ar1); mainlist.add(ar2); mainlist.add(ar3);
        //printing the list
        System.out.println(mainlist);
        
    }
}
