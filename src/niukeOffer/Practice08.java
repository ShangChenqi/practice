package niukeOffer;

/**
 * 题目描述：一只青蛙一次可以跳上1级台阶，也可以跳上2级。求该青蛙跳上一个n级的台阶总共有多少种跳法
 */
public class Practice08 {
	//递归
	public int JumpFloor(int target) {

		if (target == 0) {
			return 1;
		}

		if (target < 0) {
			return 0;
		}

		return JumpFloor(target - 1) + JumpFloor(target - 2);
	}
}
