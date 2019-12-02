package niukeOffer;

/**
 * 题目描述：字符串转整数。将一个字符串转换成一个整数，要求不能使用字符串转换整数的库函数。 数值为0或者字符串不是一个合法的数值则返回0
 * 输入描述：输入一个字符串,包括数字字母符号,可以为空
 * 输出描述：如果是合法的数值表达则返回该数字，否则返回0
 */
public class Practice49 {
    public int StrToInt(String str) {
        try {
            //看看Integer.parseInt()怎么实现的
            int result = Integer.parseInt(str);
            return result;
        } catch (Exception e) {
            return 0;
        }
    }

    public int strToInt(String str) {
        if (str == null || str.trim().equals(" ") || str.length() == 0) {
            return 0;
        }
        long result = 0;
        boolean negative = false;    //是否为负数字
        int len = str.length();
        int index = 0;
        char firstChar = str.charAt(0);
        if (firstChar < '0') {
            index++;
            if (firstChar == '-') {
                negative = true;
            } else if (firstChar != '+') {
                return 0;
            }
            if (str.length() == 1) {
                return 0;
            }
        }
        while(index < str.length()){
            if(str.charAt(index) < '0' || str.charAt(index) > '9'){
                return 0;
            }
            result += (int)(str.charAt(index) - '0') * Math.pow(10, len - index - 1);
            index++;
        }
        result = negative ? -result : result;
        if(result > Integer.MAX_VALUE || result < Integer.MIN_VALUE){
            return 0;
        }
        return (int) result;
    }

    public static void main(String[] args) {
        System.out.println(new Practice49().strToInt("-2147483648"));

        int a1 = -2147483648 - 1;
        int a2 = 2147483647 + 1;
        System.out.println(a1 + ", " + a2);
    }
}
