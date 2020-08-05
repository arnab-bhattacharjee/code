package thirtydaychallengejuly;

import tree.TreeNode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class ZizgzagOrderTRaversal {

    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        LinkedList<TreeNode>[] nodes = new LinkedList[2];

        nodes[0] = new LinkedList<>();
        nodes[1] = new LinkedList<>();

        nodes[0].add(root);

        List<List<Integer>> res = new ArrayList<>();
        int level = 0;
        while (!nodes[0].isEmpty()) {
            if (level % 2 == 0) {
                res.add(nodes[0].stream().map(node -> node.val).collect(Collectors.toList()));
            } else {
                List<TreeNode> rev = new ArrayList<>(nodes[0]);
                Collections.reverse(rev);
                res.add(rev.stream().map(node -> node.val).collect(Collectors.toList()));
            }
            nodes[1] = new LinkedList<>();
            while (!nodes[0].isEmpty()) {
                TreeNode node = nodes[0].poll();
                if (node.left != null)
                    nodes[1].add(node.left);
                if (node.right != null)
                    nodes[1].add(node.right);
            }
            nodes[0] = nodes[1];
            level++;
        }

        return res;
    }
}
