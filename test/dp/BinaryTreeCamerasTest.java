package dp;

import helper.TreeNode;
import org.junit.Assert;
import org.junit.Test;

public class BinaryTreeCamerasTest {

    private BinaryTreeCameras cameras = new BinaryTreeCameras();

    @Test
    public void test1() {
        TreeNode n1 = new TreeNode(0);
        TreeNode n2 = new TreeNode(0);
        TreeNode n3 = new TreeNode(0);
        TreeNode n4 = new TreeNode(0);
        n1.left = n2;
        n2.left = n3;
        n2.right = n4;
        Assert.assertEquals(1, cameras.minCameraCover(n1));
    }

    @Test
    public void test2() {
        TreeNode n1 = new TreeNode(0);
        TreeNode n2 = new TreeNode(0);
        TreeNode n3 = new TreeNode(0);
        TreeNode n4 = new TreeNode(0);
        TreeNode n5 = new TreeNode(0);
        TreeNode n6 = new TreeNode(0);
        TreeNode n7 = new TreeNode(0);
        TreeNode n8 = new TreeNode(0);
        n1.left = n2;
        n2.left = n3;
        n3.left = n4;
        n4.right = n5;
        n1.right = n6;
        n6.right = n7;
        n7.right = n8;
        Assert.assertEquals(3, cameras.minCameraCover(n1));
    }

}