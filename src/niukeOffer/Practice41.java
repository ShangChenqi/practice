package niukeOffer;

import java.util.ArrayList;

/**
 * 题目描述：找出所有和为S的连续正数序列
 */
public class Practice41 {
    public ArrayList<ArrayList<Integer>> FindContinuousSequence(int sum) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();

        int low = 1, high = 2;
        while (low < high) {
            //等差数列求和公式 (a0 + an) * n / 2
            int cur = (low + high) * (high - low + 1) / 2;
            if (cur == sum) {
                ArrayList<Integer> list = new ArrayList<>();
                for (int i = low; i <= high; i++) {
                    list.add(i);
                }
                result.add(list);
                low++;
            } else if (cur < sum) {
                high++;
            } else {
                low++;
            }
        }

        return result;
    }
}
