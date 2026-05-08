class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int[] ans=new int[k];
        List<Integer>[] bucket=new ArrayList[nums.length+1];
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        for(int key:map.keySet()){
            int freq=map.get(key);
            if(bucket[freq]==null){
                bucket[freq]=new ArrayList<>();
            }
            bucket[freq].add(key);
        }
        int counter=0;

        for(int i=bucket.length-1;i>=0 && counter<k;i--){
            if(bucket[i]!=null){
                for(int val:bucket[i]){
                    ans[counter++]=val;
                    if(counter==k) break;
                }
            }
        }

        return ans;


    }
}