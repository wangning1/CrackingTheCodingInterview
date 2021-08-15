/**
 * @authour winner
 * @Date 2021/8/15 20:53
 */
public class _02_04_PartitionList {

    public static ListNode partition(ListNode head, int x) {
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode slow = dummy;
        ListNode fast = dummy;
        while (fast.next != null) {
            if (fast.next.val < x) {
                if (slow.next == fast.next) {
                    slow = slow.next;
                    fast = fast.next;
                } else {
                    ListNode tmp = fast.next;
                    fast.next = fast.next.next;
                    tmp.next = slow.next;
                    slow.next = tmp;
                    slow = slow.next;
                }
            } else {
                fast = fast.next;
            }
        }

        return dummy.next;
    }
}
