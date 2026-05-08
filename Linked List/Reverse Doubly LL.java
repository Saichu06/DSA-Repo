public class Main {
    public static void main(String[] args) {

        if(head==null || head.next==null){
            return head;
        }
        
        Node curr=head;
        Node next,prev=null;
        while(curr!=head){
            next=curr.next;
            curr.next=prev;
            curr.prev=next;
            prev=curr;
            curr=head;
        }

        return prev;

    }
}