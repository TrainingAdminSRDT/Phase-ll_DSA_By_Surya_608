import java.util.*;
public class revrse_of_a_list {
    
    public static void main(String[] args) {
        ArrayList<Integer>list=new ArrayList<>();
        Scanner sc=new Scanner(System.in);
       
        for(int i=0;i<6;i++)
        {
        list.add(i);
        }int j=0;
        for(int i=5;i>=0;i--)
        {
list.set(j++, i);

        }
         System.out.println("the reversed list is");
         for(int i=0;i<6;i++)
         {
            System.out.print(list.get(i)+" ");
         }
    }
   

}
