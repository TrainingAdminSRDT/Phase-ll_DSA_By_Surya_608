public class patter8n {
    public static void main(String[] args) {
       
       int i,j=0; for(i=1;i<=4;i++)
        {
            for(j=1;j<=5;j++)
            {
                if((i==1||i==4||j==1||j==5))
                {
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
               

            }
            
            System.out.println();
        }
        for(i=0;i<4;i++)
        {
            for(j=0;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        for(i=4;i>0;i--)
        {
            for(j=0;j<i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        for(i=0;i<5;i++)
        {
            for(int k=0;k<5-i;k++)
            {
System.out.print(" ");
            }
            for(j=0;j<i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        int l=1;
        for(i=0;i<5;i++)
        {
            for(j=0;j<i;j++)
            {
                System.out.print(l+" ");
                l++;
            }
            System.out.println();
        }
        int m=1;
        for(i=0;i<5;i++)
        {
            for(j=0;j<i;j++)
            {
                if(m%2==0)
                {
                System.out.print("0 ");
                }
                else{
                    System.out.print("1 ");
                }
                m++;
            }
            System.out.println();
        }
        
       
    }
    
}
