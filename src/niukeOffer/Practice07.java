package niukeOffer;

/**
 * 题目描述：大家都知道斐波那契数列，现在要求输入一个整数n，请你输出斐波那契数列的第n项（从0开始，第0项为0）。 n<=39
 * 
 * @author Shang
 *
 */
public class Practice07 {
	/**
	 * 递归
	 */
	public int Fibonacci01(int n) {
		if (n == 0) {
			return 0;
		}
		if (n == 1) {
			return 1;
		}
		return Fibonacci01(n - 1) + Fibonacci01(n - 2);
	}

	/**
	 * 循环
	 */
	public int Fibonacci02(int n) {
		if (n == 0) {
			return 0;
		}
		if (n == 1) {
			return 1;
		}
		
		int n1 = 0, n2 = 1;
		int val = 0;
		for(int i = 2; i <= n; i++) {
			val = n1 + n2;
			n1 = n2;
			n2 = val;
		}
		return val;
	}
	
	/**
	 * 动态规划
	 */
	public int Fibonacci03(int n) {
		int f = 0, g = 1;
		while(n-- != 0) {
			g += f;
			f = g -f;
		}
		return f;
	}
}
