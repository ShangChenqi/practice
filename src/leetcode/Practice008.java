package leetcode;

/**
 * 题目描述：将给定的单链表L： L0 → L1 → … → Ln-1 → Ln
 * 重新排序为：L0 → Ln → L1 → Ln-1 → L2 → Ln-2 → …
 * 使用原地算法，并且不改变结点的值
 */
public class Practice008 {

    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    //理解：相当于每次从链表尾部取下一个结点添加在链表前部分
    //所以需要找出哪些结点会被取下，被添加到前面。使用快慢指针法找出被截取的位置
    //注意还需要把截取下来的链表逆置
    public void reorderList(ListNode head) {
        if (head == null || head.next == null) {
            return;
        }
        //利用快慢指针找到截取链表的位置
        ListNode fast = head;
        ListNode slow = head;
        while (fast.next != null && fast.next.next != null) {   //当快指针指向最后一个结点或倒数第二个结点时停止
            fast = fast.next.next;
            slow = slow.next;
        }
        ListNode list = slow.next;
        slow.next = null;

        //链表逆置
        list = reverse(list);

        ListNode p = head;
        while (p != null && list != null) {
            ListNode s = list;
            list = list.next;
            s.next = p.next;
            p.next = s;
            p = p.next.next;
        }
    }

    //头插法逆置链表
    private ListNode reverse(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode dummyHead = new ListNode(0);
        while (head != null) {
            ListNode p = head;
            head = head.next;
            p.next = dummyHead.next;
            dummyHead.next = p;
        }

        return dummyHead.next;
    }

}
