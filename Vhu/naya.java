import java.util.*;
    public class naya {
        public static void main(String[] args) {
        
            System.out.println("enter the string ");
            String st;int j=0;
            Scanner sc=new Scanner(System.in);
                        st=sc.nextLine();
                        for(int i=0;i<st.length()-1;i++)
                        {
                            if((st.charAt(i))=='@')
                            {
                               j=i;
                               break;
                            }
                          }
                          st=st.substring(0,j);
                          System.out.println(st);
                        }
}
