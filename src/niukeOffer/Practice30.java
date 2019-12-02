package niukeOffer;

/**
 * 题目描述：给一个数组，返回它的最大连续子序列的和
 */
public class Practice30 {
    public int FindGreatSumOfSubArray(int[] array){
        if(array == null || array.length == 0){
            return 0;
        }

        int finalMax = array[0];
        int tempMax = array[0];

        for(int i = 1; i < array.length; i++){
            tempMax = tempMax < 0 ? array[i] : tempMax + array[i];
            finalMax = tempMax > finalMax ? tempMax : finalMax;
        }

        return finalMax;
    }
}
