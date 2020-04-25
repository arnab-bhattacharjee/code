package thirty_day_challenge;

import org.junit.Test;
import sun.reflect.generics.tree.Tree;
import tree.TreeNode;

import static org.junit.Assert.*;

public class BSTFromPreOrderTraversalTest {

    private BSTFromPreOrderTraversal bst = new BSTFromPreOrderTraversal();

    @Test
    public void test1() {
        TreeNode t = bst.bstFromPreorder(new int[]{8,5,1,7,10,12});
        System.out.println("a");
    }

}