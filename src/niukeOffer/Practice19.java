package niukeOffer;

import java.util.ArrayList;

/**
 * 题目描述：输入一个矩阵，按照从外向里以顺时针的顺序依次打印出每一个数字， 例如，如果输入如下4 X 4矩阵： 1 2 3 4 5 6 7 8 9 10
 * 11 12 13 14 15 16 则依次打印出数字1,2,3,4,8,12,16,15,14,13,9,5,6,7,11,10.
 *
 * @author Shang
 */
public class Practice19 {

    public static void main(String[] args) {
        int[][] matrix = {{1}};

        printMatrix(matrix);
    }

    // 注意边界控制
    public static ArrayList<Integer> printMatrix(int[][] matrix) {

        ArrayList<Integer> result = new ArrayList<Integer>();

        int i = 0, j = 0;

        while (true) {

            while (i >= 0 && i < matrix.length && j + 1 < matrix[0].length && matrix[i][j + 1] != 0) { // 向右
                result.add(matrix[i][j]);
                System.out.print(matrix[i][j] + " ");
                matrix[i][j] = 0;

                j++;

                continue;
            }

            while (j >= 0 && j < matrix[0].length && i + 1 < matrix.length && matrix[i + 1][j] != 0) { // 向下
                result.add(matrix[i][j]);
                System.out.print(matrix[i][j] + " ");
                matrix[i][j] = 0;

                i++;

                continue;
            }

            while (i >= 0 && i < matrix.length && j - 1 >= 0 && matrix[i][j - 1] != 0) { // 向左
                result.add(matrix[i][j]);
                System.out.print(matrix[i][j] + " ");
                matrix[i][j] = 0;

                j--;

                continue;
            }

            while (j >= 0 && j < matrix[0].length && i - 1 >= 0 && matrix[i - 1][j] != 0) { // 向上
                result.add(matrix[i][j]);
                System.out.print(matrix[i][j] + " ");
                matrix[i][j] = 0;

                i--;

                continue;
            }

            // 判断还能否向右走
            if (j + 1 >= matrix[0].length || matrix[i][j + 1] == 0) {
                break;
            }

        }

        if (i >= 0 && i < matrix.length && j >= 0 && j < matrix[0].length) {
            result.add(matrix[i][j]);
        }

        return result;

    }
}
