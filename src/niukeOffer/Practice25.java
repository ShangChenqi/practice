package niukeOffer;

/**
 * 题目描述：输入一个复杂链表（每个节点中有节点值，以及两个指针，一个指向下一个节点，另一个特殊指针指向任意一个节点），返回结果为复制后复杂链表的head。
 * （注意，输出结果中请不要返回参数中的节点引用，否则判题程序会直接返回空）
 */
public class Practice25 {

    public class RandomListNode {
        int label;
        RandomListNode next = null;
        RandomListNode random = null;

        RandomListNode(int label) {
            this.label = label;
        }
    }

    public RandomListNode Clone(RandomListNode pHead) {
        if (pHead == null)
            return null;

        RandomListNode p = pHead;

        //原链表上复制结点 A->B->C 变为 A->A`->B->B`->C->C`
        while (p != null) {
            //新建一个和p一样的结点
            RandomListNode s = new RandomListNode(p.label);
            //将该结点连接在p结点之后
            s.next = p.next;
            p.next = s;
            //下一个结点
            p = s.next;
        }

        p = pHead;

        //建立random关系
        while (p != null) {
            if (p.random != null) {
                p.next.random = p.random.next;
            }
            p = p.next.next;
        }

        p = pHead;

        //将复制好的链表从原链表上拆分出来，同时保证原链表结构不变
        RandomListNode head = pHead.next;
        RandomListNode temp;
        while (p.next != null) {
            temp = p.next;
            p.next = temp.next;
            p = temp;
        }

        return head;
    }

}
