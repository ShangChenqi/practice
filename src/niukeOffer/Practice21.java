package niukeOffer;

/**
 * 题目描述：输入两个整数序列，第一个序列表示栈的压入顺序，请判断第二个序列是否可能为该栈的弹出顺序。
 * 假设压入栈的所有数字均不相等。例如序列1,2,3,4,5是某栈的压入顺序，序列4,5,3,2,1是该压栈序列对应的一个弹出序列，
 * 但4,3,5,1,2就不可能是该压栈序列的弹出序列。（注意：这两个序列的长度是相等的）
 * 
 * @author Shang
 *
 */
public class Practice21 {

	// 需要一个辅助栈
	public boolean IsPopOrder(int[] pushA, int[] popA) {

		if (pushA.length == 0 || popA.length == 0) {
			return false;
		}

		if (pushA.length != popA.length) {
			return false;
		}

		int[] stack = new int[pushA.length];
		int top = -1;

		for (int i = 0, j = 0; i < popA.length;) {
			stack[++top] = pushA[i++];
			while (j < popA.length && stack[top] == popA[j]) {
				top--;
				j++;
			}
		}

		return top == -1;
	}
}
