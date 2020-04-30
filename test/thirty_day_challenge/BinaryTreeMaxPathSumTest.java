package thirty_day_challenge;

import org.junit.Test;
import tree.TreeNode;

import static org.junit.Assert.*;

public class BinaryTreeMaxPathSumTest {

    private BinaryTreeMaxPathSum maxPathSum = new BinaryTreeMaxPathSum();

    @Test
    public void test1() {
        TreeNode n1 = new TreeNode(-10);
        TreeNode n2 = new TreeNode(9);
        TreeNode n3 = new TreeNode(20);
        TreeNode n4 = new TreeNode(15);
        TreeNode n5 = new TreeNode(7);

        n1.left = n2;
        n1.right = n3;
        n3.left = n4;
        n3.right = n5;

        System.out.println(maxPathSum.maxPathSum(n1));
    }

}