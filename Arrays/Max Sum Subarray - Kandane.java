class Solution {
    int maxSubarraySum(int[] arr) {
        int maxsum=0;
        for(int i=0;i<arr.length;i++){
            int sum=0;
            for(int j=i;j<arr.length;j++){
                sum+=arr[j];
                if(sum>maxsum){
                    maxsum=sum;
                }
            }
        }
        
        return maxsum;
    }
}



class Solution {
    int maxSubarraySum(int[] arr) {
        int maxsum=Integer.MIN_VALUE;
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            if(sum>maxsum){
                maxsum=sum;
            }
            if(sum<0){
                sum=0;
            }
        }
        return maxsum;
    }
}

