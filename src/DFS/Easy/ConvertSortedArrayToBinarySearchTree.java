package DFS.Easy;

import DFS.TreeNode.TreeNode;

/**
 * null.java
 *
 * @author hepengpeng
 * @create 2018-10-14-下午4:55
 */
public class ConvertSortedArrayToBinarySearchTree {

    public TreeNode sortedArrayToBST(int[] num) {

        if (0 == num.length) {
            return null;
        }
        TreeNode root = helper(num, 0, num.length - 1);
        return root;
    }


    private TreeNode helper(int[] num, int low, int high) {

        if (low > high ) {
            return null;
        }

        //获取中间节点
        int mid = (low + high) / 2;

        //以中间节点为根节点
        TreeNode node = new TreeNode(num[mid]);

        //递归构造中间节点的左右孩子
        node.left = helper(num, low, mid - 1);
        node.right = helper(num, mid + 1, high);
        return node;

    }

}
