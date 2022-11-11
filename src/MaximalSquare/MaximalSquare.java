package MaximalSquare;

public class MaximalSquare {
    public static int MymaximalSquare(char[][] matrix) {
        int maxSquare=0;
        int square;
        for (int i=0;i<matrix.length;i++){
            for (int j=0;j<matrix[0].length&&i<matrix.length;j++){
                if (matrix[i][j]=='1'){
                    boolean squareFlag=true;
                    square=1;
                    while (squareFlag){
                        for (int a=i;a<=i+square;a++)
                            if (j+square>= matrix[0].length||a>= matrix.length||matrix[a][j+square]!='1')
                            {
                                squareFlag=false;
                                break;
                            }
                        for (int b=j;b<=j+square&&squareFlag;b++){
                            if (i+square>= matrix.length||b>= matrix[0].length||matrix[i+square][b]!='1')
                            {
                                squareFlag=false;
                                break;
                            }
                        }
                        square++;

                    }

                    if (square-1>maxSquare)
                        maxSquare=square-1;


                }

            }
        }
        return maxSquare*maxSquare;
    }
    public static int maximalSquare(char[][] matrix)
    {
        int answer = 0;
        int n = matrix.length;
        if (n == 0)
        {
            return 0;
        }
        int m = matrix[0].length;
        if (m == 0)
        {
            return 0;
        }
        for (int sidelength = 1; sidelength <= Math.min(n, m); sidelength++) // sidelength denotes the side length of the sub-matrix
        {
            // i,j are the top left index of the current sub-matrix
            for (int i = 0; i < n; i++)
            {
                for (int j = 0; j < m; j++)
                {
                    if ((i + sidelength > n) || (j + sidelength > m)) //check if the current sub-matrix is not out of bounds
                    {
                        continue;
                    }
                    boolean zero = false;
                    // check if this sub matrix contain any zero or not
                    for (int x = i; x < i + sidelength; x++)
                    {
                        for (int y = j; y < j + sidelength; y++)
                        {
                            if (matrix[x][y] == '0')
                            {
                                zero = true;
                            }
                        }
                    }
                    if (zero == false) // if this does not contain any zero than this is a valid sub matrix
                    {
                        answer = Math.max(answer, sidelength * sidelength);
                    }
                }
            }
        }
        return answer;
    }

}
