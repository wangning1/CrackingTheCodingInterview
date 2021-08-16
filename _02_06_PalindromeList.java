public class _02_06_PalindromeList {
    private ListNode frontPointer;
    public boolean isPalindrome(ListNode head) {
        frontPointer = head;
        return recursivelyCheck(head);
    }

    public boolean recursivelyCheck(ListNode currentNode) {
        if (currentNode != null) {
            if (!recursivelyCheck(currentNode.next)) {
                return false;
            }

            if (currentNode.val != frontPointer.val) {
                return false;
            }

            frontPointer = frontPointer.next;
        }
        return true;
    }
}
