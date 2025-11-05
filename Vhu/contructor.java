 import java.util.*;
 public class contructor {
    public static void main(String[] args) {
        Toppers s1=new Toppers(300,2);
        Toppers s2=new Toppers(345,1);
        Toppers s3=new Toppers(298,3);
        Toppers s4=new Toppers(297,4);
        
    if(s2.marks>s1.marks)
    {
        System.out.println("student with="+s2.marks+" has secured the rank "+s2.rank);
    }
    }
    
}
class Toppers
{
    int marks;int rank;
    Toppers(int marks,int rank)
    {
        this.marks=marks;
        this.rank=rank;
    }
}
