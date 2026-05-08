class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        for(int n:stones){
            pq.add(n);
        }

        while(pq.size()>1){
            int val1=pq.poll();
            int val2=pq.poll();
            if(val1!=val2){
                pq.add(val1-val2);
            }
        }
        return pq.isEmpty()?0:pq.poll();
    }
}