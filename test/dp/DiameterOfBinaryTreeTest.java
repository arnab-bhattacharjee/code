package dp;

import org.junit.Test;
import tree.TreeNode;

import static org.junit.Assert.*;

public class DiameterOfBinaryTreeTest {

    private DiameterOfBinaryTree diameter = new DiameterOfBinaryTree();

    @Test
    public void test1() {
        TreeNode n1 = new TreeNode(1);
        TreeNode n2 = new TreeNode(2);
        TreeNode n3 = new TreeNode(3);
        TreeNode n4 = new TreeNode(4);
        TreeNode n5 = new TreeNode(5);
        TreeNode n6 = new TreeNode(6);
        TreeNode n7 = new TreeNode(7);
        TreeNode n8 = new TreeNode(8);
        TreeNode n9 = new TreeNode(9);

        n1.left = n2;
        n1.right = n3;
        n2.left = n4;
        n2.right = n5;
        n4.left = n6;
        n5.right = n7;
        n6.left = n8;
        n7.right = n9;
        System.out.println(diameter.diameterOfBinaryTree(n1));
    }

    @Test
    public void test2() {
        TreeNode n1 = new TreeNode(1);
        TreeNode n2 = new TreeNode(2);
        TreeNode n3 = new TreeNode(3);

        n1.left = n2;
        n2.right = n3;

        System.out.println(diameter.diameterOfBinaryTree(n1));
    }

}