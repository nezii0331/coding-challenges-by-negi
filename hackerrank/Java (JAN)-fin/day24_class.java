// 142. Linked List Cycle II

/**
 * Definition for singly-linked list.
 * class ListNode {
 * int val;
 * ListNode next;
 * ListNode(int x) {
 * val = x;
 * next = null;
 * }
 * }
 */
public class day24_class {
    public ListNode detectCycle(ListNode head) {
        if (head == null) {
            return null;
        }

        ListNode First = head;
        ListNode Second = head;

        while (First != null && First.next != null) {
            Second = Second.next;
            First = First.next.next;

            if (Second == First) {
                ListNode p = head; // start from the beginning
                ListNode q = Second; // from the last

                while (p != q) {
                    p = p.next;
                    q = q.next;
                }
                return p;
            }
        }
        return null;
    }
}