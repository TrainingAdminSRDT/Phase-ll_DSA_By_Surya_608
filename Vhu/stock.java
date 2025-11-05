import java.util.*;
public class stock {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.i;
        int dp[]=new int[]
        public int maxProfit(int[] prices) {
            int maxi=0;int pur=prices[0];
            for(int i=0;i<prices.length;i++)
            {
                if(prices[i]>pur)
                {
                    maxi=Math.max(maxi,prices[i]-pur);
                }
                else
                {
                    pur=Math.min(pur,prices[i]);
                }
            }
            return maxi;
            
        }
    }
    }
    
}
