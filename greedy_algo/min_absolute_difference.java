import java.util.*;

public class min_absolute_difference {
    public static void main(String[] args) {
        int a[]={1,5,2,4,3};
        int b[]={1,2,3,9,5};
        int mindif=0;
        Arrays.sort(a);
        Arrays.sort(b);
        for(int i=0;i<a.length;i++)
        {
            mindif+=Math.abs(a[i]-b[i]);
        }
        System.out.println(mindif);                     
    }
}
