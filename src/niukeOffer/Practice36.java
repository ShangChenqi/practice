package niukeOffer;

/**
 * 输入两个链表，找出它们的第一个公共结点
 */
public class Practice36 {

    public class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }

    public ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {

        ListNode p1 = pHead1;
        ListNode p2 = pHead2;
        int length1 = 0, length2 = 0;

        while (p1 != null) {
            length1++;
            p1 = p1.next;
        }

        while (p2 != null) {
            length2++;
            p2 = p2.next;
        }

        int distance = length1 > length2 ? length1 - length2 : length2 - length1;
        p1 = pHead1;
        p2 = pHead2;

        if (length1 > length2) {
            while (distance != 0) {
                p1 = p1.next;
                distance--;
            }
        } else {
            while (distance != 0) {
                p2 = p2.next;
                distance--;
            }
        }

        while (p1 != p2) {
            p1 = p1.next;
            p2 = p2.next;
        }

        return p1;
    }

}
