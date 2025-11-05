 import java.util.*;
 import java.lang.*;
 public class stringcompression {
    public static String compress(String str)
    {
        StringBuilder st=new StringBuilder();
    int n=str.length();
        for(int i=0;i<n;i++)
        {
            Integer count=1;
            while(i<n-1&&str.charAt(i)==str.charAt(i+1))
            {
                count++;
                i++;
            }
st.append(str.charAt(i));
            if(count>1)
            {
                st.append(count.toString());
             }
             else{

             }
             
            }
            return st.toString();
        }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str="";
        System.out.println("Enter a string to compress");
        str=sc.nextLine();
        System.out.print(compress(str));
    }
    
}
