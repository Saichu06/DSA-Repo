class Solution {
    static ArrayList<Integer> leaders(int arr[]) {
        // code here
        ArrayList<Integer> list=new ArrayList<>();
        int n=arr.length;
        int maxright=arr[n-1];
        list.add(maxright);
        for(int i=n-2;i>=0;i--){
            if(arr[i]>=maxright){
                maxright=arr[i];
                list.add(maxright);
            }
        }
        
        Collections.reverse(list);
        
        return list;
    }
}
