package random;

/**
 * 题目描述：给定n个非负整数表示每个宽度为1的柱子的高度图，计算按此排列的柱子，下雨之后能接多少雨水。
 */
public class RainfallCapacity {
    private int[] height = new int[]{0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
    private int[] left = new int[12];
    private int[] right = new int[12];
    private int[] capacity = new int[12];

    private int result = 0;

    private void solution() {
        //计算出辅助数组
        //left[i]表示i左侧最高柱高度
        //right[i]表述i右侧的最高柱高度
        int maxCapacity = 0;
        for (int i = 0; i < 12; i++) {
            left[i] = maxCapacity;
            maxCapacity = Math.max(height[i], maxCapacity);
        }
        maxCapacity = 0;
        for (int i = 11; i >= 0; i--) {
            right[i] = maxCapacity;
            maxCapacity = Math.max(height[i], maxCapacity);
        }

        //计算每个柱子的蓄水量
        for (int i = 0; i < 12; i++) {
            capacity[i] = Math.max(Math.min(left[i], right[i]) - height[i], 0);
        }

        //得到结果
        for (int i = 0; i < 12; i++) {
            result += capacity[i];
        }

        System.out.println(result);

    }

    public static void main(String[] args) {
        new RainfallCapacity().solution();
    }
}
