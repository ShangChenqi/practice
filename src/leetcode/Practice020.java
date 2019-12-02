package leetcode;

import java.util.ArrayList;

/**
 * 题目描述：给定一个字符串s，分割s使得s的每一个子串都是回文串
 * 返回所有的回文分割结果。（注意：返回结果的顺序需要和输入字符串中的字母顺序一致。）
 */
public class Practice020 {

    //回溯法
    public ArrayList<ArrayList<String>> partition(String s) {
        ArrayList<ArrayList<String>> result = new ArrayList<>();
        if (s == null || s.length() == 0) {
            return result;
        }
        partition(s, 0, result, new ArrayList<>());
        return result;
    }

    private void partition(String s, int index, ArrayList<ArrayList<String>> result, ArrayList<String> temp) {
        if (index >= s.length()) {
            result.add(new ArrayList<>(temp));
            return;
        }
        ArrayList<String> list = new ArrayList<>(temp);
        //注意 j <= s.length()
        for (int j = index + 1; j <= s.length(); j++) {
            String str = s.substring(index, j);
            if (isPalindrome(str)) {
                list.add(str);
                partition(s, j, result, list);
                list.remove(list.size() - 1);
            }
        }
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
        ArrayList<ArrayList<String>> result = new Practice020().partition("eegiicgaeadbcfacfhifdbiehbgejcaeggcgbahfcajfhjjdgj");
        System.out.println(result);
    }
}
