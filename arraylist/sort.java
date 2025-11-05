import java.util.*;

public class sort {
    public static void main(String[] args) {
        ArrayList<Integer>list=new ArrayList<>();
        Scanner sc=new Scanner(System.in);
       
        for(int i=6;i>=0;i--)
        {
        list.add(i);
        }
        Collections.sort(list);
    System.out.println(list);
}
}
