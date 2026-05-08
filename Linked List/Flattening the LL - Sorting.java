/*
class Node {
    int data;
    Node next;
    Node bottom;

    Node(int x) {
        data = x;
        next = null;
        bottom = null;
    }
}
*/
class Solution {
    public Node flatten(Node root) {
        //sorting
        List<Integer> list=new ArrayList<>();
        Node temp=root;
        while(temp!=null){
            list.add(temp.data);
            
            Node curr=temp.bottom;
            while(curr!=null){
                list.add(curr.data);
                curr=curr.bottom;
            }
            temp=temp.next;
        }
        
        Collections.sort(list);
    
        Node head=null;
        Node tail=null;
        for(int c:list){
            Node curr=new Node(c);
            if(head==null){
                head=curr;
            }
            else{
                tail.bottom=curr;
            }
            tail=curr;
        }
        
        return head;
    }
}