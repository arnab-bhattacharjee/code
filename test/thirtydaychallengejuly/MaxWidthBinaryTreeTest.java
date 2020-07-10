package thirtydaychallengejuly;

import org.junit.Test;
import tree.TreeNode;

public class MaxWidthBinaryTreeTest {

    @Test
    public void test1() {
        MaxWidthBinaryTree maxWidth = new MaxWidthBinaryTree();
        TreeNode n1 = new TreeNode(1);
        TreeNode n2 = new TreeNode(3);
        TreeNode n3 = new TreeNode(2);
        TreeNode n4 = new TreeNode(5);
        TreeNode n5 = new TreeNode(3);
        TreeNode n6 = new TreeNode(9);

        n1.left = n2;
        n1.right = n3;
        n2.left = n4;
        n2.right = n5;
        n3.right = n6;

        maxWidth.widthOfBinaryTree(n1);
    }


}