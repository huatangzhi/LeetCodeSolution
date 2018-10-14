package DFS.Easy;

import DFS.TreeNode.TreeNode;

/**
 * null.java
 *
 * @author hepengpeng
 * @create 2018-10-14-下午4:56
 */
public class SymmetricTree {

    public boolean isSymmetric(TreeNode root) {

        if (root == null) {
            return true;
        }
        return helper(root, root);
    }

    private boolean helper(TreeNode root1, TreeNode root2) {

        //两个节点都为null， 则为镜像。
        if (root1 == null && root2 == null) {
            return true;
        }

        //若任一为null，则不为镜像。
        if (root1 == null || root2 == null) {
            return false;
        }

        //若节点值不相等，则不为镜像。
        if (root1.val != root2.val){
            return false;
        } else {

            //若节点值相等，且节点1的左孩子和节点2的右孩子为镜像，且节点1的右孩子和节点2的左孩子为镜像
            return helper(root1.left, root2.right) &&
                    helper(root1.right, root2.left);
        }
    }

}
