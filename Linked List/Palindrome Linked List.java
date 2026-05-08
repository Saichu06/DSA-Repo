class Solution {
    public boolean isPalindrome(ListNode head) {
       ListNode temp=head;
       Stack<Integer> st=new Stack<>();
       while(temp!=null){
           st.push(temp.val);
           temp=temp.next;
       }

       ListNode curr=head;
       while(curr!=null){
           if(curr.val!=(st.pop())){
                return false;
           }
           curr=curr.next;
       }

       return true;
    }
}