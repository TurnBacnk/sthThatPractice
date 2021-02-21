package LeetCodePrograming;


public class CommonStr {
    public String longestCommonPrefix(String[] strs){
        int minLength = strs[0].length();
        String rs = "";
        for (int i = 1; i < strs.length; i++) {
            if (strs[i].length()<minLength){
                minLength = strs[i].length();
            }
        }
        for (int i = 0; i < minLength; i++) {
            for (int j = 0; j < strs.length; j++) {
                if (strs[0].substring(i,i+1).equals(strs[j+1].substring(i,i+1))){

                }
                else {
                    return rs;
                }
            }
            rs = rs+strs[0].substring(i,i+1);
        }
        return rs;
    }
}
