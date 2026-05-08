
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int size=0;
        ListNode temp=head;
        while(temp!=null){
            temp=temp.next;
            size++;
        }
        int nth=size-n;

        if(nth==0){
            head=head.next;
            return head;
        }
        ListNode curr=head;
        for(int i=1;i<nth;i++){
            curr=curr.next;
        }

        curr.next=curr.next.next;

        return head;
    }
}