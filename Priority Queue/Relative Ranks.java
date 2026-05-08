class Solution {
    public String[] findRelativeRanks(int[] score) {
        PriorityQueue<Integer> pq=new PriorityQueue<>((p1,p2) -> 
        score[p2]-score[p1]);
        int n=score.length;
        String[] ans=new String[n];

        for(int i=0;i<n;i++){
            pq.add(i);
        }

        int rank=1;
        while(pq.size()!=0){
            int curridx=pq.poll();
            if(rank==1) ans[curridx]="Gold Medal";
            else if(rank==2) ans[curridx]="Silver Medal";
            else if(rank==3) ans[curridx]="Bronze Medal";
            else ans[curridx]=String.valueOf(rank);

            rank++;
        }

        return ans;

    }
}