class Solution {
    public String reorganizeString(String s) {
        int[] hash=new int[26];
        for(char c:s.toCharArray()){
            hash[c-'a']++;
        }

        int max=0;
        int letter=0;
        for(int i=0;i<26;i++){
            if(hash[i]>max){
                max=hash[i];
                letter=i;
            }
        }

        if(max>(s.length()+1)/2) return "";

        char[] ans=new char[s.length()];

        //to place most freq first
        int idx=0;
        while(hash[letter]-->0){
            ans[idx]=(char)('a'+letter);
            idx+=2;
        }

        //to place remaining characters
        for(int i=0;i<hash.length;i++){
            while(hash[i]-->0){
                if(idx>ans.length-1) idx=1;
                ans[idx]=(char)('a'+i);
                idx+=2;
            }

        }

        return String.valueOf(ans);
    }
}