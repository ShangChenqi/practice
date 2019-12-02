package leetcode;

import java.util.HashMap;

/**
 * 题目描述：对于给定的n个位于同一二维平面上的点，求最多能有多少个点位于同一直线上（共线问题）
 * 说明：该题描述的"同一条直线上"有问题
 */
public class Practice003 {
    class Point {
        int x;
        int y;

        Point() {
            x = 0;
            y = 0;
        }

        Point(int a, int b) {
            x = a;
            y = b;
        }
    }

    public int maxPoints(Point[] points) {
        if (points == null) {
            return 0;
        }
        if (points.length <= 2) {
            return points.length;
        }

        //key为每组数除以最大公约数的结果
        HashMap<HashMap<Integer, Integer>, Integer> map = new HashMap<>();
        int result = 0;
        for (int i = 0; i < points.length; i++) {
            //每次循环完毕要清空map，否则会把上次统计结果带到下一次循环来
            map.clear();
            //重合点统计
            int dup = 1;
            int max = 0;
            for (int j = i + 1; j < points.length; j++) {
                int gapX = points[i].x - points[j].x;
                int gapY = points[i].y - points[j].y;
                if (gapX == 0 && gapY == 0) {
                    dup++;
                    continue;
                }
                int d = gcd(gapX, gapY);
                HashMap<Integer, Integer> tmpMap = new HashMap<>();
                tmpMap.put(gapX / d, gapY / d);
                map.put(tmpMap, map.getOrDefault(tmpMap, 0) + 1);
                max = Math.max(max, map.get(tmpMap));
            }
            result = Math.max(result, max + dup);
        }

        return result;
    }

    //辗转相除法求最大公约数
    private int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }

}
