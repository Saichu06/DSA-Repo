/*
class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}
*/

class Solution {
    public Node addTwoLists(Node head1, Node head2) {
        head1=reverse(head1);
        head2=reverse(head2);
        Node dummy=new Node(-1);
        Node curr=dummy;
        int carry=0;
        while(head1!=null || head2!=null || carry!=0){
            int v1=(head1!=null)?head1.data:0;
            int v2=(head2!=null)?head2.data:0;
            int sum=v1+v2+carry;
            
            int digit=sum%10;
            
            carry=sum/10;
            
            curr.next=new Node(digit);
            curr=curr.next;
            
            head1=(head1!=null)?head1.next:null;
            head2=(head2!=null)?head2.next:null;
        }
        
        Node result=reverse(dummy.next);
        
        while(result!=null && result.data==0 && result.next!=null){
            result=result.next;
        }
        
        return result;
    }
    
    public Node reverse(Node temp){
        Node curr=temp;
        Node next=null;
        Node prev=null;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        
        return prev;
    }
}