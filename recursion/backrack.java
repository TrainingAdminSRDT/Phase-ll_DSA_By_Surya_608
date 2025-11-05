import java.util.*;
public class backrack {
    public static void changearr(int arr[],int index,int val)
    {
        //base case
        if(index==arr.length)
        {
            pritf(arr);
            return ;
        }
        //kaam
        arr[index]=val;
        changearr(arr, index+1, val+1);
        arr[index]=arr[index]-2;
        
    }
    public static void pritf(int arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[]=new int[5];
        changearr(arr,0,1);
        pritf(arr);
    }
    
}
