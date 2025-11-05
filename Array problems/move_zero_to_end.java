import java.util.*;
public class move_zero_to_end {
    public static int[] move_end_zero(int ar[])
    {
        if(ar.length==0)
        {
            return ar;
        }int j=-1;
        for(int i=0;i<ar.length;i++)
        {
        
            if(ar[i]==0)
            {
                j=i;
                break;

            }
            
        }
        if(j==-1)
        {
            return ar;
        }
        for(int i=j+1;i<ar.length;i++)
        {
            if(ar[i]!=0)
            {
                int temp=ar[i];
                ar[i]=ar[j];
                ar[j]=temp;
            j++;}
        }
return ar;
    }
    public static void main(String[] args) {
        int ar[]={1,0,2,0,3,0,4,3,2,0,1};
        move_end_zero(ar);
        for (int i : ar) {
            System.out.print(i+" ");
        }
System.out.println();
    }
}
