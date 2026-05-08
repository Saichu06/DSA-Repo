class Solution {
    public void reorderList(ListNode head) {
        if (head == null || head.next == null) return;

        // Step 1: Find middle
        ListNode slow = head;
        ListNode fast = head;
        
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // slow = middle node
        ListNode mid = slow;

        // Step 2: Reverse second half
        ListNode curr = mid.next;
        mid.next = null;  // break the list
        
        ListNode prev = null;
        ListNode next = null;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        // prev = head of reversed list

        // Step 3: Merge left and right alternately
        ListNode left = head;
        ListNode right = prev;
        ListNode nextL, nextR;

        while (right != null) {
            nextL = left.next;
            nextR = right.next;

            left.next = right;
            right.next = nextL;

            left = nextL;
            right = nextR;
        }
    }
}
