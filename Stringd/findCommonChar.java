import java.util.*;
class FindCommonChar {
    public List<String> commonChars(String[] words) {
        List<String> list = new ArrayList<>();
        int n = words.length;
        int[] minFreq  = new int[26];
        Arrays.fill(minFreq , Integer.MAX_VALUE);

        for(String str : words){
            int[] currFreq = new int[26];
            for(char curr : str.toCharArray()){
                currFreq[curr-'a']++;
            }
            for(int i=0;i<26;i++){
                minFreq[i]=Math.min(minFreq[i],currFreq[i]);
            }
        }

        for(int i=0;i<26;i++){
            while(minFreq[i]>0){
                list.add(""+(char)(i+'a'));
                minFreq[i]--;
            }
        }

        return list;
    }
}