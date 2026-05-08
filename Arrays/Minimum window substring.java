class Solution {
    public String minWindow(String s, String t) {
        int[] mapS=new int[256];
        int[] mapT=new int[256];

        for(char ch:t.toCharArray()) mapT[ch]++;

        int left=0;
        int right=0;
        int minlen=Integer.MAX_VALUE;
        int minstart=0;

        for(;right<s.length();right++){
            mapS[s.charAt(right)]++;
            while(contains(mapT,mapS)){
                if(right-left+1<minlen){
                    minlen=right-left+1;
                    minstart=left;
                }
                mapS[s.charAt(left++)]--;
            }
        }

        return minlen==Integer.MAX_VALUE? "": s.substring(minstart,minstart+minlen);
    }

    private boolean contains(int[] mapT,int[] mapS){
        for(int i=0;i<256;i++){
            if(mapT[i]>mapS[i]) return false;
        }
        return true;
    }
}