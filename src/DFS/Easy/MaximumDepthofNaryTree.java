package DFS.Easy;

import DFS.TreeNode.Node;

import java.util.LinkedList;
import java.util.Queue;

/**
 * null.java
 *
 * @author hepengpeng
 * @create 2018-10-25-下午7:17
 */
public class MaximumDepthofNaryTree {

    public int maxDepth(Node root) {

        if (root == null) {
            return 0;
        }

        int depth = 0;

        Queue<Node> queue = new LinkedList<>();

        queue.offer(root);

        while (!queue.isEmpty()) {

            int size = queue.size();

            for (int i = 0; i < size; i++) {
                Node current = queue.poll();
                for (Node child: current.children) {
                    queue.offer(child);
                }
            }
            depth++;
        }

        return depth;
    }
}
