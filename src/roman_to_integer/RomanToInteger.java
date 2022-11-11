package roman_to_integer;

public class RomanToInteger {
    static Roman[]  arr=new Roman[]{
            new Roman('I',1),
            new Roman('V',5),
            new Roman('X',10),
            new Roman('L',50),
            new Roman('C',100),
            new Roman('D',500),
            new Roman('M',1000),
    };

    public static int romanToInt(String s) {
        int sum=0;

        for (int i=0;i<s.length();i++){
            if (i!=s.length()-1){
                for (int j=0;j<arr.length;j++){
                    if (s.charAt(i)==arr[j].symbol)
                    {
                        if (j+1<arr.length && s.charAt(i+1)==arr[j+1].symbol){
                            sum+=arr[j+1].value-arr[j].value;
                            i++;
                            break;
                        }
                        if (j+2<arr.length && s.charAt(i+1)==arr[j+2].symbol){
                            sum+=arr[j+2].value-arr[j].value;
                            i++;
                            break;
                        }
                        else {
                            sum+=arr[j].value;
                        }
                    }
                }
            }
            else {
                for (int j=0;j<arr.length;j++){
                    if (s.charAt(i)==arr[j].symbol)
                    {
                            sum+=arr[j].value;
                    }
                }
            }
        }
        return sum;
    }

}

