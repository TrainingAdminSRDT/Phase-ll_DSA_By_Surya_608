import java.util.*;
public class reverse_a_string {
    public static  String reverse(String st)
    {
    Stack<Character>s=new Stack<>();
    int idx=0;
    while(idx<=st.length()-1)
    {
s.push(st.charAt(idx));
idx++;
    }
    StringBuilder str=new StringBuilder("");
    while(!s.isEmpty())
    {
        char ch=s.pop();
        str.append(ch);
    }
    String stri=str.toString();
    return stri;
    }
    
    public static void main(String[] args) {
      System.out.println(  reverse("abcd"));

        
    }
}
