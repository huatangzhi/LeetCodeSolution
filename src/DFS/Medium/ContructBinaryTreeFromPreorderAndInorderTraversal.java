package DFS.Medium;

import DFS.TreeNode.TreeNode;

import java.util.HashMap;
import java.util.Map;

/**
 * null.java
 *
 * @author hepengpeng
 * @create 2018-10-14-下午5:59
 */
public class ContructBinaryTreeFromPreorderAndInorderTraversal {

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < inorder.length; i++) {
            map.put(inorder[i], i);
        }

        return  recur(preorder, inorder, 0, preorder.length, 0, inorder.length, map);
    }

    public TreeNode recur(int[] preorder, int[] inorder, int preLeft, int preRight, int inLeft, int inRight, Map<Integer, Integer> map) {

        if (preLeft == preRight || inLeft == inRight) {
            return null;
        }

        int mid = map.get(preorder[preLeft]);
        int leftLength = mid - inLeft;

        TreeNode root = new TreeNode(preorder[preLeft]);

        root.left = recur(preorder, inorder, preLeft + 1, preRight, inLeft, mid, map);
        root.right = recur(preorder, inorder, preLeft + 1 + leftLength, preRight, mid + 1, inRight, map);
        return root;
    }
}
