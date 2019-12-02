package leetcode;

/**
 * 题目描述：在O(n log n)的时间内使用常数级空间复杂度对链表进行排序。
 */
public class Practice004 {
    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public ListNode sortList(ListNode head) {
        ListNode dummyHead = new ListNode(0);
        dummyHead.next = head;

        ListNode p = dummyHead;
        int length = 0;
        while (p != null) { //计算链表长度
            length++;
            p = p.next;
        }

        for (int size = 1; size < length; size <<= 1) {
            ListNode cur = dummyHead.next;
            ListNode tail = dummyHead;

            while (cur != null) {
                ListNode left = cur;
                ListNode right = cut(left, size);   //拆分
                cur = cut(right, size);

                tail.next = merge(left, right);     //归并
                while (tail.next != null) {
                    tail = tail.next;
                }
            }
        }

        return dummyHead.next;
    }

    //归并
    private ListNode merge(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(0);
        ListNode p = head;
        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                p.next = l1;
                p = p.next;
                l1 = l1.next;
            } else {
                p.next = l2;
                p = p.next;
                l2 = l2.next;
            }
        }
        p.next = l1 == null ? l2 : l1;

        return head.next;
    }

    //拆分：将链表head切掉前n个结点，并返回后半部分的链表头
    private ListNode cut(ListNode head, int n) {
        ListNode p = head;
        while (n != 1 && p != null) {
            p = p.next;
            n--;
        }
        if (p == null) {
            return null;
        }
        ListNode q = p.next;
        p.next = null;  //断链
        return q;
    }

}
