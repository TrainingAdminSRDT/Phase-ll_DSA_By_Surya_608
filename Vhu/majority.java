import java.util.*;
public class majority {
    public static int majori(int ar[])
    {int n=ar.length-1;
        int ar1[]=new int[maj];
        for(int i=0;i<n;i++)
        {
            ar1[ar[i]]++;
        }int maj=ar1[0];int k=-1;
        for(int i=0;i<n;i++)
        {
            if(ar1[i]>maj)
            {
                maj=ar1[i];
                k=i;
    }
   
} return maj;
    }
    public static void main(String[] args) {
        int ar[]={1,3,3,3,5,1,1,2,3,4,6,6,6,6,5,3,3};
        System.out.println("majpority element is="+majori(ar));
    }
    
}
