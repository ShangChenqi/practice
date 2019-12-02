package niukeOffer;

/**
 * 题目描述：一个整形数组里除了两个数字之外，其他的数组都出现了两次。找出这两个只出现一次的数字
 */
public class Practice40 {
    /**
     * 从头到尾一次异或数组中的每一个数字，那么最终得到的结果就是两个只出现一次的数字的异或结果；
     * 异或的结果肯定是两个只出现了一次的数字的异或结果，且异或的结果肯定不为0；
     * 在这个异或结果中找到第一个为1的位的位置，记为第n位；
     * 现在以第n位是不是1为标准将数组分为两部分；
     * 就可以确保将这两个要求的数组分在两个不同的数组中；
     * 两个数组中的值分别进行异或就可以得到最终的结果。
     */
    public void FindNumsAppearOnce(int[] array, int num1[], int num2[]) {
        if (array.length < 2)
            return;

        int xorVal = array[0];
        for (int i = 1; i < array.length; i++) {
            xorVal ^= array[i];
        }

        int index = 0;
        while ((xorVal & 1) != 1) {
            xorVal = xorVal >> 1;
            index++;
        }

        for (int i = 0; i < array.length; i++) {
            if (((array[i] >> index) & 1) == 1) {
                num1[0] ^= array[i];
            } else {
                num2[0] ^= array[i];
            }
        }

    }


}
