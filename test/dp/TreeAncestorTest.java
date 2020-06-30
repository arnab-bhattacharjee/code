package dp;

import org.junit.Test;

import static org.junit.Assert.*;

public class TreeAncestorTest {

    @Test
    public void test1() {
        TreeAncestor anc = new TreeAncestor(7, new int[]{-1,0,0,1,1,2,2});
        System.out.println(anc.getKthAncestor(3,1));
        System.out.println(anc.getKthAncestor(5,2));
        System.out.println(anc.getKthAncestor(6, 3));
    }

}