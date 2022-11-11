package UniquePathsII;

public class UniquePathsII {
    public static int uniquePathsWithObstacles(int[][] obstacleGrid) {

        int m=obstacleGrid.length;
        int n=obstacleGrid[0].length;
        if(obstacleGrid[m-1][n-1]==1||obstacleGrid[0][0]==1)
            return 0;
        var matrix=new int[m][n];
        for (int i=0; i<matrix.length;i++){
            if(obstacleGrid[i][0]==1)
                break;
            matrix[i][0]=1;
        }
        for (int i=0; i<matrix[0].length;i++){
            if(obstacleGrid[0][i]==1)
                break;
            matrix[0][i]=1;
        }

        for(int i=1;i< matrix.length;i++)
            for (int j=1;j<matrix[0].length;j++){
                if(obstacleGrid[i-1][j]==0)
                    matrix[i][j]+=matrix[i-1][j];
                if(obstacleGrid[i][j-1]==0)
                    matrix[i][j]+=matrix[i][j-1];
            }
        return matrix[matrix.length-1][matrix[0].length-1];
    }
}
