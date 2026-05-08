/*
class Node
{
    int data;
    Node next;
}
*/

class Solution {
    public static void removeLoop(Node head) {
        // code here
        Node slow=head;
        Node fast=head;
        boolean cycle=false;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                cycle=true;
                break;
            }
        }
        
        
        if(cycle==false) return;
        
        slow=head;
        Node prev=null;


        if(slow==head){
            while(fast.next!=slow){
                fast=fast.next;
            }
            fast.next=null;
            return;
        }
        
        while(slow!=fast){
            slow=slow.next;
            prev=fast;
            fast=fast.next;
        }
        
        prev.next=null;
    }
}