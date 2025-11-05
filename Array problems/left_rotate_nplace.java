import java.util.*;
public class left_rotate_nplace {
    public static void rotatear(int ar[],int start,int end)
    {
        while(start<=end)
        {
            int temp=ar[start];
            ar[start]=ar[end];
            ar[end]=temp;
            start++;end--;
        }

    }
    public static void rotate(int ar[],int k)
    {
        if(ar.length==0)
        {
            return ;
        }
        int end =ar.length-1;
        int start=0;
    rotatear(ar,start,k-1);
    rotatear(ar,k,end);
    rotatear(ar,start,end);
    }
    public static void main(String[] args) {
        int ar[]={7,8,9,1,2,3,4,5,6};
        rotate(ar, 3);
        for (int i : ar) {
            System.out.print(i+" ");
            
        }
        System.out.println();


    }
    
}
