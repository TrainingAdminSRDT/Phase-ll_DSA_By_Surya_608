import java.util.*;
public class reve {
    public static void rev(int arr[])
    {
        int first=0;int last=6-1;
        while(first<last)
        {
           int temp=arr[last];
           arr[last]=arr[first];
           arr[first]=temp;
            first++;last--;
    
        }
        for(int i=0;i<6;i++)
        {
            System.out.print(arr[i]+",");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner((System.in));
        int ar[]=new int[6];System.out.println("Enter elements into array");
        for(int i=0;i<6;i++)
        {
            ar[i]=sc.nextInt();
        }
        rev(ar);
        
    }
    
}
