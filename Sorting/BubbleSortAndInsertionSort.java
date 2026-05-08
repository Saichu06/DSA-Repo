import java.util.*;

public class BubbleSortAndInsertionSort {
    static int[] insertionsort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n - 1; i++) {
            int curr = arr[i];
            int prev = i - 1;
            while (prev >= 0 && arr[prev] > curr) {
                arr[prev + 1] = arr[prev];
                prev--;
            }
            arr[prev + 1] = curr;
        }
        return arr;
    }

    static int[] bubblesort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        return arr;
    }

    static void printArray(int[] arr) {
        for (int x : arr) {
            System.out.print(x + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements : ");
        int n = sc.nextInt();
        System.out.println("Enter the elements u want to sort");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        while (true) {
            System.out.println("Which algo u wanna use??");
            System.out.println("1. Insertion Sort");
            System.out.println("2. Bubble sort");
            System.out.println("3. Exit");

            int choice = sc.nextInt();

            if (choice == 3)
                break;

            switch (choice) {
                case 1:
                    insertionsort(arr);
                    printArray(arr);
                    break;
                case 2:
                    bubblesort(arr);
                    printArray(arr);
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        }

    }
}