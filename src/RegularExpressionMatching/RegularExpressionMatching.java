package RegularExpressionMatching;

public class RegularExpressionMatching {
    public boolean isMatch(String s, String p) {

        boolean nextNullAndMany = false;

        int indexS = 0;
        for (int i = 0; ; i++) {
            if(i>=p.length()){
                if (i+indexS<s.length())
                    return false;
                else return true;
            }


            if (i != p.length() - 1 && p.charAt(i + 1) == '*') {
                nextNullAndMany = true;
            }
            if(i+indexS>=s.length()){
                if (nextNullAndMany)
                {
                    i++;
                    nextNullAndMany=false;
                    continue;
                }

                else
                    return false;
            }
            else {
                if (p.charAt(i) == s.charAt(i + indexS)) {
                    if (nextNullAndMany) {
                        i--;
                        indexS++;
                        continue;
                    } else
                        continue;
                } else if (nextNullAndMany) {
                    if (p.charAt(i) == '.'){
                        if(i+1==p.length()-1){
                            return true;
                        }
                        else return false;
                    }

                    else {
                        nextNullAndMany = false;
                        indexS-=2;
                        i++;
                    }
                }
            }




        }

    }
}