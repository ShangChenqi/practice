package niukeOffer;

import java.util.ArrayList;

/**
 * 题目描述：输入一个链表，按链表值从尾到头的顺序返回一个ArrayList。
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
	 * 递归
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
