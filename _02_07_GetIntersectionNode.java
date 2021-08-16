public class _02_07_GetIntersectionNode {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) {
            return null;
        }

        int lenA = getListLen(headA);
        int lenB = getListLen(headB);
        ListNode pA = headA;
        ListNode pB = headB;
        if (lenA > lenB) {
            int len = lenA - lenB;
            while (len-- > 0) {
                pA = pA.next;
            }
        } else if (lenA < lenB) {
            int len = lenB - lenA;
            while (len-- > 0) {
                pB = pB.next;
            }
        }

        while (pA != pB) {
            pA = pA.next;
            pB = pB.next;
        }

        return pA;
    }

    private int getListLen(ListNode head) {
        int i = 0;
        while (head != null) {
            i++;
            head = head.next;
        }
        return i;
    }
}
