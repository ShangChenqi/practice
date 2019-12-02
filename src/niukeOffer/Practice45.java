package niukeOffer;

/**
 * 题目描述：扑克牌顺序
 * LL今天心情特别好,因为他去买了一副扑克牌,发现里面居然有2个大王,2个小王(一副牌原本是54张^_^)
 * 他随机从中抽出了5张牌,想测测自己的手气,看看能不能抽到顺子,如果抽到的话,他决定去买体育彩票,
 * 嘿嘿！！“红心A,黑桃3,小王,大王,方片5”,“Oh My God!”不是顺子.....LL不高兴了,他想了想,决定大\小 王可以看成任何数字,并且A看作1,J为11,Q为12,K为13。
 * 上面的5张牌就可以变成“1,2,3,4,5”(大小王分别看作2和4),“So Lucky!”。LL决定去买体育彩票啦。
 * 现在,要求你使用这幅牌模拟上面的过程,然后告诉我们LL的运气如何， 如果牌能组成顺子就输出true，否则就输出false。为了方便起见,你可以认为大小王是0。
 */
public class Practice45 {
    /**
     * 原题假设numbers数组长度为5，这里不限制数组长度
     */
    public boolean isContinuous(int[] numbers) {
        int min = 14;
        int max = -1;
        int countZero = 0;  //统计大小王数目
        int[] sequence = new int[14];
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == 0) {
                countZero++;
            } else {
                min = numbers[i] < min ? numbers[i] : min;  //除了大小王外牌中出现的最小数字
                max = numbers[i] > max ? numbers[i] : max;  //除了大小王外牌中出现的最大数字
                if (sequence[numbers[i]] == 1)  //不允许出现重复的牌
                    return false;
                sequence[numbers[i]] = 1;
            }
        }
        int countLess = 0;  //统计除了大小王外缺失的牌的张数
        for (int j = min; j <= max; j++) {
            if (sequence[j] == 0) {
                countLess++;
            }
        }
        return countLess <= countZero && numbers.length != 0;

    }

    public static void main(String[] args) {
        System.out.println(new Practice45().isContinuous(new int[]{}));
    }
}
