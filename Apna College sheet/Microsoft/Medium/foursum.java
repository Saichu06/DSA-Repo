import java.util.*;
class foursum {

    public List<List<Integer>> fourSum(int[] nums, int target) {

        Arrays.sort(nums);

        Set<List<Integer>> set = new HashSet<>();

        int n = nums.length;

        for(int i=0;i<n;i++){

            for(int j=i+1;j<n;j++){

                for(int k=j+1;k<n;k++){

                    long newTarget =
                        (long)target
                        - nums[i]
                        - nums[j]
                        - nums[k];

                    int left = k+1;
                    int right = n-1;

                    while(left<=right){

                        int mid = left+(right-left)/2;

                        if(nums[mid]==newTarget){

                            List<Integer> quad = new ArrayList<>();

                            quad.add(nums[i]);
                            quad.add(nums[j]);
                            quad.add(nums[k]);
                            quad.add(nums[mid]);

                            set.add(quad);
                            break;
                        }

                        else if(nums[mid]>newTarget){
                            right=mid-1;
                        }

                        else{
                            left=mid+1;
                        }
                    }
                }
            }
        }

        return new ArrayList<>(set);
    }
}