/**
 * @authour winner
 * @Date 2021/8/15 20:36
 */
public class _02_02_kthToLast {
    public int kthToLast(ListNode head, int k) {
        ListNode fast = head;
        ListNode slow = head;

        while (k-- > 0) {
            fast = fast.next;
        }

        while (fast != null) {
            fast = fast.next;
            slow = slow.next;
        }

        return slow.val;
    }
}
