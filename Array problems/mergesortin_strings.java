 import java.util.*;
public class mergesortin_strings {
    public static void printarray(String ar[])
    {
         for(int i=0;i<ar.length;i++)
        {
            System.out.print(ar[i]+" ");
        }
        System.out.println();
    }
    public static String[] mergesorting(String ar[],int si,int ei)
    {
        if(si==ei)
        {
            String[]a={ar[si]};
            return a;
        }
        int mid=si+(ei-si)/2;
       String ar1[]= mergesorting(ar, si, mid);
        String ar2[]=mergesorting(ar, mid+1, ei);
       String ar3[]= merge(ar1,ar2);
       return ar3;
    } 
    
    public static String[] merge(String ar1[],String ar2[])
    {int n=ar1.length;int m=ar2.length;
        String temp[]=new String[n+m];
        int i=0;int j=0;int k=0;
        while(i<m&&j<n)
        {
            if(isAlphabeticallySmaller(ar1[i],ar2[j]))
            {
                temp[k]=ar1[i];
                i++;k++;
            }
            else{
                temp[k]=ar2[j];
                j++;k++;
            }
        }

            while(i<n)//left part remaining elements
            {
                temp[k++]=ar1[i++];
            }
            while(j<m)//right side remaining elements if any
            {
                temp[k++]=ar2[j++];
            }
       return temp;

    }static boolean isAlphabeticallySmaller(String str1,String str2) {if(str1.compareTo(str2) <0) {return true;}return false;}
   
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String ar[]=new String[7];
        System.out.println("enter elements into array");
        for(int t=0;t<ar.length;t++)
        {
            ar[t]=sc.nextLine();
        } mergesorting(ar,0,ar.length-1);
        System.out.println("sorted array is");
           
            printarray(ar);
    }
    
}
