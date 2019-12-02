package leetcode;

import java.util.Arrays;

/**
 * 题目描述：有N个小朋友站在一排，每个小朋友都有一个评分
 * 你现在要按以下的规则给孩子们分糖果：
 * 每个小朋友至少要分得一颗糖果
 * 分数高的小朋友要他比旁边得分低的小朋友分得的糖果多
 * 你最少要分发多少颗糖果？
 */
public class Practice016 {
    //从左向右和从右向左各遍历一遍
    public int candy(int[] ratings) {
        int[] candies = new int[ratings.length];
        Arrays.fill(candies, 1);
        for (int i = 0, j = 1; i < ratings.length && j < ratings.length; i++, j++) {
            if (ratings[j] > ratings[i] && candies[j] <= candies[i]) {
                candies[j] = candies[i] + 1;
            }
        }
        for (int i = ratings.length - 1, j = i - 1; i >= 0 && j >= 0; i--, j--) {
            if (ratings[j] > ratings[i] && candies[j] <= candies[i]) {
                candies[j] = candies[i] + 1;
            }
        }
        int result = 0;
        for (int candy : candies) {
            result += candy;
        }
        return result;
    }
}
