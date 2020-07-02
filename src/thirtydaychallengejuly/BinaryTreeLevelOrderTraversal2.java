package thirtydaychallengejuly;

import tree.TreeNode;

import java.util.*;

public class BinaryTreeLevelOrderTraversal2 {

    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        LinkedList<List<Integer>> res = new LinkedList<>();
        if (root == null)
            return res;
        Queue<TreeNode>[] s = new Queue[2];
        s[0] = new LinkedList<>();
        s[1] = new LinkedList<>();
        s[0].add(root);


        int depth = 0;
        while(!s[0].isEmpty() || !s[1].isEmpty()) {
            List<Integer> depthNodeVals = new ArrayList<>();
            while (!s[depth%2].isEmpty()) {
                TreeNode node = s[depth % 2].poll();
                depthNodeVals.add(node.val);
                if (node.left != null)
                    s[(depth+1) % 2].add(node.left);
                if (node.right != null)
                    s[(depth+1) % 2].add(node.right);
            }
            res.addFirst(depthNodeVals);
            depth++;
        }
        return res;
    }
}
