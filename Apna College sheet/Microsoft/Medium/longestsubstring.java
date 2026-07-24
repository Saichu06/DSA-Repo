import java.util.*;
class longestsubstring {
    public int lengthOfLongestSubstring(String s) {
        int maxlen=0;
        Set<Character> set = new HashSet<>();
        int left=0;
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            while(set.contains(c)){
                set.remove(s.charAt(left));
                left++;
            }
            maxlen=Math.max(maxlen , i-left+1);
            set.add(c);
        }
        return maxlen;
    }
}