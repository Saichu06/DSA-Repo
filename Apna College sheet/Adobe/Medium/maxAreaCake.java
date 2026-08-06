import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class maxAreaCake {
    public int maxArea(int h, int w, int[] horizontalCuts, int[] verticalCuts) {

        List<Integer> hd = new ArrayList<>();
        List<Integer> vd = new ArrayList<>();

        Arrays.sort(horizontalCuts);
        Arrays.sort(verticalCuts);

        hd.add(horizontalCuts[0]);
        vd.add(verticalCuts[0]);

        int m = horizontalCuts.length;
        int n = verticalCuts.length;

        for(int i = 0; i < m - 1; i++){
            hd.add(horizontalCuts[i + 1] - horizontalCuts[i]);
        }

        for(int i = 0; i < n - 1; i++){
            vd.add(verticalCuts[i + 1] - verticalCuts[i]);
        }

        hd.add(h - horizontalCuts[m - 1]);
        vd.add(w - verticalCuts[n - 1]);

        int hmax = Collections.max(hd);
        int vmax = Collections.max(vd);

        int mod = 1_000_000_007;

        return (int)(((long)hmax * vmax) % mod);
    }
}
