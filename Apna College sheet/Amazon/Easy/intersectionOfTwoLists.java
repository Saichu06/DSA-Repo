import org.w3c.dom.Node;

public class intersectionOfTwoLists {
    class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    public Node intersectPoint(Node head1, Node head2) {
        // code here
        Node ptr1 = head1;
        Node ptr2 = head2;

        if (ptr1 == null || ptr2 == null) {
            return null;
        }

        while (ptr1 != ptr2) {
            ptr1 = (ptr1 != null) ? ptr1.next : head2;
            ptr2 = (ptr2 != null) ? ptr2.next : head1;
        }

        return ptr1;
    }
}
