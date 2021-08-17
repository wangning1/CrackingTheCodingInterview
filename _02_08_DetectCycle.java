public class _02_08_DetectCycle {
    public ListNode detectCycle(ListNode head) {
        if (head == null) {
            return head;
        }

        ListNode fast = head;
        ListNode slow = head;
        ListNode ptr = null;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                ptr = slow;
                break;
            }
        }

        if (ptr != null) {
            ListNode qtr = head;
            while (ptr != qtr) {
                qtr = qtr.next;
                ptr = ptr.next;
            }
        }

        return ptr;
    }
}
