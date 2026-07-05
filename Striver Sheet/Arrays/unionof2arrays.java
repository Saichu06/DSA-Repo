import java.util.Arrays;

class unionof2arrays {
    public int[] unionArray(int[] nums1, int[] nums2) {

        int n = nums1.length;
        int m = nums2.length;

        int[] temp = new int[n + m];

        int i = 0, j = 0, k = 0;

        while (i < n && j < m) {

            if (nums1[i] < nums2[j]) {

                if (k == 0 || temp[k - 1] != nums1[i]) {
                    temp[k++] = nums1[i];
                }
                i++;

            } else if (nums1[i] > nums2[j]) {

                if (k == 0 || temp[k - 1] != nums2[j]) {
                    temp[k++] = nums2[j];
                }
                j++;

            } else {

                if (k == 0 || temp[k - 1] != nums1[i]) {
                    temp[k++] = nums1[i];
                }
                i++;
                j++;
            }
        }

        while (i < n) {
            if (k == 0 || temp[k - 1] != nums1[i]) {
                temp[k++] = nums1[i];
            }
            i++;
        }

        while (j < m) {
            if (k == 0 || temp[k - 1] != nums2[j]) {
                temp[k++] = nums2[j];
            }
            j++;
        }

        return Arrays.copyOf(temp, k);
    }
}