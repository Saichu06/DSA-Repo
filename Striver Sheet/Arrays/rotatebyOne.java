class rotatebyOne {
    int[] arr = { 1, 2, 3, 4, 5 };

    public void rotate(int[] arr) {
        // code here
        int n = arr.length;
        int right = n - 1;
        int left = 0;
        while (left != right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
        }
    }
}