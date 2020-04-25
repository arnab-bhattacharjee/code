package thirty_day_challenge;

import java.util.HashMap;

public class LRUCache {

    class Node {
        int val;
        Node prev;
        Node next;

        public Node(int val) {
            this.val = val;
            this.prev = null;
            this.next = null;
        }
    }

    private int capacity;

    private HashMap<Integer, Integer> keyToVal = new HashMap<>();

    private HashMap<Integer, Node> keyToNode = new HashMap<>();

    private Node head = null;

    private Node tail = null;

    public LRUCache(int capacity) {
        this.capacity = capacity;
    }

    public int get(int key) {
        if (keyToNode.containsKey(key)) {
            Node node = keyToNode.get(key);
            if (node.next != null) {
                Node next = node.next;
                Node prev = node.prev;
                if (prev == null) {
                    head = next;
                    head.prev = null;
                } else {
                    prev.next = next;
                    next.prev = prev;
                }
                tail.next = node;
                node.prev = tail;
                tail = tail.next;
                tail.next = null;
            }
            //print();
            return keyToVal.get(key);
        } else
            return -1;
    }

    public void put(int key, int value) {
        if (keyToVal.containsKey(key)) {
            keyToVal.put(key, value);
            get(key);
            //print();
            return;
        }
        if (keyToNode.size()== capacity) {
            Node prevHead = head;
            head = head.next;
            if (head != null)
                head.prev = null;
            keyToVal.remove(prevHead.val);
            keyToNode.remove(prevHead.val);
        }
        Node newNode = new Node(key);
        if (keyToNode.isEmpty()) {
            head = newNode;
            tail = newNode;
            head.prev = null;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = tail.next;
        }
        //print();
        keyToVal.put(key, value);
        keyToNode.put(key, newNode);
    }

    public void print() {
        for (Node node = head; node != null; node = node.next) {
            System.out.print(node.val + ",");
        }
        System.out.println();
    }
}
