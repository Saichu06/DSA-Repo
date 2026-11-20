import java.util.Arrays;

public class assignCookie {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int child = 0;
        int cookie = 0;
        int n = g.length;
        int m = s.length;

        int count = 0;

        while (cookie < m && child < n) {
            if (s[cookie] >= g[child]) {
                count++;
                cookie++;
                child++;
            } else {
                cookie++;
            }
        }

        return count;
    }
}
