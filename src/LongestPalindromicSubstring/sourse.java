package LongestPalindromicSubstring;

public class sourse {
    public String longestPalindrome(String s) {
        String strMax="";
        int lenMax=0;
        String str;
        int len=s.length();

        for (int i=0;i<len;i++){
            int end=s.length();
            while (i<end){
                if(end-i<=lenMax)
                    break;
                str=s.substring(i,end);

                if (checkPalim(str)){
                    strMax=str;
                    lenMax=str.length();
                }
                end--;
            }

        }
        return strMax;
    }
    public  Boolean checkPalim(String str){
        int len=str.length();
        if (len%2==0){
            len/=2;
        }
        else {
            len--;
            len/=2;
        }
        int start=0;
        int end= str.length()-1;
        while (start<end){
            if(str.charAt(start)!=str.charAt(end))
                return false;
            start++;
            end--;
        }
        return  true;
    }
}
