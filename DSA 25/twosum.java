import java.util.*;
class twosum{
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int num1  = -1;
        int num2  = -1;
        int prefixSum =0;
        int n = nums.length;
        for(int i =0 ;i<n;i++){
            int currNum = nums[i];
            if(map.containsKey(target-currNum)){
                num1=map.get(target-currNum);
                num2=i;
                break;
            }
            map.put(currNum,i);
        }

        return new int[]{
            num1 , num2
        };
    }
}