package PascalTriangle;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {
    public static List<List<Integer>> generate(int numRows) {
        numRows++;
        List<List<Integer>> listPascal=new ArrayList<List<Integer>>();
        List<Integer> firstStr=new ArrayList<Integer>();
        firstStr.add(1);
        listPascal.add(firstStr);
        List<Integer> lastList=firstStr;
        for (int i=2;i<=numRows;i++){
            List<Integer> str=new ArrayList<Integer>();
            str.add(1);
            for (int j=1;j<i;j++){
                if(j==i-1){
                    str.add(1);
                }
                else {
                    str.add(lastList.get(j-1)+lastList.get(j));
                }
            }
            listPascal.add(str);
            lastList=str;
        }
        return listPascal;
    }
}
