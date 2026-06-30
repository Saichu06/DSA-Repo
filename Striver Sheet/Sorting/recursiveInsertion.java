class recursiveInsertion {
    public static void main(String[] args) {
        int[] arr = { 3, 5, 1, 11, 7, 2 };
        int n = arr.length;

        // Start from index 1, as a single element (index 0) is already sorted
        InsertionRec(arr, 1, n);

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    public static void InsertionRec(int[] arr, int i, int n) {
        // Base case: if we've processed all elements, stop
        if (i == n) {
            return;
        }

        int key = arr[i];
        int j = i - 1;

        // Shift elements of arr[0..i-1] that are greater than the key
        // to one position ahead of their current position
        while (j >= 0 && arr[j] > key) {
            arr[j + 1] = arr[j];
            j--;
        }
        arr[j + 1] = key;

        // Recursive call for the next element
        InsertionRec(arr, i + 1, n);
    }
}