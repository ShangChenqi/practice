package niukeOffer;

import java.util.Stack;

/**
 * ��Ŀ������������ջ��ʵ��һ�����У���ɶ��е�Push��Pop������ �����е�Ԫ��Ϊint���͡� ������ջ����������
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
	 * stack1Ϊ���ջ��stack2Ϊ����ջ
	 * 
	 */
	public int pop() {

		int value;

		// ֻ�е�����ջΪ��ʱ,���һ��,����ʱ��������תջ
		if (stack2.isEmpty()) {
			while (!stack1.isEmpty()) {
				stack2.push(stack1.pop());
			}
		}

		value = stack2.pop();

		return value;
	}

}
