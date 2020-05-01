package thirty_day_challenge_april;

import org.junit.Test;
import tree.TreeNode;

public class BSTFromPreOrderTraversalTest {

    private BSTFromPreOrderTraversal bst = new BSTFromPreOrderTraversal();

    @Test
    public void test1() {
        TreeNode t = bst.bstFromPreorder(new int[]{8,5,1,7,10,12});
        System.out.println("a");
    }

}