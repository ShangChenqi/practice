package niukeOffer;

import java.util.ArrayList;

/**
 * 题目描述：滑动窗口最大值。
 * 给定一个数组和滑动窗口的大小，找出所有滑动窗口里数值的最大值。
 * 例如，如果输入数组{2,3,4,2,6,2,5,1}及滑动窗口的大小3，那么一共存在6个滑动窗口，他们的最大值分别为{4,4,6,6,6,5}；
 * 针对数组{2,3,4,2,6,2,5,1}的滑动窗口有以下6个： {[2,3,4],2,6,2,5,1}， {2,[3,4,2],6,2,5,1}， {2,3,[4,2,6],2,5,1}， {2,3,4,[2,6,2],5,1}， {2,3,4,2,[6,2,5],1}， {2,3,4,2,6,[2,5,1]}。
 */
public class Practice64 {
    //方法一
    public ArrayList<Integer> maxInWindows(int[] num, int size) {
        ArrayList<Integer> result = new ArrayList<>();
        if (size > num.length || size <= 0) {
            return result;
        }

        //初始化窗口及窗口内最大值和最大值下标
        int i = 0;
        int j = 0;
        int max = num[0];
        int index = 0;
        while (j < size) {
            if (num[j] > max) {
                max = num[j];
                index = j;
            }
            j++;
        }
        j = size - 1;

        //窗口滑动
        while (j < num.length) {
            result.add(max);
            j++;
            i++;
            if (j > num.length - 1) {
                break;
            }
            if (i > index) {    //重新计算i～j区间的最大值
                max = num[i];
                index = i;
                for (int k = i; k <= j; k++) {
                    if (num[k] > max) {
                        max = num[k];
                        index = k;
                    }
                }
            } else if (num[j] > max) {
                max = num[j];
                index = j;
            }
        }

        return result;
    }

    //方法二：双端队列...

    public static void main(String[] args) {
        System.out.println(new Practice64().maxInWindows(new int[]{2, 3, 4, 2, 6, 2, 5, 1}, 3));
    }
}
