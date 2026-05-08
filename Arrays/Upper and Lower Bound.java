class Solution {
    int lowerBound(int[] arr, int target) {
        // code here
        int left=0;
        int right=arr.length-1;
        int max=arr.length;
        while(left<=right){
            int mid=left+(right-left)/2;
            
            if(arr[mid]>=target){
                right=mid-1;
                max=mid;
            }
            else{
                left=mid+1;
            }
        }
        
        return max;
    }
}

class Solution {
    int upperBound(int[] arr, int target) {
        // code here
        int max=arr.length;
        int left=0;
        int right=arr.length-1;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(arr[mid]>target){
                right=mid-1;
                max=mid;
            }
            else{
                left=mid+1;
            }
        }
        
        return max;
    }
}
