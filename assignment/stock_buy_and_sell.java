

public class stock_buy_and_sell {
    public static int profit(int arr[])
    {int mini=arr[0];int maxprofit=0;
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]>mini)
            {
                maxprofit=Math.max(maxprofit,arr[i]-mini);
            }
            else{
                mini=Math.min(mini,arr[i]);
            }

        }
        if(maxprofit>0)
        {
            return maxprofit;
        }
        return 0;
    }
    public static void main(String[] args) {
        
        int arr[]={1,5,2,6,4,9,3};
        System.out.println(profit(arr));
    }
    
}
