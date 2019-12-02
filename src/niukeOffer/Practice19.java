package niukeOffer;

import java.util.ArrayList;

/**
 * ��Ŀ����������һ�����󣬰��մ���������˳ʱ���˳�����δ�ӡ��ÿһ�����֣� ���磬�����������4 X 4���� 1 2 3 4 5 6 7 8 9 10
 * 11 12 13 14 15 16 �����δ�ӡ������1,2,3,4,8,12,16,15,14,13,9,5,6,7,11,10.
 *
 * @author Shang
 */
public class Practice19 {

    public static void main(String[] args) {
        int[][] matrix = {{1}};

        printMatrix(matrix);
    }

    // ע��߽����
    public static ArrayList<Integer> printMatrix(int[][] matrix) {

        ArrayList<Integer> result = new ArrayList<Integer>();

        int i = 0, j = 0;

        while (true) {

            while (i >= 0 && i < matrix.length && j + 1 < matrix[0].length && matrix[i][j + 1] != 0) { // ����
                result.add(matrix[i][j]);
                System.out.print(matrix[i][j] + " ");
                matrix[i][j] = 0;

                j++;

                continue;
            }

            while (j >= 0 && j < matrix[0].length && i + 1 < matrix.length && matrix[i + 1][j] != 0) { // ����
                result.add(matrix[i][j]);
                System.out.print(matrix[i][j] + " ");
                matrix[i][j] = 0;

                i++;

                continue;
            }

            while (i >= 0 && i < matrix.length && j - 1 >= 0 && matrix[i][j - 1] != 0) { // ����
                result.add(matrix[i][j]);
                System.out.print(matrix[i][j] + " ");
                matrix[i][j] = 0;

                j--;

                continue;
            }

            while (j >= 0 && j < matrix[0].length && i - 1 >= 0 && matrix[i - 1][j] != 0) { // ����
                result.add(matrix[i][j]);
                System.out.print(matrix[i][j] + " ");
                matrix[i][j] = 0;

                i--;

                continue;
            }

            // �жϻ��ܷ�������
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
