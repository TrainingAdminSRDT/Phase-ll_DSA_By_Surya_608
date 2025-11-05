//Given an m x n matrix, return true if the matrix is Toeplitz. Otherwise, return false.

//A matrix is Toeplitz if every diagonal from top-left to bottom-right has the same elements.

public class toeplitz_matrix {
    class Solution {
    public boolean isToeplitzMatrix(int[][] matrix) {
        int el=matrix[0][0];
        for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix[0].length;j++)
            {
                if(i>0&&j>0)
                {
                    if(matrix[i][j]!=matrix[i-1][j-1])
                    {
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
    
}
