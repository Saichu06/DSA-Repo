import java.util.*;
class permutations {
    List<List<Integer>> ans;
    public List<List<Integer>> permute(int[] nums) {
        ans = new ArrayList<>();
        helper(nums , new ArrayList<>());
        return ans;
    }

    public void helper(int[] nums , List<Integer> list){
        if(list.size()==nums.length){
            ans.add(new ArrayList<>(list));
            return;
        }

        for(int i=0;i<nums.length;i++){
            if(nums[i]!=-11){
                int curr=nums[i];
                list.add(curr);
                nums[i]=-11;
                helper(nums,list);
                list.remove(list.size()-1);
                nums[i]=curr;
            }
        }
    }
}