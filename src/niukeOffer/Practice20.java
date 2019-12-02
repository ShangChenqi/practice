package niukeOffer;

import java.util.Stack;

/**
 * 题目描述：定义栈的数据结构，请在该类型中实现一个能够得到栈中所含最小元素的min函数（时间复杂度应为O（1））。
 * 
 * @author Shang
 *
 */
public class Practice20 {

	private Stack<Integer> stack = new Stack<Integer>();
	private Stack<Integer> minStack = new Stack<Integer>(); // 最小值辅助栈
	int minValue = Integer.MAX_VALUE;

	public void push(int node) {
		stack.push(node);
		if (node < minValue) {
			minValue = node;
		}
		minStack.push(minValue);
	}

	public void pop() {
		stack.pop();
		minStack.pop();
	}

	public int top() {
		return stack.peek();
	}

	public int min() {
		return minStack.peek();
	}

}
