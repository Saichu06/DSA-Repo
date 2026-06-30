class recursiveBubble {
    public static void main(String[] args) {
        int[] arr = { 3, 5, 1, 11, 7, 2 };
        int n = arr.length;
        bubbleRec(arr, n);

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    public static void bubbleRec(int[] arr, int n) {
        if (n == 1) {
            return;
        }

        boolean didSwap = false;

        for (int i = 0; i < n - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
                didSwap = true;
            }
        }

        if (!didSwap)
            return;

        bubbleRec(arr, n - 1);
    }
}
