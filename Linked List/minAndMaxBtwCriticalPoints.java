public class minAndMaxBtwCriticalPoints {
    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public int[] nodesBetweenCriticalPoints(ListNode head) {
        int firstIdx = -1;
        int lastIdx = -1;
        int prev = head.val;
        ListNode curr = head.next;
        int minDis = Integer.MAX_VALUE;
        int idx = 1;
        while (curr.next != null) {
            int currVal = curr.val;
            int nextVal = curr.next.val;

            boolean minima = currVal < prev && nextVal > currVal;
            boolean maxima = currVal > prev && nextVal < currVal;

            if (minima || maxima) {
                if (firstIdx == -1) {
                    firstIdx = idx;
                } else {
                    minDis = Math.min(minDis, idx - lastIdx);
                }
                lastIdx = idx;
            }

            idx++;
            prev = curr.val;
            curr = curr.next;
        }

        if (firstIdx == -1 && firstIdx == lastIdx) {
            return new int[] { -1, -1 };
        }

        int maxDis = lastIdx - firstIdx;

        return new int[] { minDis, maxDis };
    }
}
