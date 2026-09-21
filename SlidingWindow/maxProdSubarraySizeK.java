package SlidingWindow;

public class maxProdSubarraySizeK {
    public int findMaxProduct(int[] arr, int k) {
        // code here
        int maxProd = 1;
        int prod = 1;
        for (int i = 0; i < k; i++) {
            prod *= arr[i];
        }

        maxProd = prod;
        for (int i = k; i < arr.length; i++) {
            prod /= (arr[i - k]);
            prod *= (arr[i]);
            maxProd = Math.max(maxProd, prod);
        }

        return maxProd;
    }
}
