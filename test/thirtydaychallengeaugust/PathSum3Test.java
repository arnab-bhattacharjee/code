package thirtydaychallengeaugust;

import org.junit.Assert;
import org.junit.Test;
import tree.TreeNode;

public class PathSum3Test {

    @Test
    public void test1() {
        TreeNode n1 = new TreeNode(10);
        TreeNode n2 = new TreeNode(5);
        TreeNode n3 = new TreeNode(-3);
        TreeNode n4 = new TreeNode(3);
        TreeNode n5 = new TreeNode(2);
        TreeNode n6 = new TreeNode(11);
        TreeNode n7 = new TreeNode(3);
        TreeNode n8 = new TreeNode(-2);
        TreeNode n9 = new TreeNode(1);
        n1.left = n2;
        n1.right = n3;
        n2.left = n4;
        n2.right = n5;
        n3.right = n6;
        n4.left = n7;
        n4.right = n8;
        n5.right = n9;

        PathSum3 pathSum = new PathSum3();
        int count = pathSum.pathSum(n1, 8);
        Assert.assertEquals(3, count);
    }

}