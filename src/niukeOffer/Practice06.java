package niukeOffer;

/**
 * 题目描述：把一个数组最开始的若干个元素搬到数组的末尾，我们称之为数组的旋转。
 * 输入一个非递减排序的数组的一个旋转，输出旋转数组的最小元素。
 * 例如数组{3,4,5,1,2}为{1,2,3,4,5}的一个旋转，该数组的最小值为1。
 * NOTE：给出的所有元素都大于0，若数组大小为0，请返回0。
 */
public class Practice06 {
    /**
     * 一般解法
     */
    public int minNumberInRotateArray01(int[] array) {
        if (array.length == 0) {
            return 0;
        }

        int min = array[0];

        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                return array[i];
            }
        }

        return min;
    }

    /**
     * 二分法：https://www.nowcoder.com/questionTerminal/9f3231a991af4f55b95579b44b7a01ba
     */
    public int minNumberInRotateArray02(int[] array) {
        return 0;
    }
}
