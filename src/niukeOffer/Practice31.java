package niukeOffer;

/**
 * 题目描述：求任意非负整数区间中1出现的次数（从1 到 n 中1出现的次数）
 */
public class Practice31 {
    public int NumberOf1Between1AndN_Solution(int n){
        int count = 0;
        for(int i = 1; i <= n; i *= 10){
            int a = n / i;
            int b = n % i;
            count += (a + 8) / 10 * i + (a % 10 == 1 ? b + 1 : 0);
        }
        return count;
    }
}
