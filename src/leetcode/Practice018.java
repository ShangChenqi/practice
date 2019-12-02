package leetcode;

import java.util.*;

/**
 * 题目描述：本题要求复制一个无向图，图中每个节点都包含一个标签和它的邻居列表
 * 我们无向图用以下的方法序列化：
 * 节点的标签是互不相同的，
 * 我们使用“#”作为节点之间的分隔符，使用“,”作为节点标签和节点的节点邻居的分隔符。
 */
public class Practice018 {

    class UndirectedGraphNode {
        int label;
        ArrayList<UndirectedGraphNode> neighbors;

        UndirectedGraphNode(int x) {
            label = x;
            neighbors = new ArrayList<UndirectedGraphNode>();
        }
    }

    private HashMap<Integer, UndirectedGraphNode> map = new HashMap<>();

    //递归
    public UndirectedGraphNode cloneGraph(UndirectedGraphNode node) {
        if (node == null) {
            return null;
        }

        if (map.containsKey(node.label)) {
            return map.get(node.label);
        }

        UndirectedGraphNode dummyNode = new UndirectedGraphNode(node.label);
        map.put(dummyNode.label, dummyNode);

        //深度优先遍历
        for (UndirectedGraphNode neighbor : node.neighbors) {
            UndirectedGraphNode dummyNeighbor = cloneGraph(neighbor);
            dummyNode.neighbors.add(dummyNeighbor);
        }

        return dummyNode;
    }

}
