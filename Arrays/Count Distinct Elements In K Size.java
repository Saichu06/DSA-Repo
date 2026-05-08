class Solution {
    ArrayList<Integer> countDistinct(int arr[], int k) {
        // code here
        ArrayList<Integer> ans=new ArrayList<>();
        for(int i=0;i<=arr.length-k;i++){
            HashSet<Integer> distinct=new HashSet<>();
            for(int j=i;j<i+k;j++){
                distinct.add(arr[j]);
            }
            ans.add(distinct.size());
        }
        
        return ans;
    }
}



class Solution {
    ArrayList<Integer> countDistinct(int arr[], int k) {
        // Sliding Window Approach
        ArrayList<Integer> ans=new ArrayList<>();
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<k;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        ans.add(map.size());
        
        //we need to cut one element and add one to continue our window
        for(int i=k;i<arr.length;i++){
            //remove the left most element's count 
            map.put(arr[i-k],map.get(arr[i-k])-1);
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
            if(map.get(arr[i-k])==0){
                map.remove(arr[i-k]);
            }
            ans.add(map.size());
        }
        
        return ans;
    }
}