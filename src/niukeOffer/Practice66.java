package niukeOffer;

/**
 * 题目描述：地上有一个m行和n列的方格。一个机器人从坐标0,0的格子开始移动，每一次只能向左，右，上，下四个方向移动一格，但是不能进入行坐标和列坐标的数位之和大于k的格子。
 * 例如，当k为18时，机器人能够进入方格（35,37），因为3+5+3+7 = 18。但是，它不能进入方格（35,38），因为3+5+3+8 = 19。请问该机器人能够达到多少个格子？
 */
public class Practice66 {
    private int count = 0;     //设置成static的话无法通过测试用例且不符合实际

    public int movingCount(int threshold, int rows, int cols) {

        int[][] matrix = new int[rows][cols];
        movingCount(threshold, matrix, 0, 0);

        return count;

    }

    private void movingCount(int k, int[][] matrix, int i, int j) {
        //终止条件
        if (i < 0 || i >= matrix.length || j < 0 || j >= matrix[0].length || matrix[i][j] == 1 || outOfK(i, j, k)) {
            return;
        }

        matrix[i][j] = 1;
        count++;

        movingCount(k, matrix, i - 1, j);
        movingCount(k, matrix, i + 1, j);
        movingCount(k, matrix, i, j - 1);
        movingCount(k, matrix, i, j + 1);

    }

    private boolean outOfK(int i, int j, int k) {
        int sum = 0;
        do {
            sum += i % 10;
        } while ((i = i / 10) > 0);

        do {
            sum += j % 10;
        } while ((j = j / 10) > 0);

        return sum > k;
    }

    public static void main(String[] args) {
        System.out.println(new Practice66().movingCount(10, 1, 100));
    }

}
