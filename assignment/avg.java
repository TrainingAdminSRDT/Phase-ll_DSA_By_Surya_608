import java.util.*;
public class avg {
   /*  public static void avg(int a,int b)
    {
        float avrega=(a+b)/2;
        System.out.println("avg is="+avrega);
    }
     public static boolean evenorodd(int a)
     {
        if(a%2==0)
        {
            return true;}
            else{
                return false;
            }
     }
      public static boolean palin(int a)
      {int rev=0;int n=a;
        while(a>0)
        {
            int d=a%10;
             rev=rev*10+d;
            a=a/10;
        }
        if(rev==n)

        {
            return true;
        }
        else{
            return false;
        }

      }*/
      public static boolean aray(int arr[])
      {
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]==arr[j])
                {
                    return true;
                }
            }
        }
        return false;
      }
    public static void main(String[] args) {
        int arr[]={1,2,3,4};
        System.out.println(aray(arr));
        //avg(4,9);
      //System.out.println("nuber is even= "+  evenorodd(9));
       //System.out.println("nuber is palindrome= "+  palin(191));
    }
    
}
