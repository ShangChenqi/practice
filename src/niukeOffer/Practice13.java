package niukeOffer;

import java.util.Stack;

/**
 * ��Ŀ����������һ���������飬ʵ��һ�����������������������ֵ�˳��ʹ�����е�����λ�������ǰ�벿�֣����е�ż��λ������ĺ�벿�֣�
 * ����֤������������ż����ż��֮������λ�ò��䡣
 * 
 * @author Shang
 *
 */
public class Practice13 {
	/**
	 * ����һ������飬��������ֱ���������ż�����ռ临�Ӷ�O(n)��ʱ�临�Ӷ�O(3n)
	 */
	public void reOrderArray01(int[] array) {
		int[] arrayCopy = new int[array.length];
		for (int i = 0; i < array.length; i++) {
			arrayCopy[i] = array[i];
		}

		int countOdd = 0, countEven = 0;

		for (int i = 0; i < arrayCopy.length; i++) {
			if ((arrayCopy[i] & 1) == 1) {
				array[countEven] = arrayCopy[i];
				countEven++;
			}
		}

		for (int i = arrayCopy.length - 1; i >= 0; i--) {
			if ((arrayCopy[i] & 1) == 0) {
				array[arrayCopy.length - 1 - countOdd] = arrayCopy[i];
				countOdd++;
			}
		}
	}

	/**
	 * �ȴ������ұ���һ��,�����ݷ���ջ��.�ٴ����������,�����ݷ�����ȷλ�á��ռ临�Ӷ�O(n)��ʱ�临�Ӷ�O(2n)
	 */
	public void reOrderArray02(int[] array) {
		Stack<Integer> oddStack = new Stack<Integer>();
		Stack<Integer> evenStack = new Stack<Integer>();

		for (int i = 0; i < array.length; i++) {
			if ((array[i] & 1) == 1) {
				evenStack.push(array[i]);
			} else {
				oddStack.push(array[i]);
			}
		}

		for (int i = array.length - 1; i >= 0; i++) {
			if (!oddStack.isEmpty()) {
				array[i] = oddStack.pop();
			} else {
				array[i] = evenStack.pop();
			}
		}

	}
}
