package niukeOffer;


/**
 * 题目描述：报数游戏
 */
public class Practice46 {
    public int LastRemaining_Solution(int n, int m) {
        if(n <= 0 || m <= 0){
            return -1;
        }
        int[] number = new int[n];
        int index = -1;
        int step = 0;
        while(n > 0){
            index++;
            if(index >= number.length){
                index = 0;
            }
            if(number[index] == 1){
                continue;
            }
            step++;
            if(step == m){
                number[index] = 1;
                step = 0;
                n--;
            }

        }

        return index;
    }

    public static void main(String[] args) {
        System.out.println(new Practice46().LastRemaining_Solution(5,4));
    }
}
