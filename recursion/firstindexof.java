import java.util.*;

public class firstindexof {
    public static int first(int ar[],int key,int i)
    {
        if(i==ar.length-1)
        {
            return -1;
        }
        if(ar[i]==key)
        {
            return i;
        }
        return first(ar,key,i+1);

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int ar[]=new int[5];
        System.out.println("Enter elemenst into the array and the the key");
        for(int i=0;i<5;i++)
        {
            ar[i]=sc.nextInt();
        }int i=0;
        int key=sc.nextInt();
       System.out.println( first(ar,key,i)+" is  the first index of the key");
    }
    
}
