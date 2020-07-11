package thirtydaychallengejuly;

import org.junit.Test;

public class FlattenDoublyLinkedListTest {

    @Test
    public void test1() {
        FlattenDoublyLinkedList flatten = new FlattenDoublyLinkedList();

        FlattenDoublyLinkedList.Node n1 = new FlattenDoublyLinkedList.Node(1);
        FlattenDoublyLinkedList.Node n2 = new FlattenDoublyLinkedList.Node(2);
        FlattenDoublyLinkedList.Node n3 = new FlattenDoublyLinkedList.Node(3);

        n1.child=n2;
        n2.child=n3;

        flatten.flatten(n1);
    }

}