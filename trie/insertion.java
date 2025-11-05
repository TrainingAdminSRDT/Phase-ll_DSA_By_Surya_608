import java.util.*;
public class insertion {
    static class Node
    {
        Node children[]=new Node[26];
        boolean eow=false;
        Node()
        {
            for(int i=0;i<26;i++)
            {
                children[i]=null;
            }
        }
    }
     static Node root=new Node();
    public static void insert(String word)
    {
        Node curr=root;
        for(int level=0;level<word.length();level++)
        {
            int indx=word.charAt(level)-'a';
            if(curr.children[indx]==null)
            {
                curr.children[indx]=new Node();
            }
            curr=curr.children[indx];
        }
        curr.eow=true;
    }
    public static boolean search(String key)
    {
        Node curr=root;
        for(int level=0;level<key.length();level++)
        {
            int indx=key.charAt(level)-'a';
            if(curr.children[indx]==null)
            {
                return false;
            }
            curr=curr.children[indx];

        }
        return curr.eow==true;
    }
    public static void main(String[] args) {
        String word[]={"manav","raghav","the","thee"};
        for(int i=0;i<word.length;i++)
        {
            insert(word[i]);
        }
        System.out.print(search("manav"));
    }
}
