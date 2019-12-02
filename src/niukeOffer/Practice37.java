package niukeOffer;

/**
 * 题目描述：统计一个数字在已排序数组中出现的次数
 */
public class Practice37 {
    public int GetNumberOfK(int[] array, int k) {
        return binarySearch(array, k) - binarySearch(array, k - 1);
    }

    public int binarySearch(int[] array, int value) {
        int i = 0, j = array.length - 1;
        while (i <= j) {
            int mid = (j + i) / 2;
            if (array[mid] <= value) {
                i = mid + 1;
            } else if (array[mid] > value) {
                j = mid - 1;
            }
        }
        return i;
    }

    public static void main(String[] args) {
        System.out.println(new Practice37().GetNumberOfK(new int[]{1, 2, 3, 3, 3, 3, 4, 5}, 3));
    }
}
