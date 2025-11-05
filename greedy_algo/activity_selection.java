import java.util.*;
public class activity_selection {
    public static void main(String[] args) {
        int start[]={1,3,0,5,8,5};
        int end[]={2,4,6,7,9,9};
        ArrayList<Integer>ans=new ArrayList<>();
        ans.add(0);
        int maxact=1;
        int last=end[0];
        for(int i=1;i<end.length;i++)
        {
            if(start[i]>=last)
            {
                maxact++;
                last=end[i];
                ans.add(i);
            }

        }
        for(int i=0;i<ans.size();i++)
        {
            System.out.print("A"+ans.get(i)+" ");
       
        }
        System.out.println();
        System.out.print("maximum activity are "+maxact);
       
    }
}
