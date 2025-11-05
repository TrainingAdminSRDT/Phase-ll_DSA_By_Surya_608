import java.util.*;
public class left_rotate_by_d_places {
    public static void rotate(int ar[],int r)
    {
        int n=ar.length;
        int temp[]=new int[r];
        //copying the left part of array
        for(int i=0;i<r;i++)
        {
            temp[i]=ar[i];
        }
        //now shifting the remaining elemt
        for(int i=0;i<n-r;i++)
        {
            ar[i]=ar[i+r];
        }
        //now pasting the elemts
        int j=0; 
        for(int i=n-r;i<n;i++)
        {
            ar[i]=temp[j++];
        }
        

    }
    //optimat solution will be
    /* reverse(a,r);
    reverse(a+r,n);
    reverse(a,n);
     * 
     * 
     * 
     * 
     * 
     */
    // solution is here
   /*  public static void reverseArray(int[] arr,int i,int r) {
    int left = 0, right = r;
    while (left < right) {
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
        left++;
        right--;
    }
}*/
//1-- reverseArray(arr,o,r);
//2-- reverseArray(r,arr.length);
//3-- reverseArray(0,arr.length);

    public static void printf(int ar[])
    {
        System.out.println("left rotated array is");
        for(int i=0;i<ar.length;i++)
        {
            System.out.print(ar[i]+" ");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the places you want to left roate an array:");
        int r=sc.nextInt();
       
        int  ar[]={0, 1, 1, 1, 3, 3, 6}; r=r%ar.length;
        rotate(ar,r);
        printf(ar);
    
}
}
