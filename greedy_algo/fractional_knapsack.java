import java.util.*;
public class fractional_knapsack {
public static void main(String[] args) {
    int val[]={60,100,120};
    int weight[]={10,20,30};
    int w=50;
//storing ratio in ascending order in a two-d array 
    double ratio[][]=new double[val.length][2];
    for(int i=0;i<val.length;i++)
    {
        ratio[i][0]=i;
        ratio[i][1]=val[i]/(double)weight[i];
    }
    Arrays.sort(ratio,Comparator.comparingDouble(o->o[1]));
    //now storing the value to find maximumvalue
    int capacity=w;
    int maxval=0;
    for(int i=val.length-1;i>=0;i--)
    {
        int indx=(int)ratio[i][0];
        if(capacity>=weight[indx])
        {
            maxval+=val[indx];
            capacity-=weight[indx];
        }
        else
        {
            maxval+=(capacity*ratio[i][1]);
            capacity=0;
            break;
        }
    }
    System.out.println("maximum value of knapsack is "+maxval);

}    
}
