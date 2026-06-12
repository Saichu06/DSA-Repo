class removenthNode {
    public ListNode removeNthFromEnd(ListNode head, int n) {

        int size = 0;
        ListNode temp = head;

        while(temp != null){
            size++;
            temp = temp.next;
        }

        if(size == n){
            return head.next;
        }

        int steps = size - n - 1;

        temp = head;

        while(steps-- > 0){
            temp = temp.next;
        }

        temp.next = temp.next.next;

        return head;
    }
}