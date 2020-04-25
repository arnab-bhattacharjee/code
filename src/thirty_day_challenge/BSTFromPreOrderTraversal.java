package thirty_day_challenge;

import sun.reflect.generics.tree.Tree;
import tree.TreeNode;

import java.util.Arrays;

public class BSTFromPreOrderTraversal {

    public TreeNode bstFromPreorder(int[] preorder) {
        int n= preorder.length;
        int[] inorder = preorder.clone();
        Arrays.sort(inorder);

        return bstFromPreorderAndInorder(preorder, inorder, 0, n-1, 0, n-1);
    }

    public TreeNode bstFromPreorderAndInorder(int[] preorder, int[] inorder, int lPre, int rPre, int lIn, int rIn) {
        if (lPre > rPre) return null;
        int rootVal = preorder[lPre];
        int idx = Arrays.binarySearch(inorder, lIn, rIn + 1, rootVal);

        TreeNode root = new TreeNode(rootVal);
        root.left = bstFromPreorderAndInorder(preorder, inorder, lPre+1, lPre+idx-lIn, lIn, idx-1);
        root.right = bstFromPreorderAndInorder(preorder, inorder, lPre+idx-lIn+1, rPre, idx+1, rIn);
        return root;
    }
}
