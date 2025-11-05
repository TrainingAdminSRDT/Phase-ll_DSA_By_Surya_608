import java.util.*;
public class activity_selection_unsorted {
    public static void main(String[] args) {
        int start[]={1,3,0,5,8,5};
        int end[]={2,4,6,7,9,9};
        //soreting activity
        int activity[][]=new int[start.length][3];
        for(int i=0;i<start.length;i++)
        {
            activity[i][0]=i;
            activity[i][1]=start[i];
            activity[i][2]=end[i];
        }
        Arrays.sort(activity,Comparator.comparingDouble(o->o[2]));
        ArrayList<Integer>ans=new ArrayList<>();
        ans.add(activity[0][0]);
        int maxact=1;
        int last=activity[0][2];
        for(int i=1;i<end.length;i++)
        {
            if(activity[i][1]>=last)
            {
                maxact++;
                last=activity[i][2];
                ans.add(activity[i][0]);
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
