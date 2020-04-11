package dp;

import tree.TreeNode;

import java.util.HashMap;
import java.util.Map;

public class DiameterOfBinaryTree {

    public int diameterOfBinaryTree(TreeNode root) {
        Map<TreeNode, Integer> ls = new HashMap<>();
        Map<TreeNode, Integer> rs = new HashMap<>();
        getHeight(root, ls, rs);
        int diameter = 0;
        for (Map.Entry<TreeNode, Integer> e:ls.entrySet()) {
            diameter = Math.max(diameter, e.getValue() + rs.getOrDefault(e.getKey(), 0));
        }
        return diameter;
    }

    public void getHeight(TreeNode root, Map<TreeNode, Integer> ls, Map<TreeNode, Integer> rs) {
        if (root == null) return;
        if (ls.containsKey(root))
            return;
        if (root.left == null) {
            ls.put(root, 0);
        } else {
            getHeight(root.left, ls, rs);
            int lMax = Math.max(ls.get(root.left), rs.get(root.left));
            ls.put(root, lMax+1);
        }
        if (root.right == null) {
            rs.put(root, 0);
        } else {
            getHeight(root.right, ls, rs);
            int rMax = Math.max(rs.get(root.right), ls.get(root.right));
            rs.put(root, rMax+1);
        }
    }
}
