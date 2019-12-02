package niukeOffer;

import java.util.Stack;

/**
 * ��Ŀ����������ջ�����ݽṹ�����ڸ�������ʵ��һ���ܹ��õ�ջ��������СԪ�ص�min������ʱ�临�Ӷ�ӦΪO��1������
 * 
 * @author Shang
 *
 */
public class Practice20 {

	private Stack<Integer> stack = new Stack<Integer>();
	private Stack<Integer> minStack = new Stack<Integer>(); // ��Сֵ����ջ
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
