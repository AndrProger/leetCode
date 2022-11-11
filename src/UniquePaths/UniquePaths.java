package UniquePaths;

public class UniquePaths {
    int count=0;
    public int uniquePaths(int m, int n) {
        var matrix=new int[m][n];
        for (int i=0; i<matrix.length;i++)
            matrix[i][0]=1;
        for (int i=0; i<matrix[0].length;i++)
            matrix[0][i]=1;
        for(int i=1;i< matrix.length;i++)
            for (int j=1;j<matrix[0].length;j++)
                matrix[i][j]=matrix[i-1][j]+matrix[i][j-1];
        return matrix[matrix.length-1][matrix[0].length-1];
    }

}
