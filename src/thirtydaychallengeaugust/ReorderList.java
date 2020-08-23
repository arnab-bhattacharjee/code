package thirtydaychallengeaugust;

public class ReorderList {

    public void reorderList(ListNode head) {
        if (head == null)
            return;

        ListNode slow = head;
        ListNode fast = head;

        while (fast != null) {
            fast = fast.next;
            if (fast != null) {
                slow = slow.next;
                fast = fast.next;
            }
        }

        ListNode prev = slow;
        ListNode curr = prev.next;
        ListNode nxt = curr.next;

        prev.next = null;

        while (nxt != null) {
            curr.next = prev;
            prev = curr;
            curr = nxt;
            nxt = nxt.next;
        }
        curr.next = prev;

        ListNode tail = curr;

        ListNode headItr = head;
        ListNode tailItr = tail;
        while(headItr.next != null && tailItr.next != null) {
            ListNode headNext = headItr.next;
            ListNode tailNext = tailItr.next;

            if (headItr.next != tailItr)
                headItr.next = tailItr;
            if (tailItr.next != headNext)
                tailItr.next = headNext;

            headItr = headNext;
            tailItr = tailNext;
        }

        for (curr = head; curr != null; curr = curr.next)
            System.out.println(curr.next.val);

    }

}
