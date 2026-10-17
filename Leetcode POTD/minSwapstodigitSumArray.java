class minSwapstodigitSumArray {
    public int minSwaps(int[] nums) {
        int n = nums.length;

        int[][] arr = new int[n][2];

        for (int i = 0; i < n; i++) {
            arr[i][0] = nums[i];
            arr[i][1] = i;
        }

        Arrays.sort(arr, (a, b) -> {
            int num1 = digitSum(a[0]);
            int num2 = digitSum(b[0]);

            if (num1 != num2) {
                return Integer.compare(num1, num2);
            }

            return Integer.compare(a[0], b[0]);
        });

        int swaps = 0;

        boolean[] visited = new boolean[n];

        for (int i = 0; i < n; i++) {

            if (visited[i] == true || arr[i][1] == i) {
                continue;
            }

            int cycle = 0;
            int j = i;

            while (!visited[j]) {
                cycle++;
                visited[j] = true;
                j = arr[j][1];
            }

            swaps += (cycle - 1);
        }

        return swaps;
    }
}