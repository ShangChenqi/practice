package niukeOffer;

/**
 * 题目描述： 在一个二维数组中（每个一维数组的长度相同）， 每一行都按照从左到右递增的顺序排序，每一列都按照从上到下递增的顺序排序。
 * 请完成一个函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。
 *
 * @author Shang
 */
public class Practice01 {
    public static void main(String[] args) {

    }

    /**
     * 矩阵是有序的，从左下角观察，向上数字递减，向右数字递增。 因此从左下角（从右上角亦可）开始查找，数组值比目标值小时右移，比目标直大时上移。
     * 时间复杂度为O(m + n),m,n分别为数组的行数和列数
     */
    public boolean Find(int target, int[][] array) {
        int rowLength = array.length;
        int lineLength = array[0].length;

        int i = rowLength - 1;
        int j = 0;

        while (i >= 0 && i < rowLength && j >= 0 && j < lineLength) {
            if (target == array[i][j]) {
                return true;
            }
            if (target > array[i][j]) {
                j++;
            } else {
                i--;
            }
        }

        return false;
    }
}
