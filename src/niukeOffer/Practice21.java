package niukeOffer;

/**
 * ��Ŀ���������������������У���һ�����б�ʾջ��ѹ��˳�����жϵڶ��������Ƿ����Ϊ��ջ�ĵ���˳��
 * ����ѹ��ջ���������־�����ȡ���������1,2,3,4,5��ĳջ��ѹ��˳������4,5,3,2,1�Ǹ�ѹջ���ж�Ӧ��һ���������У�
 * ��4,3,5,1,2�Ͳ������Ǹ�ѹջ���еĵ������С���ע�⣺���������еĳ�������ȵģ�
 * 
 * @author Shang
 *
 */
public class Practice21 {

	// ��Ҫһ������ջ
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
