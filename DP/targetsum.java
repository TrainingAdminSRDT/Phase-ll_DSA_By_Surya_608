import java.util.*;
public class targetsum {
    public static boolean check(int val[],int tagret,boolean dp[][])
    {
         for(int i=1;i<val.length+1;i++)
         {
            for(int j=1;j<tagret+1;j++)
            {
                int V=val[i-1];
                if(V<=j)
                {
                    dp[i][j]=dp[i - 1][j] || dp[i - 1][j - V];
                   
                }
                else{
                    dp[i][j]=dp[i-1][j];
                }
            }
         } 
         return dp[val.length][tagret];
    
    }
    public static void prinT(boolean dp[][],int val[],int tagret)
    {
        for(int i=0;i<val.length+1;i++)
        {
            for(int j=0;j<tagret+1;j++)
            {
             System.out.print(dp[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int tagret=10;
        int val[]={4,2,7,1,3};
        boolean dp[][]=new boolean[val.length+1][tagret+1];
        for(int i=0;i<val.length+1;i++)
        {
            dp[i][0]=true;
        }
      
      System.out.println(  check(val,tagret,dp));
      prinT(dp,val,tagret);
    }
}
