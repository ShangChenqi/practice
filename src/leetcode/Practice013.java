package leetcode;

/**
 * 题目描述：实现带随机指针的链表的深拷贝
 */
public class Practice013 {

    class RandomListNode {
        int label;
        RandomListNode next, random;

        RandomListNode(int x) {
            this.label = x;
        }
    }

    public RandomListNode copyRandomList(RandomListNode head) {
        RandomListNode dummyHead = new RandomListNode(0);
        if (head == null) {
            return dummyHead.next;
        }

        //先复制结点（建立next指针关系）
        RandomListNode p = head;
        while (p != null) {
            RandomListNode temp = new RandomListNode(p.label);
            temp.next = p.next;
            p.next = temp;
            p = temp.next;
        }

        //建立random指针关系
        p = head;
        while (p != null) {
            if (p.random != null) {
                p.next.random = p.random.next;
            }
            p = p.next.next;
        }

        //断链形成新的链表
        p = head;
        RandomListNode s = dummyHead;
        while (p != null) {
            s.next = p.next;
            s = s.next;
            p = s.next;
            s.next = null;
        }

        return dummyHead.next;
    }

}
