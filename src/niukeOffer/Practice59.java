package niukeOffer;

import java.util.ArrayList;
import java.util.Stack;

/**
 * 题目描述：请实现一个函数按照之字形打印二叉树，即第一行按照从左到右的顺序打印，第二层按照从右至左的顺序打印，第三行按照从左到右的顺序打印，其他行以此类推。
 */
public class Practice59 {

    public class TreeNode {
        int val = 0;
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

        /*
          index记录当前是第几层
          奇数层从左到右输出
          偶数层从右到左输出
         */
        int index = 1;

        //根结点入队
        queue[rear] = pRoot;
        rear++;

        ArrayList<Integer> layer = new ArrayList<>();
        Stack<Integer> stack = new Stack<>();
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
            stack.push(queue[front].val);

            if (start == end) {
                end = rear;

                if (index % 2 == 0) {   //如果是偶数层，就利用栈替换
                    layer = new ArrayList<>();
                    while (!stack.empty()) {
                        layer.add(stack.pop());
                    }
                }
                result.add(layer);

                index++;

                layer = new ArrayList<>();
                stack = new Stack<>();
            }

        }


        return result;
    }
}
