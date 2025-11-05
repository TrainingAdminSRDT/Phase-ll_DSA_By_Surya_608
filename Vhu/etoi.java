import java.util.*;
import java.util.Scanner;
public class etoi {
    public static void main(String[] args) {
        
        System.out.println("enter the string ");
        String st;
        Scanner sc=new Scanner(System.in);
                    st=sc.nextLine();
                    String str=st.replace('e', 'i');
                    System.out.println("new string is= "+str);
    }
    
}
