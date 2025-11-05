import java.util.*;
public class order {
    public static boolean os(int[]arr)
    {
        for(int i=0;i<arr.length-1;i++)
        {
            if(arr[i]>arr[i+1])
            {
return false;
            
}
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println("enter the size of the array");
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int arr[]=new int[size];
        System.out.println("enter trhe elements into the array");
        for(int i=0;i<arr.length-1;i++)
        {
            arr[i]=sc.nextInt();
        }
       

        if(!os(arr))
        {
            System.out.println("ascending");
        }
        else{
            System.out.println("not ascending");
        }
    }
    
}

