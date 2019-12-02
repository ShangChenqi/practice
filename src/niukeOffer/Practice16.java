package niukeOffer;

/**
 * ��Ŀ���������������������������������������ϳɺ��������Ȼ������Ҫ�ϳɺ���������㵥����������
 * 
 * @author Shang
 *
 */
public class Practice16 {
	public class ListNode {
		int val;
		ListNode next = null;

		ListNode(int val) {
			this.val = val;
		}
	}

	public ListNode Merge(ListNode list1, ListNode list2) {
		ListNode list3 = new ListNode(0);	//ͷ�ڵ�

		ListNode p1 = list1, p2 = list2, p3 = list3;

		while (p1 != null && p2 != null) {
			if (p1.val <= p2.val) {
				ListNode p = new ListNode(p1.val);
				p3.next = p;
				p3 = p;
				p1 = p1.next;
				continue;
			}
			if (p1.val > p2.val) {
				ListNode p = new ListNode(p2.val);
				p3.next = p;
				p3 = p;
				p2 = p2.next;
				continue;
			}
		}

		while (p1 != null) {
			ListNode p = new ListNode(p1.val);
			p3.next = p;
			p3 = p;
			p1 = p1.next;
		}

		while (p2 != null) {
			ListNode p = new ListNode(p2.val);
			p3.next = p;
			p3 = p;
			p2 = p2.next;
		}

		return list3.next;
	}
}
