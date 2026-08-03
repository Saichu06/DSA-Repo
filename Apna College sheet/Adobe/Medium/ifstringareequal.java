import java.util.*;
class ifstringareequal {
    public boolean closeStrings(String word1, String word2) {
        if(word1.length()!=word2.length()){
            return false;
        }

        int[] freq1 = new int[26];
        int[] freq2 = new int[26];

        for(char c1 : word1.toCharArray()){
            freq1[c1-'a']++;
        }

        for(char c2 : word2.toCharArray()){
            freq2[c2-'a']++;
        }


        for(int i=0;i<26;i++){
            if((freq1[i]==0 && freq2[i]!=0) || (freq1[i]!=0 && freq2[i]==0)){
                return false;
            }
        }

        Arrays.sort(freq1);
        Arrays.sort(freq2);

        return Arrays.equals(freq1,freq2);
    }
}