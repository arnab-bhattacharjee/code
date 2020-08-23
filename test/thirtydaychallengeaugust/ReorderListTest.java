package thirtydaychallengeaugust;

import org.junit.Test;

import static org.junit.Assert.*;

public class ReorderListTest {

    @Test
    public void test1() {
        ReorderList reorder = new ReorderList();
        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(2);
        ListNode n3 = new ListNode(3);
        ListNode n4 = new ListNode(4);

        n1.next = n2;
        n2.next = n3;
        n3.next = n4;

        reorder.reorderList(n1);
    }

}