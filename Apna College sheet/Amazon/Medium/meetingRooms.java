import java.util.*;
class meetingRooms {
    public int minMeetingRooms(int[] start, int[] end) {
        // code here
        Arrays.sort(start);
        Arrays.sort(end);
        int ans=0;
        int i=0;
        int j=0;
        int n=start.length;
        int rooms=0;
        while(i<n){
            if(start[i]<end[j]){
                rooms++;
                i++;
                ans=Math.max(rooms,ans);
            }else{
                rooms--;
                j++;
            }
        }
        
        return ans;
    }
}
