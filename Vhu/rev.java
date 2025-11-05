 import java.util.*;
public class rev {
    public static void main(String[] args) {
    
        System.out.println("enter the string ");
        Scanner sc=new Scanner(System.in);
        String stn=sc.next(); 
        StringBuilder st=new StringBuilder(stn);
       
                    st=st.reverse();
    System.out.println(st);
}
}
