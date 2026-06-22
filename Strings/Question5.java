import java.util.HashMap;

public class Question5 {


    public static char firstUnique(String str) {


        HashMap<Character,Integer> map = new HashMap<>();


        for(char ch : str.toCharArray()) {

            map.put(ch, map.getOrDefault(ch,0)+1);
        }



        for(char ch : str.toCharArray()) {

            if(map.get(ch) == 1) {

                return ch;
            }
        }


        return '_';
    }


    public static void main(String[] args) {


        String str = "aabbcddee";


        System.out.println(firstUnique(str));
    }
}