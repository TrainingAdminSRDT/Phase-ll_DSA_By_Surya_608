import java.util.*;
public class basic_operation {
    public static void main(String[] args) {
        HashMap<String,Integer>hs=new HashMap<>();
        hs.put("india", 100);
        hs.put("China", 150);
         hs.put("Nepal", 10);
          hs.put("Bangladesh", 20);
           hs.put("Bhandi", 140);
            hs.put("ind", 1);
         /*   { System.out.println(hs.get("india"));
            hs.put("india", 110);
             System.out.println(hs.get("india"));
             System.out.println(hs.containsKey("pakistan"));
             hs.remove("China");
             System.out.println(hs.containsKey("China"));System.out.println(hs);}*/
             //if we iterate over thehSHMAP
             Set<String>keys=hs.keySet();
             System.out.println(keys);
             //if we want to print all values associated with keys
             for (String k : keys) {
                System.out.print(k+"="+hs.get(k)+" ");
                
             }

    }
}
