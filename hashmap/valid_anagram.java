import java.util.*;
public class valid_anagram {
    public static boolean validana(String s,String t)
    {
        Map<Character,Integer>mp=new HashMap<>();
        if(s.length()!=t.length())
        {
            return false;
        }
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(mp.containsKey(ch))
            {
                mp.put(ch,mp.get(ch)+1);
            }
            else{
                mp.put(ch, 1);
            }
        }
        for(int i=0;i<s.length();i++)
        {
            char ch=t.charAt(i);
           
            if(mp.get(ch)!=null)
            {
             if(mp.get(ch)==1)
            {
                mp.remove(ch);
            }
            else{
                mp.put(ch, mp.get(ch)-1);
            } 
            }
            else{
                return false;
            }
        }
       return mp.isEmpty();
    }
    public static void main(String[] args) {
        String s="anabella";
        String t="vaibhav";
      System.out.println(validana(s,t));
    }
}
