/*
class Node {
    int data;
    Node next;

    Node(int d){
        data=d;
        next=null;
   }
}
*/

class Solution {
    public Node rotate(Node head, int k) {
        // code here
        if(head==null || head.next==null || k==0){
            return head;
        }
        int size=0;
        Node temp=head;
        while(temp!=null){
            temp=temp.next;
            size++;
        }
        k=k%size;
        if(k==0) return head;
        temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=head;
        Node curr=head;
        for(int i=0;i<k-1;i++){
            curr=curr.next;
        }
        head=curr.next;
        curr.next=null;
        
        return head;
        
    }
}