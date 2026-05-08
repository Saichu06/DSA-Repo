class Solution {
    public String sortSentence(String s) {
       Map<Integer, String> map = new HashMap<>();
        int n = s.length();
        int i = 0;

        while (i < n) {
            String word = "";
            while (i < n && Character.isLetter(s.charAt(i))) {
                word += s.charAt(i);
                i++;
            }

            int pos = s.charAt(i) - '0';
            map.put(pos, word);
            i++;

            if (i < n && s.charAt(i) == ' ') {
                i++;
            }
        }

        String ans="";
        for(int j=1;j<=map.size();j++){
            String currWord=map.get(j);
            ans+=currWord;
            if(j!=map.size()) ans+=" ";
        }

        return ans;
    }
}