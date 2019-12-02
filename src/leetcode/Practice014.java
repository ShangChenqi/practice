package leetcode;

/**
 * 题目描述：现在有一个整数类型的数组，数组中只有一个元素只出现一次，其余元素都出现三次。
 * 你需要给出一个线性时间复杂度的算法，你能在不使用额外内存空间的情况下解决这个问题么？
 */
public class Practice014 {

    public int singleNumber(int[] A) {
        int ones = 0;   //记录只出现过1次的bits
        int twos = 0;   //记录只出现过2次的bits
        int threes = 0; //记录出现了3次的bits
        for (int value : A) {
            twos |= ones & value;
            ones ^= value;
            threes = ones & twos;
            ones &= ~threes;
            twos &= ~threes;
        }
        return ones;
    }
}
