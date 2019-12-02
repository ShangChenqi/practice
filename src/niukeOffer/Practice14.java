package niukeOffer;

/**
 * ��Ŀ����������һ����������������е�����k����㡣
 * 
 * @author Shang
 *
 */
public class Practice14 {
	public class ListNode {
		int val;
		ListNode next = null;

		public ListNode(int val) {
			this.val = val;
		}
	}

	public ListNode FindKthToTail(ListNode head, int k) {

		if (head == null || k <= 0) {
			return null;
		}
		ListNode pre = head;
		ListNode last = head;
		for (int i = 1; i < k; i++) {
			if (pre.next != null) {
				pre = pre.next;
			} else {
				return null;
			}
		}
		while (pre.next != null) {
			pre = pre.next;
			last = last.next;
		}
		return last;

	}

}
