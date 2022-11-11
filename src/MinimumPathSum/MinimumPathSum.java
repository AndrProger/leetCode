package MinimumPathSum;

import java.lang.reflect.Array;

public class MinimumPathSum {
    public static int minPathSum(int[][] grid) {
        var matrixSum=new int[grid.length][grid[0].length];

        for (int i=0;i< grid.length;i++){
            for (int j=0;j<grid[0].length;j++){
                matrixSum[i][j]=Integer.MAX_VALUE;
            }
        }
        matrixSum[0][0]=grid[0][0];

        for (int i=0;i< grid.length;i++){
            for (int j=0;j<grid[0].length;j++){
                if(j+1<grid[0].length){
                    if(matrixSum[i][j+1]>matrixSum[i][j]+grid[i][j+1]){
                        matrixSum[i][j+1]=matrixSum[i][j]+grid[i][j+1];
                    }
                }
                if(i+1<grid.length){
                    if(matrixSum[i+1][j]>matrixSum[i][j]+grid[i+1][j]){
                        matrixSum[i+1][j]=matrixSum[i][j]+grid[i+1][j];
                    }
                }
            }
        }
        return  matrixSum[matrixSum.length-1][matrixSum[0].length-1];

    }
}
