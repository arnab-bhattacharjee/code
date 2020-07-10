package thirtydaychallengejuly;

import tree.TreeNode;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class MaxWidthBinaryTree {

    public int widthOfBinaryTree(TreeNode root) {
        Queue<TreeNode> s = new LinkedList<>();
        Deque<Integer> m = new LinkedList<>();

        s.add(root);
        m.add(1);
        int maxWidth = 0;
        while(!s.isEmpty()) {
            Queue<TreeNode> t = new LinkedList<>();
            Deque<Integer> n = new LinkedList<>();
            while(!s.isEmpty()) {
                TreeNode node = s.poll();
                int label = m.poll();
                if (node.left != null) {
                    t.add(node.left);
                    n.add(label<<1);
                }
                if (node.right != null) {
                    t.add(node.right);
                    n.add((label<<1) + 1);
                }
            }
            if (!n.isEmpty())
                maxWidth = Math.max(maxWidth, n.peekLast() - n.peekFirst() + 1);
            s = t;
            m = n;
        }
        return maxWidth;
    }
}
