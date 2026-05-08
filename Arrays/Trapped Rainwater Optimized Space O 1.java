public class Main {
    public static void main(String[] args) {
        int n=arr.length;
        int l=0;
        int r=n-1;

        int rmax=height[r];
        int lmax=height[l];

        while(l<r){
            if(lmax<rmax){
                l++;
                lmax=Math.max(lmax,height[l]);
                res+=(lmax-height[l]);
            }
            else{
                r--;
                rmax=Math.max(rmax,height[r]);
                res+=(rmax-height[r]);
            }
        }

        return res;

    }
}