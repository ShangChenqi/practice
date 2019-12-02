package niukeOffer;

/**
 * ��Ŀ������ ��һ����ά�����У�ÿ��һά����ĳ�����ͬ���� ÿһ�ж����մ����ҵ�����˳������ÿһ�ж����մ��ϵ��µ�����˳������
 * �����һ������������������һ����ά�����һ���������ж��������Ƿ��и�������
 *
 * @author Shang
 */
public class Practice01 {
    public static void main(String[] args) {

    }

    /**
     * ����������ģ������½ǹ۲죬�������ֵݼ����������ֵ����� ��˴����½ǣ������Ͻ���ɣ���ʼ���ң�����ֵ��Ŀ��ֵСʱ���ƣ���Ŀ��ֱ��ʱ���ơ�
     * ʱ�临�Ӷ�ΪO(m + n),m,n�ֱ�Ϊ���������������
     */
    public boolean Find(int target, int[][] array) {
        int rowLength = array.length;
        int lineLength = array[0].length;

        int i = rowLength - 1;
        int j = 0;

        while (i >= 0 && i < rowLength && j >= 0 && j < lineLength) {
            if (target == array[i][j]) {
                return true;
            }
            if (target > array[i][j]) {
                j++;
            } else {
                i--;
            }
        }

        return false;
    }
}
