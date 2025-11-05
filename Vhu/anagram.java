import java.util.*;
import java.lang.*;
public class anagram {
    public static boolean anagra(String st1,String st2)
    {
        char s1[]=new char[256];char s2[]=new char[256]; 
        for(int i=0;i<st1.length();i++)
        {
            s1[st1.charAt(i)]++;s2[st2.charAt(i)]++;
        }
       
   for(int i=0;i<256;i++)
        {
            if(s1[i]!=s2[i])
            {
                return false;
            }
        }
        return true;
        

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String st1,st2="";
        System.out.println("Enter two strings to check");
        st1=sc.nextLine();
        st2=sc.nextLine();
        System.out.println(("anagram test result="+anagra(st1,st2)));

    }
    
}
