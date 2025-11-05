import java.util.*;
public class indian_coin {
    public static void main(String[] args) {
        Integer coins[]={1,2,5,10,20,50,100,500,2000};
        Arrays.sort(coins,Comparator.reverseOrder());
        int count=0;int amount;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enetr the number");
        {
amount=sc.nextInt();
        }
    for(int i=0;i<coins.length;i++)
    {
        if(coins[i]<=amount)
        {
while(coins[i]<=amount)
{count++;
    amount-=coins[i];

}
        }
    }
    System.out.println(count);
    }
}
