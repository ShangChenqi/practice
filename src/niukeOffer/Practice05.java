package niukeOffer;

import java.util.Stack;

/**
 * 题目描述：用两个栈来实现一个队列，完成队列的Push和Pop操作。 队列中的元素为int类型。 不考虑栈容量的问题
 * 
 * @author Shang
 *
 */
public class Practice05 {
	Stack<Integer> stack1 = new Stack<Integer>();
	Stack<Integer> stack2 = new Stack<Integer>();

	public void push(int node) {
		stack1.push(node);
	}

	/**
	 * 
	 * stack1为入队栈，stack2为出队栈
	 * 
	 */
	public int pop() {

		int value;

		// 只有当出队栈为空时,填充一遍,其他时候不用来回转栈
		if (stack2.isEmpty()) {
			while (!stack1.isEmpty()) {
				stack2.push(stack1.pop());
			}
		}

		value = stack2.pop();

		return value;
	}

}
