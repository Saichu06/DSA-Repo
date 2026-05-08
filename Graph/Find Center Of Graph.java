class Solution {
    public int findCenter(int[][] edges) {
        int n=edges.length+1;
        int[] count=new int[n+1];
        for(int e[]:edges){
            count[e[0]]++;
            count[e[1]]++;
        }
        for(int i=1;i<=n;i++){
            if(count[i]==n-1){
                return i;
            }
        }

        return -1;
    }
}