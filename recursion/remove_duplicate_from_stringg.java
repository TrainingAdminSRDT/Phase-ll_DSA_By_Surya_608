import java.util.*;
public class remove_duplicate_from_stringg {
    public static String removed(String st,int i,boolean map[],StringBuilder st1)
    { 
        if(i==st.length())
        {
            System.out.println(st1);
            return" ";
        }
        char ch=st.charAt(i);
        if(map[ch-'a']==true)
        {
            removed(st, i+1, map,st1);
        }
        else{
            map[ch-'a']=true;
        
            removed(st, i+1, map,st1.append(ch));


        }
        
return " ";
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String st=sc.nextLine();int i=0;boolean map[]=new boolean[26];
        System.out.println(removed(st,i,map,new StringBuilder()));
    }
}
