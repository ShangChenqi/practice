package leetcode;

import java.util.Stack;

/**
 * 题目描述：计算逆波兰式（后缀表达式）的值
 * 运算符仅包含"+","-","*"和"/"，被操作数可能是整数或其他表达式
 */
public class Practice002 {

    private Integer number1;
    private Integer number2;

    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        for (String token : tokens) {
            if (token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/")) {
                number1 = stack.pop();
                number2 = stack.pop();
            }

            if (token.equals("+")) {
                stack.push(number2 + number1);
                continue;
            }
            if (token.equals("-")) {
                stack.push(number2 - number1);
                continue;
            }
            if (token.equals("*")) {
                stack.push(number2 * number1);
                continue;
            }
            if (token.equals("/")) {
                stack.push(number2 / number1);
                continue;
            }
            stack.push(Integer.parseInt(token));
        }
        return stack.pop();
    }
}
