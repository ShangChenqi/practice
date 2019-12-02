package niukeOffer;

/**
 * 题目描述：构建乘积数组。给定一个数组A[0,1,...,n-1],请构建一个数组B[0,1,...,n-1],其中B中的元素B[i]=A[0]*A[1]*...*A[i-1]*A[i+1]*...*A[n-1]。不能使用除法。
 */
public class Practice51 {
    public int[] multiply(int[] A) {
        int[] B = new int[A.length];
        B[0] = 1;
        //第一遍计算下三角矩阵
        for (int i = 1; i < A.length; i++) {
            B[i] = B[i - 1] * A[i - 1];
        }
        int assist = 1;
        //第二遍计算下三角矩阵
        for (int i = A.length - 2; i >= 0; i--) {
            assist *= A[i + 1];
            B[i] *= assist;
        }
        return B;
    }
}
