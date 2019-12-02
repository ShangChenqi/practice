package niukeOffer;

import java.util.ArrayList;

/**
 * 题目描述：把只包含质因子2、3和5的数称作丑数（Ugly Number）。例如6、8都是丑数，但14不是，因为它包含质因子7。
 * 习惯上我们把1当做是第一个丑数。求按从小到大的顺序的第N个丑数。
 * <p>
 * 思路：一个丑数应该是另一丑数乘以2、3或5的结果，因此可以创建一个数组用来保存排好序的丑数
 */
public class Practice33 {
    public int GetUglyNumber_Solution(int index) {
        if (index < 7)
            return index;
        ArrayList<Integer> list = new ArrayList<>(index);
        list.add(1);
        int t2 = 0, t3 = 0, t5 = 0;
        for (int i = 1; i < index; i++) {
            list.add(Math.min(list.get(t2) * 2, Math.min(list.get(t3) * 3, list.get(t5) * 5)));
            if (list.get(i) == list.get(t2) * 2) {
                t2++;
            }
            if (list.get(i) == list.get(t3) * 3) {
                t3++;
            }
            if (list.get(i) == list.get(t5) * 5) {
                t5++;
            }
        }

        return list.get(index - 1);
    }
}
