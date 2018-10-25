package DFS.TreeNode;

import java.util.List;

/**
 * null.java
 *
 * @author hepengpeng
 * @create 2018-10-25-下午7:27
 */
public class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val,List<Node> _children) {
        val = _val;
        children = _children;
    }
}
