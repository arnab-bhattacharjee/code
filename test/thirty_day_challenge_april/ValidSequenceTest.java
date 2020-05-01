package thirty_day_challenge_april;

import org.junit.Test;
import tree.TreeNode;

public class ValidSequenceTest {

    private ValidSequence validSequence = new ValidSequence();

    @Test
    public void test1() {
        TreeNode n1 = new TreeNode(0);
        TreeNode n2 = new TreeNode(1);
        TreeNode n3 = new TreeNode(0);
        TreeNode n4 = new TreeNode(0);
        TreeNode n5 = new TreeNode(1);
        TreeNode n6 = new TreeNode(0);
        TreeNode n7 = new TreeNode(1);
        TreeNode n8 = new TreeNode(0);
        TreeNode n9 = new TreeNode(0);
        n1.left = n2;
        n1.right = n3;
        n2.left = n4;
        n2.right = n5;
        n3.left = n6;
        n4.right = n7;
        n5.left = n8;
        n5.right = n9;
        System.out.println(validSequence.isValidSequence(n1, new int[]{0,1,0,1}));
    }

}