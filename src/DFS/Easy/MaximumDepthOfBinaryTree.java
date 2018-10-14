package DFS.Easy;

import DFS.TreeNode.TreeNode;

/**
 * null.java
 *
 * @author hepengpeng
 * @create 2018-10-14-下午4:52
 */
public class MaximumDepthOfBinaryTree {


    public int maxDepth(TreeNode root) {
        if (root == null ) {
            return 0;
        }
        // 返回左右孩子中深度较大的一个，并加1
        return Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;
    }
}
