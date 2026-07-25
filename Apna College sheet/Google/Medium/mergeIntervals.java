import java.util.*;
class mergeIntervals {
    public int[][] merge(int[][] intervals) {
        List<int[]> list = new ArrayList<>();
        if(intervals.length<=1) return intervals; 
        Arrays.sort(intervals, (a,b) -> (a[0]-b[0]));

        int[] curr = intervals[0];

        for(int i=1;i<intervals.length;i++){
            int[] second = intervals[i];
            //1 case : intervals within the range
            if(second[0]<=curr[1]){
                curr[1] = Math.max(second[1],curr[1]);
            }else{
                list.add(curr);
                curr=second;
            }
        }
        list.add(curr);

        return list.toArray(new int[list.size()][2]);
    }
}