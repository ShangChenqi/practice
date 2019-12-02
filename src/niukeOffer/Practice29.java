package niukeOffer;


import java.util.ArrayList;
import java.util.Collections;

/**
 * 题目描述：输入n个整数，找出其中最小的K个数。例如输入4,5,1,6,2,7,3,8这8个数字，则最小的4个数字是1,2,3,4,。
 */
public class Practice29 {

    public ArrayList<Integer> GetLeastNumbers_Solution(int[] input, int k) {
        ArrayList<Integer> lastK = new ArrayList<>();

        if (k > input.length || k <= 0) {
            return lastK;
        }

        for (int i = 0; i < input.length; i++) {
            if (i < k) {
                lastK.add(input[i]);
                Collections.sort(lastK);
            } else {
                if (input[i] < lastK.get(k - 1)) {
                    lastK.remove(k - 1);
                    lastK.add(input[i]);
                    Collections.sort(lastK);
                }
            }

        }

        return lastK;

    }

    public static void main(String[] args) {
        System.out.println(new Practice29().GetLeastNumbers_Solution(new int[]{4, 5, 1, 6, 2, 7, 3, 8}, 4));
    }

}
