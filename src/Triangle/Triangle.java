package Triangle;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Triangle {
    public static int minimumTotal(List<List<Integer>> triangle) {
        int[][] triangleSum=new int[triangle.size()][];
        for (int i=0;i<triangle.size();i++){
            triangleSum[i]=new int[i+1];
            for (int j=0;j<i+1;j++)
                triangleSum[i][j]=Integer.MAX_VALUE;
        }


        triangleSum[0][0]= triangle.get(0).get(0);
        for (int i=0;i<triangleSum.length-1;i++){
            var listOut= triangle.get(i+1);
            for (int j=0;j<triangleSum[i].length;j++){
                int sum=triangleSum[i][j]+listOut.get(j);
                if ( triangleSum[i+1][j]>sum)
                    triangleSum[i+1][j]=sum;
                sum=triangleSum[i][j]+listOut.get(j+1);
                if ( triangleSum[i+1][j+1]>sum)
                    triangleSum[i+1][j+1]=sum;
            }
        }
        int min=Integer.MAX_VALUE;
        for (int i=0;i<triangleSum[triangleSum.length-1].length;i++){
            if(triangleSum[triangleSum.length-1][i]<min)
                min=triangleSum[triangleSum.length-1][i];
        }
        return min;
    }
}
