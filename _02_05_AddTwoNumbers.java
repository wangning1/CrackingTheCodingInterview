/**
 * @authour winner
 * @Date 2021/8/15 21:48
 */
public class _02_05_AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if (l1 == null) return l2;
        if (l2 == null) return l1;
        ListNode dummy = new ListNode(-1);
        ListNode p = dummy;
        while (l1 != null && l2 != null) {
            int num = l1.val + l2.val;
            p.next = new ListNode(num);
            p = p.next;
            l1 = l1.next;
            l2 = l2.next;
        }


        if (l1 != null) {
            p.next = l1;
        }

        if (l2 != null) {
            p.next = l2;
        }

        ListNode q = dummy.next;
        ListNode ptr = dummy;
        int addNum = 0;
        while (q != null) {
            int num = q.val + addNum;
            q.val = num % 10;
            System.out.println(q.val);
            addNum = num / 10;
            q = q.next;
            ptr = ptr.next;
        }

        int num = q.val + addNum;
        q.val = num % 10;
        addNum = num / 10;
        if (addNum > 0) {
            ptr.next = new ListNode(addNum);
        }

        return dummy.next;
    }
}
