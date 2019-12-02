package leetcode;

/**
 * 题目描述：现在有一个整数类型的数组，数组中素只有一个元素只出现一次，其余的元素都出现两次。
 * 要求时间复杂度为线性复杂度且不使用额外的存储空间
 */
public class Practice015 {
    public int singleNumber(int[] A) {
        int result = 0;     //任何一个数和0的异或等于这个数本身
        for (int value : A) {
            result ^= value;    //异或！！！
        }
        return result;
    }
}
