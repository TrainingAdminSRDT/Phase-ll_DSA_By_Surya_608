import java.util.*;
public class max_length_chain_of_pair {
    public static void main(String[] args) {
        int pair[][]={{5,24},{39,60},{5,28},{27,40},{50,90}};
        Arrays.sort(pair,Comparator.comparingInt(o->o[1]));
        int maxchain=1;
        int lastend=pair[0][1];
        for(int i=1;i<pair.length;i++)
        {
            if(pair[i][0]>lastend)
            {
                maxchain++;
                lastend=pair[i][1];
            }
        }
        System.out.println(maxchain);
    }
}
