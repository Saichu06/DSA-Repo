class Solution {
    public int countCharacters(String[] words, String chars) {
        int[] freq=new int[26];
        for(char c:chars.toCharArray()){
            freq[c-'a']++;
        }
        int total=0;
        for(String str : words){
            int[] temp = freq.clone();
            int curr = check(str,temp);
            total+=curr;
        }

        return total;
    }

    public int check(String str , int[] freq){
        for(char c : str.toCharArray()){
            if(freq[c-'a']>=1){
                freq[c-'a']--;
            }
            else{
                return 0;
            }
        }
        return str.length();
    }
}