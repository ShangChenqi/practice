package niukeOffer;

/**
 * 题目描述：在一个排序的链表中，存在重复的结点，请删除该链表中重复的结点，重复的结点不保留，返回链表头指针。 例如，链表1->2->3->3->4->4->5 处理后为 1->2->5
 */
public class Practice56 {
    public class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }

    public ListNode deleteDuplication(ListNode pHead) {
        if (pHead == null) {
            return null;
        }
        // 设置一个头结点
        ListNode singleValueNode = new ListNode(0);
        singleValueNode.next = pHead;
        ListNode pre = singleValueNode;
        ListNode p = pHead;
        ListNode q = p.next;

        while (q != null) {
            if (p.val != q.val) {
                pre = p;
                p = p.next;
                q = q.next;
            } else {
                while (q != null && p.val == q.val) {
                    q = q.next;
                }
                pre.next = q;
                p = pre.next;
                if (q != null) {
                    q = q.next;
                }
            }

        }

        return singleValueNode.next;
    }

}
