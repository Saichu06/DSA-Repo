/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode head1, ListNode head2) {
        ListNode dummy=new ListNode(-1);
        ListNode head=dummy;
        while(head1!=null && head2!=null){
            if(head1.val<=head2.val){
                head.next=new ListNode(head1.val);
                head1=head1.next;
            }
            else{
                head.next=new ListNode(head2.val);
                head2=head2.next;
            }
            head=head.next;
        }

        if(head1!=null){
            head.next=new ListNode(head1.val);
        }
        else if(head2!=null){
            head.next=new ListNode(head2.val);
        }

        return dummy.next;

    }
}