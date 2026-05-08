class Solution {
    public boolean subsequence(String sub , String s2){
        int i=0;
        int j=0;
        while(i<sub.length() && j<s2.length()){
            if(sub.charAt(i)==s2.charAt(j)) j++;
            i++;
        }
        
        return j==s2.length();
    }
    
    public String minWindow(String s1, String s2) {
        // code here
        int n=s1.length();
        String ans="";
        int minlen=Integer.MAX_VALUE;
        for(int start=0;start<n;start++){
            for(int end=start;end<n;end++){
                String sub=s1.substring(start,end+1);
                if(subsequence(sub,s2)){
                    if(sub.length()<minlen){
                        minlen=sub.length();
                        ans=sub;
                    }
                    
                    break;
                }
            }
        }
        
        return ans;
    }
}
