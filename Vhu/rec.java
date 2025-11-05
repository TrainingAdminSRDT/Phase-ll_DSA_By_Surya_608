import java.util.*;
class rec{
   /*  public static void recursion(int n)
    {
        if(n==1)
        {
            System.out.println(1);
            return;
        }
        System.out.println(n);
        recursion(n-1);
        
    }*/
  /*  public static void reverse(int ar[],int s,int e)
    {
        if(s>=e)
        {
return;
        }
        int temp=ar[s];
        ar[s]=ar[e];
        ar[e]=temp;
        reverse(ar, s+1, e-1);
    }*/
    public static boolean reverse(String str,int i,int n)
    {
        if(i>=n/2)
        {
            return true;
        }
       if(str.charAt(i)!=str.charAt(n-i-1))
       {
        return false;
       }
      return reverse(str, i+1, n);
    }
    public static void main(String[] args) {
        
        String str="VAIBHAV";int n=str.length();
        reverse(str,0,str.length());
    System.out.println(reverse(str, 0,n ));
       /*  int ar[]={1,2,3,4,5};
       // recursion(n);
       reverse(ar,0,4);
       for (int i : ar) {
        System.out.println(i);
       }*/
    }
}