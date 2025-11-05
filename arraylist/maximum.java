import java.util.*;
public class maximum {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        ArrayList<Integer>list=new ArrayList<>();
        list.add(98);
        list.add(78);
        list.add(8);
        list.add(48);
        list.add(81);
        list.add(28);
        
        int max=list.get(0);
        for(int i=1;i<list.size();i++)
        {
           /*  if(list.get(i)>max)
            {
                max=list.get(i);
            }*/
            max=Math.max(max, list.get(i));
            
        }
        System.out.println("Maximum element of the list is="+max);
    }
}
