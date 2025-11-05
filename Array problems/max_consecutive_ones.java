import java.util.*;
public class max_consecutive_ones {
    public static int maxone(int ar[])
    {
        int max=Integer.MIN_VALUE;
        int count=0;
        for(int i=0;i<ar.length;i++)
        {
            if(ar[i]==1)
            {
                count++;
                  max=Math.max(count, max);
            }
            else{
                count=0;
            }
          
        }
        return max;
    }
    public static void main(String[] args) {
        int ar[]={1,2,3,1,1,1,2,56,1,1,1,1,1,6,4,11,1,1};
        System.out.println(maxone(ar));

    }
}
