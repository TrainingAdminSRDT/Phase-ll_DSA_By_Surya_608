import java.util.*;
public class container_with_most_water {
    public static int container(ArrayList<Integer>height)
    {
        int lp=0;int rp=height.size()-1;
        int maxwater=0;
        while(lp<rp)
        {
            int heigh=Math.min(height.get(lp),height.get(rp));
            int width=rp-lp;
            int water=heigh*width;
            maxwater=Math.max(maxwater,water);
            if(height.get(lp)<height.get(rp))
            {
                lp++;
            }
            else{
                rp--;
            }
        }
        return maxwater;

    }
    public static void main(String[] args) {
        ArrayList<Integer>height=new ArrayList<>();
        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);height.add(5);height.add(4);height.add(5);height.add(3);height.add(7);
        System.out.println(container(height));
    }
    
}
