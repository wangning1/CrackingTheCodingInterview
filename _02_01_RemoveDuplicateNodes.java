import java.util.HashSet;
import java.util.Set;

/**
 * @authour winner
 * @Date 2021/8/15 20:06
 */
public class _02_01_RemoveDuplicateNodes {

    public ListNode removeDuplicateNodes(ListNode head) {
        if (head == null) {
            return head;
        }

        Set<Integer> nums = new HashSet<>();
        ListNode dummy  = new ListNode(-1);
        dummy.next = head;
        ListNode p = dummy;
        while (p.next != null) {
            if (nums.contains(p.next.val)) {
               p.next = p.next.next;
            }else {
                nums.add(p.next.val);
                p = p.next;
            }
        }
        return dummy.next;
    }

}
