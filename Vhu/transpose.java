import java.util.*;
public class transpose {
    public static void main(String[] args) {
        int row,column;
        System.out.println("enter the number of rows and columns");
        Scanner sc=new Scanner(System.in);
        row=sc.nextInt();
        column=sc.nextInt();int arr[][]=new int[row][column];
        System.out.println("enter the elements into array");
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<column;j++)
            {
                arr[i][j]=sc.nextInt();

            }
        }
        //transposing the matix
        for(int i=0;i<column;i++)
        {
            for(int j=0;j<row;j++)
            {
                System.out.print(arr[j][i]+" ");
            }
            System.out.println();
        }
    }
}
