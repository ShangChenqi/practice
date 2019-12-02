package leetcode;

/**
 * 题目描述：环形路上有n个加油站，第i个加油站的汽油量是gas[i].
 * 你有一辆车，车的油箱可以无限装汽油。从加油站i走到下一个加油站（i+1）花费的油量是cost[i]，你从一个加油站出发，刚开始的时候油箱里面没有汽油。
 * 求从哪个加油站出发可以在环形路上走一圈。返回加油站的下标，如果没有答案的话返回-1。
 * 注意：
 * 答案保证唯一。
 */
public class Practice017 {
    //题目详解：https://leetcode-cn.com/problems/gas-station/solution/jia-you-zhan-by-leetcode/
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int totalTank = 0;
        int currTank = 0;
        int startStation = 0;
        for (int i = 0; i < gas.length; i++) {
            totalTank += gas[i] - cost[i];
            currTank += gas[i] - cost[i];
            if (currTank < 0) {
                startStation = i + 1;
                currTank = 0;
            }
        }
        return totalTank < 0 ? -1 : startStation;
    }
}
