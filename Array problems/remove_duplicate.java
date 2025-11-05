import java.util.*;
public class remove_duplicate {
    public static int removed(int ar[])
    {
        int n=ar.length;
        int j=0;
        if(n==0)
        {
            return 0;
        }
        for(int i=0;i<n;i++)
        {
            if(ar[i]!=ar[j])
            {
                j++;
                ar[j]=ar[i];
            }
        }
        return (j+1);
        

    }
    public static void printf(int ar[],int k)
    {
        System.out.println("unique array is");
        for(int i=0;i<k;i++)
        {
            System.out.print(ar[i]+" ");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int  ar[]={0, 1, 1, 1, 3, 3, 6};
       int k= removed(ar);
       printf(ar, k); 
  
       
    }
}
