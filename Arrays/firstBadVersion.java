class VersionControl {

    // Change this value to test different cases
    private static final int FIRST_BAD_VERSION = 4;

    public boolean isBadVersion(int version) {
        return version >= FIRST_BAD_VERSION;
    }
}

public class FirstBadVersion extends VersionControl {

    public int firstBadVersion(int n) {

        int left = 1;
        int right = n;

        while (left <= right) {

            int mid = left + (right - left) / 2;

            if (isBadVersion(mid)) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return left;
    }

    public static void main(String[] args) {

        FirstBadVersion solution = new FirstBadVersion();

        int n = 5;

        System.out.println("First Bad Version = " + solution.firstBadVersion(n));
    }
}