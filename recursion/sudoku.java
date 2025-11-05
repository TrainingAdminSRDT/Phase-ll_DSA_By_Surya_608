import java.util.*;
public class sudoku {
    public static boolean issafe(int sudokus[][],int row,int col,int dig)
    {
        //column
        for(int i=0;i<=8;i++)
        {
            if(sudokus[i][col]==dig)
            {
                return false;
            }
        }
        //row
        for(int i=0;i<=8;i++)
        {
            if(sudokus[row][i]==dig)
            {
                return false;
            }
        }
        //3by 3 matric
        int sr=(row/3)*3;
        int sc=(col/3)*3;
        for(int i=sr;i<sr+3;i++)
        {
            for(int j=sc;j<sc+3;j++)
            {
                if(sudokus[i][j]==dig)
                {
                    return false;
                }
            }
        }
        return true;
    }
    public static boolean sudokusolver(int sudokus[][],int row,int col)
    {
        //base case
        if(row==9)
        {
            return true;
        }
        //recursion work
        int nextrow=row;int nextcol=col+1;
        if(col==9)
        {
            nextrow=row+1;nextcol=0;

        }
        if(sudokus[row][col]!=0)
        {
          return sudokusolver(sudokus, nextrow, nextcol);

        }
        for(int i=0;i<=9;i++)
        {int digit=i;
            if(issafe(sudokus,row,col, digit))
            {
                sudokus[row][col]=i;
                if(sudokusolver(sudokus,nextrow,nextcol))
                {
                    return true;
                }sudokus[row][col]=0;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int sudokus[][]=new int[9][9];
        sudokus[][]={ {5, 0, 0, 0, 0, 3, 0, 9, 0},
    {0, 0, 3, 0, 8, 0, 6, 0, 0},
    {0, 8, 0, 0, 0, 0, 0, 3, 0},
    {3, 0, 0, 2, 0, 0, 0, 0, 5},
    {0, 0, 7, 0, 5, 0, 3, 0, 0},
    {6, 0, 0, 0, 0, 4, 0, 0, 7},
    {0, 2, 0, 0, 0, 0, 0, 6, 0},
    {0, 0, 5, 0, 3, 0, 8, 0, 0},
    {0, 4, 0, 7, 0, 0, 0, 0, 9}
};
sudokusolver(sudokus,0,0);
        
    }
}
