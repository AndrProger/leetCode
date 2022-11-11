import JumpGame.JumpGame;
import MaximalSquare.MaximalSquare;
import PascalTriangle.PascalTriangle;
import UniquePathsII.UniquePathsII;

import java.util.ArrayList;
import java.util.List;

public class Main {
    static List<String> ans;
    public static void main(String[] args) {


         ans = new ArrayList<String>();
        solve("",0,0,3);
        System.out.println(ans);

    }
    public int countNumbersWithUniqueDigits(int n) {
        // 1 - 10 [0-9]
        // 2 - [1-9][0-10] 11 22 ... у второй цифры может быть одно совпадение
        // поэтому исключяем одно часло и получаем 9*9=81
        // 3 [1-9][0-10][0-10] возможно два совпадение последнего следовательно 9*9*8
        // получаем формулу для каждого 11-n где n-какая то по счету цифра
        if(n==0)
            return 1;
        if(n==1)
            return 10;
        int sum=10;
        int mult=9;
        for (int i=2;i<=n;i++)
        {
            mult*=11-i;
            sum+=mult;
        }
        return sum;
    }
    private static void solve(String str,int left,int right,int n){

        System.out.println("solve called for : " + str + " left : " + left + " right : " + right);
        if(str.length()==2*n)
            ans.add(str);

        if(left<n){
            String temp1 = str;
            temp1+="(";
            solve(temp1,left+1,right,n);
        }

        if(right<left){
            String temp1 = str;
            temp1 += ")";
            solve(temp1,left,right+1,n);
        }

    }

    public int numSquares(int n)
    {
        var sq = (int) Math.sqrt(n);
        if (sq * sq == n) return 1;


        int m = n;
        while (m % 4 == 0) m /= 4;
        if (m % 8 == 7) return 4;

        for (int i = 1; i <= sq; i++)
        {
            if (isSquare(n - i * i)) return 2;
        }
        return 3;
    }

    public boolean isSquare(int n)
    {
        var sq = (int) Math.sqrt(n);
        return (sq * sq == n);
    }
}