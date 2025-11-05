import java.util.*;
public class valid_parenthesis {
    public static boolean validstring( String str)
    { 
       Stack<Character>s=new Stack<>();
        for(int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);
         //opening brackets
            if(ch=='['||ch=='('|| ch=='{')
            {
                s.push(ch);
            }
            else{

            //closing bracket
            if(s.isEmpty())
            {
                return false;
            }
            if((s.peek()=='['&&ch==']')||(s.peek()=='{'&&ch=='}')||(s.peek()=='('&&ch==')'))
            {
                s.pop();
            }
            else{
                return false;
            }
        }
    }
        if(s.isEmpty())
        {
            return true;
        }
        else{
            return false;
        }

    }
    public static void main(String[] args) {
        String str="[]{}()";
        System.out.println("is the given string a valid string="+validstring(str));
    }
}
