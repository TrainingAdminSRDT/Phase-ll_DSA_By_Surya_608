import java.util.*;
public class mergesort {
    public static void printarray(int ar[])
    {
         for(int i=0;i<ar.length;i++)
        {
            System.out.print(ar[i]+" ");
        }
        System.out.println();
    }
    public static void mergesorting(int ar[],int si,int ei)
    {
        if(si>=ei)
        {
            return;
        }
        int mid=si+(ei-si)/2;
        mergesorting(ar, si, mid);
        mergesorting(ar, mid+1, ei);
        merge(ar,si,mid,ei);
       
    }
    public static void merge(int ar[],int si,int mid,int ei)
    {
        int temp[]=new int[ei-si+1];
        int i=si;int j=mid+1;int k=0;
        while(i<=mid&&j<=ei)
        {
            if(ar[i]<ar[j])
            {
                temp[k]=ar[i];
                i++;k++;
            }
            else{
                temp[k]=ar[j];
                j++;k++;
            }
        }

            while(i<=mid)//left part remaining elements
            {
                temp[k++]=ar[i++];
            }
            while(j<=ei)//right side remaining elements if any
            {
                temp[k++]=ar[j++];
            }
        for(int m=0;m<temp.length;m++)
        {
            ar[si+m]=temp[m];
        }

    }
    
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int ar[]=new int[7];int i=0;int ei=ar.length-1;
        System.out.println("enter elements into array");
        for(int t=0;t<ar.length;t++)
        {
            ar[t]=sc.nextInt();
        } mergesorting(ar,i,ei);
        System.out.println("sorted array is");
           
            printarray(ar);
    }
    
}
