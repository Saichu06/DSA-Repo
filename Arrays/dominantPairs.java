class dominantPairs {
    public int dominantPairs(int[] arr) {

        int n = arr.length;
        int mid = n / 2;

        Arrays.sort(arr, mid, n);

        int count = 0;

        for (int i = 0; i < mid; i++) {

            int left = mid;
            int right = n;

            while (left < right) {

                int m = left + (right - left) / 2;

                if ((long) arr[m] * 5 <= arr[i]) {
                    left = m + 1;
                } else {
                    right = m;
                }
            }

            count += left - mid;
        }

        return count;
    }
}