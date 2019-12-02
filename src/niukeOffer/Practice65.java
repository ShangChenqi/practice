package niukeOffer;

/**
 * 题目描述：请设计一个函数，用来判断在一个矩阵中是否存在一条包含某字符串所有字符的路径。
 * 路径可以从矩阵中的任意一个格子开始，每一步可以在矩阵中向左，向右，向上，向下移动一个格子。
 * 如果一条路径经过了矩阵中的某一个格子，则该路径不能再进入该格子（不能交叉）。
 * 例如 a b c e s f c s a d e e 矩阵中包含一条字符串"bcced"的路径，但是矩阵中不包含"abcb"路径，因为字符串的第一个字符b占据了矩阵中的第一行第二个格子之后，路径不能再次进入该格子。
 */
public class Practice65 {
    public boolean hasPath(char[] matrix, int rows, int cols, char[] str) {
        //转二维数组
        char[][] array = new char[rows][cols];
        int k = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                array[i][j] = matrix[k];
                k++;
            }
        }

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (pathIsOk(array, i, j, str, 0)) {
                    return true;
                }
            }
        }

        return false;
    }

    private boolean pathIsOk(char[][] array, int i, int j, char[] str, int index) {
        //递归终止：越界 || 当前位置已经走过 || 当前位置不是路径上的点
        if (i < 0 || i >= array.length || j < 0 || j >= array[0].length || array[i][j] == '#' || array[i][j] != str[index]) {
            return false;
        }

        //若最后一个字符已经匹配
        if (index == str.length - 1) {
            return true;
        }

        //已经走过的位置标记为特殊字符
        char c = array[i][j];
        array[i][j] = '#';

        //向左走
        if (pathIsOk(array, i, j - 1, str, index + 1)) {
            return true;
        }
        //向右走
        if (pathIsOk(array, i, j + 1, str, index + 1)) {
            return true;
        }
        //向上走
        if (pathIsOk(array, i - 1, j, str, index + 1)) {
            return true;
        }
        //向下走
        if (pathIsOk(array, i + 1, j, str, index + 1)) {
            return true;
        }

        //回溯
        array[i][j] = c;
        return false;
    }

    public static void main(String[] args) {
        System.out.println(new Practice65().hasPath(new char[]{'A', 'B', 'C', 'E', 'S', 'F', 'C', 'S', 'A', 'D', 'E', 'E'}, 3, 4, new char[]{'A', 'B', 'C', 'C', 'E', 'D'}));
    }


}
