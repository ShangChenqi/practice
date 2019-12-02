package niukeOffer;

/**
 * 题目描述：求1+2+3+...+n，要求不能使用乘除法、for、while、if、else、switch、case等关键字及条件判断语句（A?B:C）。
 */
public class Practice47 {
    //不能用循环就用递归；不能用if...else...就用逻辑符号
    public int Sum_Solution(int n) {
        int result = n;
        boolean isStop = (n > 0) && ((result += Sum_Solution(n - 1)) > 0);
        return result;
    }
}
