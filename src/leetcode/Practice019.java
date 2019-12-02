package leetcode;

/**
 * 题目描述：给出一个字符串s，分割s使得分割出的每一个子串都是回文串
 * 计算将字符串s分割成回文分割结果的最小切割数
 * 例如:给定字符串s="aab",
 * 返回1，因为回文分割结果["aa","b"]是切割一次生成的。
 */
public class Practice019 {

    private int[][] dp = new int[1000][1000];   //保存状态

    /*
     * 分析：设dp[i][j]为字符串s[i][j]的最小切点数目
     * 对于所有的p，i < p < j， 若s[i][j]是回文字符串，则dp[i][j] = 0;
     *                       若s[i][j]不是回文字符串，则dp[i][j] = min(dp[i][p] + dp[p + 1][j]) + 1
     * 例如对于字符串"aab"，"aab"本身不是回文字符串,
     * dp("aab") = min((dp("a") + dp("ab")), (dp("aa") + dp("b"))) + 1;
     * dp("a") = 0;
     * dp("ab") = dp("a") + dp("b") + 1 = 1;
     * dp("aa") = 0;
     * dp("b") = 0
     *综上，dp("aab") = 1
     * */

    //递归实现，时间复杂度过大，不能通过所有测试用例
    public int minCut(String s) {
        if (s == null || s.length() == 0 || isPalindrome(s)) {
            return 0;
        }
        int min = s.length();
        for (int i = 1; i < s.length(); i++) {
            min = Math.min(min, minCut(s.substring(0, i)) + minCut(s.substring(i)) + 1);
        }
        return min;
    }

    //迭代法实现
    public int minCut2(String s) {
        for (int t = 0; t <= s.length(); t++) {
            for (int i = 0, j = t; j < s.length(); i++, j++) {
                dp[i][j] = compCut(i, j, s);
            }
        }
        return dp[0][s.length() - 1];
    }

    private int compCut(int i, int j, String s) {
        if (isPalindrome(s.substring(i, j + 1))) {
            return 0;
        }
        int min = s.length();
        for (int p = i; p < j; p++) {
            int a = dp[i][p];
            int b = dp[p + 1][j];
            a = a + b + 1;
            min = Math.min(min, a);
        }
        return min;
    }

    private boolean isPalindrome(String str) {
        if (str == null || str.length() == 0) {
            return false;
        }
        int i = 0, j = str.length() - 1;
        while (i < j) {
            if (str.charAt(i) != str.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(new Practice019().minCut("b"));
        System.out.println(new Practice019().minCut2("eegiicgaeadbcfacfhifdbiehbgejcaeggcgbahfcajfhjjdgj"));
    }
}
