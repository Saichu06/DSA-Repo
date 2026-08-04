import java.util.*;
public class firstMissingPositive {
    public int firstMissingPositive(int[] nums) {
        Set<Integer> set = new HashSet<>();

        for(int num : nums){
            if(num>0) set.add(num);
        }

        int curr = 1;
        while(set.contains(curr)){
            curr++;
        }

        return curr;
    }
}
