import java.util.*;
public class names {
    public static void main(String[] args) {
        String arr[]=new String[3];
        Scanner sc=new Scanner(System.in);
        System.out.println("enetr the  3names into array");
        for(int i=0;i<3;i++)
        {
            arr[i]=sc.nextLine();
        }
        System.out.println("names are");
        for(int i=0;i<3;i++)
        {
            System.out.print(arr[i]+",");
        }
    }
}
