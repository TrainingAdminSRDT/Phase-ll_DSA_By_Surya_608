import java.util.*;
public class str {
    public static String str(String st)
    {
        StringBuilder sti=new StringBuilder();
        char ch=Character.toUpperCase(st.charAt(0));
        sti.append(ch);
        for(int i=1;i<st.length();i++)
        {
            if(st.charAt(i)==' ' && i<st.length())
            {
                sti.append(st.charAt(i));
                i++;
                sti.append(Character.toUpperCase(st.charAt(i)));
                        }
                        else{
                            sti.append(st.charAt(i));
                        }
        }
        return sti.toString();
        
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
               String st;
                System.out.println("Enter a string");
                st=sc.nextLine();str(st);
System.out.println("new string="+str(st));

    }
}
