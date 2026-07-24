class longestConseqSequence {
    public int longestConsecutive(int[] nums) {
        Map<Integer,Boolean> map = new HashMap<>();

        //consider all as starting point 
        for(int num : nums){
            map.put(num,true);
        }

        //make the invalid start points as false
        for(int num : nums){
            if(map.containsKey(num-1)){
                map.put(num,false);
            }
        }

        // based on the starting points calculate the lengths
        int longest=Integer.MIN_VALUE;
        for(int num : map.keySet()){
            if(map.get(num)==true){
                int currlen=1;
                int val=num;
                while(map.containsKey(val+1)==true){
                    val++;
                    currlen++;
                }
                longest=Math.max(longest,currlen);
            }
        }

        return longest;
    }
}