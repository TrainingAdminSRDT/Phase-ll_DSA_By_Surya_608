import java.util.*;

public class sortedornot {
    public static boolean issorted(int j,int ar[]){
        if(j==ar.length-1)
        {
            return true;
        }
        if(ar[j]>ar[j+1])
        {
            return false;
        }
      return issorted(j+1, ar);  
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int ar[]=new int[5];
        System.out.println("Enter elemenst into the array");
        for(int i=0;i<5;i++)
        {
            ar[i]=sc.nextInt();
        }int j=0;
       System.out.println( issorted(j,ar)+" ");
    }
}

