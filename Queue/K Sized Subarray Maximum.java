class Solution {
    public ArrayList<Integer> maxOfSubarrays(int[] arr, int k) {
        // code here
        ArrayList<Integer> ans=new ArrayList<>();
        Deque<Integer> dq=new ArrayDeque<>();
        for(int i=0;i<arr.length;i++){
            //remove elements outside the window
            while(!dq.isEmpty() && dq.peekFirst() <= i-k ){
                dq.pollFirst();
            }
            
            //remove smaller elements to reduce size
            while(!dq.isEmpty() && arr[dq.peekLast()]< arr[i]){
                dq.pollLast();
            }
            
            dq.offerLast(i);
            
            if(i>=k-1){
                ans.add(arr[dq.peekFirst()]);
            }
        }
        
        return ans;
        
    }
} 