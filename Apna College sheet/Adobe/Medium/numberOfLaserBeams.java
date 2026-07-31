import java.util.*;
class numberOfLaserBeams {
    public int numberOfBeams(String[] bank) {
        List<Integer> count = new ArrayList<>();
        int ans = 0;

        for(String str : bank){
            int c = (int) str.chars().filter(ch -> ch=='1').count();
            if(c!=0){
                count.add(c);
            }
        }

        for(int i=0;i<count.size()-1;i++){
            ans = ans + (count.get(i) * count.get(i+1));
        }

        return ans;
    }
}