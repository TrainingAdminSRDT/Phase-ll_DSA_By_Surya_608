import java.util.*;
public class nqueens {
    public static boolean issafe(String ar[][],int row,int col)
    {
        //vertically up
        for(int i=row;i>=0;i--)
        {
            if(ar[i][col].equals("Q"))
            return false;
        }

        //left diagonal up
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--)
        {
            if(ar[i][j].equals("Q"))
            {
                return false;
            }
        }


        //right diagonal up
        for (int i = row - 1, j = col + 1; i >= 0 && j < ar.length; i--, j++) 
        {
                if(ar[i][j].equals("Q"))
                {
                return false;
            }
        }
    return true;
    }
    public static void nqeen(String ar[][],int row)
    {
//base case
if(row==ar.length)
{
    printl(ar); count++;
    return;
}
//recursion kaam
for(int i=0;i<ar.length;i++)
{
    if(issafe(ar, row, i))
    {
    ar[row][i]="Q";
    nqeen(ar, row+1 );
    ar[row][i]="X";
}
}

    }
    static int count =0;
    public static void printl(String ar[][])
    {
        System.out.println("----------- new variation-----------");
for(int i=0;i<ar.length;i++)
{
    for(int j=0;j<ar[0].length;j++)
    {
        System.out.print(ar[i][j]+" ");
    }
    System.out.println();
}
    }
 public static void main(String[] args) {
    Scanner sc =new Scanner(System.in);
    int n=4;
    String ar[][]=new String [n][n];
    for(int i=0;i<n;i++)
    {
        for(int j=0;j<n;j++)
        {
            ar[i][j]="x";
        }
    }
    nqeen(ar,0);
    System.out.println(" no of ways to place n queens are="+count);
 }   
}
