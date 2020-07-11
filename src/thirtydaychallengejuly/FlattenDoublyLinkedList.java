package thirtydaychallengejuly;

public class FlattenDoublyLinkedList {

    public static class Node {
        public int val;
        public Node prev;
        public Node next;
        public Node child;

        public Node(int val) {
            this.val = val;
        }
    }

    public Node flatten(Node head) {
        Node curr = head;
        while (curr != null) {
            if (curr.child != null) {
                curr = flattenRec(curr);
            }
            curr = curr.next;
        }
        return head;
    }

    private Node flattenRec(Node head) {
        Node next = head.next;
        head.next = head.child;
        head.child.prev = head;
        head.child = null;

        Node curr = head.next;
        while (curr.next != null || curr.child != null) {
            if (curr.child != null) {
                curr = flattenRec(curr);
            } else {
                curr = curr.next;
            }
        }
        curr.next = next;
        if (next != null) {
            next.prev = curr;
        }
        return curr;
    }
}
