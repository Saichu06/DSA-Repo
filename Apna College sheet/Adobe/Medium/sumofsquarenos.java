public class sumofsquarenos {
    public boolean judgeSquareSum(int c) {
        // List<Long> list = new ArrayList<>();

        // long num = 0;

        // while(num * num <= c){
        //     list.add(num * num);
        //     num++;
        // }

        // int left=0;
        // int right=list.size()-1;
        // while(left<=right){
        //     long sum = list.get(left)+list.get(right);
        //     if(sum==c){
        //         return true;
        //     }
        //     else if(sum>c){
        //         right--;
        //     }else{
        //         left++;
        //     }
        // }

        // return false;

        long left = 0;
        long right = (long)Math.sqrt(c);

        while(left <= right){

            long sum = left * left + right * right;

            if(sum == c)
                return true;

            if(sum < c)
                left++;
            else
                right--;
        }

        return false;
    }
}
