package niukeOffer;

/**
 * ��Ŀ����������һ��������ת��������������ı�ͷ��
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

	// ͷ�巨
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
