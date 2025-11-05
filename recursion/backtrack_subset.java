import java.util.*;
public class backtrack_subset {
    public static void subset(String s,String ans,int i)
    {//base case
        if(i==s.length())
        {
            System.out.println(ans);
            return;
        }//yes choice
        subset(s, ans+s.charAt(i), i+1);
        //no choice
        subset(s, ans, i+1);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s="abc";
        subset(s,"",0);

    }
}
