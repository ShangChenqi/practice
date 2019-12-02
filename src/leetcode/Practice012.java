package leetcode;

import java.util.HashSet;
import java.util.Set;

/**
 * 题目描述：给定一个字符串s和一组单词dict，判断s是否可以用空格分割成一个单词序列，使得单词序列中所有的单词都是dict中的单词（序列可以包含一个或多个单词）。
 * 例如:
 * 给定s=“leetcode”；
 * dict=["leet", "code"].
 * 返回true，因为"leetcode"可以被分割成"leet code".
 */
public class Practice012 {
    
    public boolean wordBreak(String s, Set<String> dict) {
//        //迭代法
//        for (String str : dict) {
//            if (wordBreak(s, 0, str, dict)) {
//                return true;
//            }
//        }
//        return false;

        //采用动态规划
        //dp[i]表示字符串s.substring(0, i)是否可分
        //若dp[i]的值为true，则一定存在一个j，0 <= j < i，使得dp[j]为true且字符串s.substring(j + 1, i)属于dict集合
        //dp[0] = true
        boolean[] dp = new boolean[s.length() + 1];
        dp[0] = true;
        for (int i = 1; i <= s.length(); i++) {
            for (int j = 0; j < i; j++) {
                if (dp[j] && dict.contains(s.substring(j + 1, i))) {
                    dp[i] = true;
                    break;
                }
            }
        }

        return dp[s.length()];

    }

    //迭代法实现，时间复杂度太高，无法通过所有测试用例
    private boolean wordBreak(String s, int i, String str, Set<String> dict) {
        //用str填充后超过了原有字符串长度
        if (s.length() - i < str.length()) {
            return false;
        }
        //当前str无法和i位置开始字符对应
        if (!s.substring(i, i + str.length()).equals(str)) {
            return false;
        }
        //可以填充并且已经填充到最后一个单词
        if (i + str.length() == s.length()) {
            return true;
        }
        //填充下一个
        for (String next : dict) {
            if (wordBreak(s, i + str.length(), next, dict)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        String s = "a";
        Set<String> set = new HashSet<>();
        set.add("b");
        System.out.println(new Practice012().wordBreak(s, set));
    }

}
