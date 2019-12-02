package niukeOffer;

/**
 * 题目描述：输入一个链表，反转链表后，输出新链表的表头。
 * 
 * @author Shang
 *
 */
public class Practice15 {
	public class ListNode {
		int val;
		ListNode next = null;

		ListNode(int val) {
			this.val = val;
		}
	}

	// 头插法
	public ListNode ReverseList(ListNode head) {
		ListNode newHead = new ListNode(0);

		ListNode pre = head;

		while (pre != null) {
			ListNode p = pre.next;
			pre.next = newHead.next;
			newHead.next = pre;
			pre = p;
		}

		return newHead.next;
	}
}
