package thirty_day_challenge_may;

import org.junit.Test;
import tree.TreeNode;

import static org.junit.Assert.*;

public class KthSmallesElemInBSTTest {

    private KthSmallesElemInBST kthSmallesElemInBST = new KthSmallesElemInBST();

    @Test
    public void test1() {
        TreeNode n1 = new TreeNode(3);
        TreeNode n2 = new TreeNode(1);
        TreeNode n3 = new TreeNode(4);
        TreeNode n4 = new TreeNode(2);

        n1.left = n2;
        n1.right = n3;
        n2.right = n4;

        System.out.println(kthSmallesElemInBST.kthSmallest(n1, 1));
    }
}