
class Solution {
    Node deleteNode(Node head, int x) {
        if(head==null){
            return null;
        }
        
        Node temp=head;
        
        if(x==1){
            head=head.next;
        }
        
        for (int i = 1; temp != null && i < x-1; i++) {
            temp = temp.next;
        }
        
        if(temp==null || temp.next==null){
            return head;
        }
        
        temp.next=temp.next.next;
        
        return head;
    }
}