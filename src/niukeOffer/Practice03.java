package niukeOffer;

import java.util.ArrayList;

/**
 * ��Ŀ����������һ������������ֵ��β��ͷ��˳�򷵻�һ��ArrayList��
 * 
 * @author Shang
 *
 */
public class Practice03 {

	class ListNode {
		int val;
		ListNode next = null;

		ListNode(int val) {
			this.val = val;
		}
	}

	/**
	 * �ݹ�
	 */
	public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
		ArrayList<Integer> result = new ArrayList<Integer>();
		addItem(listNode, result);
		return result;
	}

	public void addItem(ListNode listNode, ArrayList<Integer> result) {
		if (listNode == null) {
			return;
		} else {
			addItem(listNode.next, result);
			result.add(listNode.val);
		}
	}
}
