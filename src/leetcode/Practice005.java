package leetcode;

/**
 * 题目描述：使用插入排序对链表进行排序
 */
public class Practice005 {
    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }


    public ListNode insertionSortList(ListNode head) {
        if (head == null) {
            return null;
        }

        ListNode dummyHead = new ListNode(0);
        ListNode p = head;

        while (p != null) {
            ListNode q = dummyHead;
            while (q.next != null && q.next.val < p.val) {
                q = q.next;
            }
            ListNode s = p;
            p = p.next;
            s.next = q.next;
            q.next = s;
        }
        return dummyHead.next;
    }
}
