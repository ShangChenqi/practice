package niukeOffer;

import java.util.ArrayList;

/**
 * 题目描述：把二叉树打印成多行。
 * 从上到下按层打印二叉树，同一层结点从左至右输出。每一层输出一行。
 */
public class Practice60 {
    public static class TreeNode {
        int val;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;

        }

    }

    public ArrayList<ArrayList<Integer>> Print(TreeNode pRoot) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();

        if (pRoot == null) {
            return result;
        }

        TreeNode[] queue = new TreeNode[50];  //模拟一个队列
        int front = -1; //队列头
        int rear = 0;   //队列尾

        //记录每层开始和结束位置
        int start = 0;
        int end = 1;

        //根结点入队
        queue[rear] = pRoot;
        rear++;

        ArrayList<Integer> layer = new ArrayList<>();
        while (front + 1 != rear) {     //队列不为空

            front++;
            start++;
            if (queue[front].left != null) {    //左结点入队
                queue[rear] = queue[front].left;
                rear++;
            }
            if (queue[front].right != null) {   //右结点入队
                queue[rear] = queue[front].right;
                rear++;
            }

            layer.add(queue[front].val);

            if (start == end) {
                end = rear;
                result.add(layer);
                layer = new ArrayList<>();
            }

        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(new Practice60().Print(new TreeNode(8)));
    }

}
