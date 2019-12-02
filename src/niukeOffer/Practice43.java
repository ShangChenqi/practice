package niukeOffer;

/**
 * 题目描述：对于一个给定的字符序列S，请把其循环左移K位后的序列输出
 */
public class Practice43 {
    public String LeftRotateString(String str, int n) {
        StringBuffer result = new StringBuffer();
        if (str == null || n > str.length() || n < 0) {
            return result.toString();
        }
        if (n == str.length() || n == 0) {
            return str;
        }
        for (int i = n; i < str.length(); i++) {
            result.append(str.charAt(i));
        }
        for (int i = 0; i < n; i++) {
            result.append(str.charAt(i));
        }

        return result.toString();
    }
}
