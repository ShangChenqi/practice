package leetcode;


/**
 * 题目描述：对于一个给定的链表，返回环的入口节点，如果没有环，返回null
 * 计算过程：https://www.nowcoder.com/questionTerminal/6e630519bf86480296d0f1c868d425ad?f=discussion
 */
public class Practice009 {

    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public ListNode detectCycle(ListNode head) {
        if (head == null) {
            return null;
        }

        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                break;
            }
        }

        if (fast == null || fast.next == null) {
            return null;
        }

        ListNode start = head;
        ListNode meet = slow;
        while (start != meet) {
            start = start.next;
            meet = meet.next;
        }
        return start;
    }
}
