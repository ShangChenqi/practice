package niukeOffer;

/**
 * 题目描述：给一个链表，若其中包含环，请找出该链表的环的入口结点，否则，输出null。
 */
public class Practice55 {

    class ListNode {
        int val;
        ListNode next;
    }

    //设置快慢指针。
    //数学推导略。。。
    public ListNode EntryNodeOfLoop(ListNode pHead) {
        ListNode fast = pHead;
        ListNode low = pHead;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            low = low.next;
            if (fast == low) {
                break;
            }
        }
        if (fast == null || fast.next == null) {
            return null;
        }

        //一个指针从链表头出发，另一个从相遇点出发
        low = pHead;
        while (low != fast) {
            low = low.next;
            fast = fast.next;
        }

        return low;
    }
}
