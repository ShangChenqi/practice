package random;

/**
 * 八皇后问题
 */
public class EightQueen {

    private int[][] seat = new int[8][8];   //8*8的棋盘
    private int count = 0;

    public void solution() {
        for (int i = 0; i < 8; i++) {
            nextQueen(0, i);
        }
    }

    private void nextQueen(int i, int j) {
        //判断同一列是否还有其他皇后
        for (int k = 0; k < 8; k++) {
            if (seat[k][j] == 1 && k != i) {
                return;
            }
        }
        //判断同一行是否还有其他皇后
        for (int k = 0; k < 8; k++) {
            if (seat[i][k] == 1 && k != j) {
                return;
            }
        }
        //判断左上斜线是否还有其他皇后
        for (int m = i - 1, n = j - 1; m < 8 && m >= 0 && n < 8 && n >= 0; m--, n--) {
            if (seat[m][n] == 1) {
                return;
            }
        }
        //判断右下斜线是否还有其他皇后
        for (int m = i + 1, n = j + 1; m < 8 && m >= 0 && n < 8 && n >= 0; m++, n++) {
            if (seat[m][n] == 1) {
                return;
            }
        }
        //判断左下斜线是否还有其他皇后
        for (int m = i + 1, n = j - 1; m < 8 && m >= 0 && n < 8 && n >= 0; m++, n--) {
            if (seat[m][n] == 1) {
                return;
            }
        }
        //判断右上斜线是否还有其他皇后
        for (int m = i - 1, n = j + 1; m < 8 && m >= 0 && n < 8 && n >= 0; m--, n++) {
            if (seat[m][n] == 1) {
                return;
            }
        }

        //是一种可行的解决方法
        if (i == 7) {
            count++;
            return;
        }

        //当前点可行
        seat[i][j] = 1;
        //寻找下一行皇后所在位置
        for (int k = 0; k < 8; k++) {
            nextQueen(i + 1, k);
        }
        //回溯
        seat[i][j] = 0;

    }

    public static void main(String[] args) {
        EightQueen eightQueen = new EightQueen();
        eightQueen.solution();
        System.out.println(eightQueen.count);
    }


}
