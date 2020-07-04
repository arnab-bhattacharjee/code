package dp;

import org.junit.Test;
import tree.TreeNode;

import static org.junit.Assert.*;

public class MaxSumBSTTest {

    @Test
    public void test1() {
        MaxSumBST max = new MaxSumBST();

        TreeNode n1 = new TreeNode(1);
        TreeNode n2 = new TreeNode(10);
        TreeNode n3 = new TreeNode(-5);
        TreeNode n4 = new TreeNode(20);

        n1.right = n2;
        n2.left = n3;
        n2.right = n4;

        System.out.println(max.maxSumBST(n1));
    }

}