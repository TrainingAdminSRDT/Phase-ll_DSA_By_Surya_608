import java.util.*;
public class maximum_sum_saubarray_kadanes {
    public static int kadane(int ar[])
    {
        int maxsum=Integer.MIN_VALUE;
        int currentsum=0;
        for(int i=0;i<ar.length;i++)
        {
            currentsum+=ar[i];
            maxsum=Math.max( currentsum,maxsum);
            if(currentsum<0)
            {
                currentsum=0;
            }
        }
        return maxsum;
    }
    public static void main(String[] args) {
        int ar[]={-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(kadane(ar));
    }
    
}
