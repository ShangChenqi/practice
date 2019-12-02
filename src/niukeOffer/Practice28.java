package niukeOffer;

/**
 * 题目描述：数组中有一个数字出现的次数超过数组长度的一半，请找出这个数字。例如输入一个长度为9的数组{1,2,3,2,2,2,5,4,2}。
 * 由于数字2在数组中出现了5次，超过数组长度的一半，因此输出2。如果不存在则输出0。
 */
public class Practice28 {
    public int MoreThanHalfNum_Solution(int[] array) {
        int target = array[0];
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                count++;
            } else {
                count--;
                if (count == 0) {
                    target = array[i];
                    count = 1;
                }
            }
        }

        count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                count++;
            }
        }

        return count > array.length / 2 ? target : 0;
    }

    public static void main(String[] args) {
        System.out.println(new Practice28().MoreThanHalfNum_Solution(new int[]{4, 2, 1, 4, 2, 4}));
    }
}
