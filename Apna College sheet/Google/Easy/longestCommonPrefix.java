import java.util.*;
class longestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        if(strs==null || strs.length==0) return "";
        Arrays.sort(strs);
        int n = strs.length;
        String curr = strs[0];
        String last = strs[n-1];
        StringBuilder result = new StringBuilder();

        for(int i=0;i<curr.length();i++){
            if(curr.charAt(i)!=last.charAt(i)){
                break;
            }
            result.append(curr.charAt(i));
        }

        return result.toString();

    }
}