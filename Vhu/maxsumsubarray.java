import java.util.*;
public class maxsumsubarray {
    public static void subarr(int array[])
    {int n=array.length;
        int size=(n*(n+1))/2;
        int ne[]=new int[size];
        for(int i=0;i<array.length;i++)
        {
            for(int j=i;j<array.length;j++)
            {int sum=0;
                for(int start=i;start<=j;start++)
                {
                 sum+=array[start];
                 System.out.print(array[start]);
                 }
                ne[i]=sum;
                System.out.println();
            }
            System.out.println();
        }int max=ne[0];int min=ne[0];
        for(int i=1;i<size;i++)
        { 
            max=Math.max(max, ne[i]);
            min=Math.min(min, ne[i]);
            
        }System.out.print(max+","+min);
       
        
    }
    public static void main(String[] args) {
        int arr[]=new int[4];
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the array elements");
        for(int i=0;i<arr.length;i++)
    {
        arr[i]=sc.nextInt();
    } 
subarr(arr);
}
    
}
