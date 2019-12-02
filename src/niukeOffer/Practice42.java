package niukeOffer;

import java.util.ArrayList;

/**
 * 题目描述：输入一个递增排序的数组和一个数字S，在数组中查找两个数，使得他们的和正好是S。
 * 如果有多对数字的和等于S，输出两个数的乘积最小的。
 */
public class Practice42 {
    public ArrayList<Integer> FindNumbersWithSum(int[] array, int sum) {
        ArrayList<Integer> result = new ArrayList<>();
        int low = 0, high = array.length - 1;
        while (low < high){
            if(array[low] + array[high] == sum){
                result.add(array[low]);
                result.add(array[high]) ;
                break;
            }
            while(low < high && array[low] + array[high] > sum){
                high--;
            }
            while(low < high && array[low] + array[high] < sum){
                low++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(new Practice42().FindNumbersWithSum(new int[]{1, 2, 4, 7, 11, 15}, 15));
    }
}
