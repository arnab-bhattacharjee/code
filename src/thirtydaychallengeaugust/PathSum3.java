package thirtydaychallengeaugust;

import tree.TreeNode;

import java.util.HashMap;
import java.util.Map;

public class PathSum3 {
    private static final int MAX_NODES = 1000;

    public int pathSum(TreeNode root, int sum) {
        if (root == null)
            return 0;
        int[] pathPrefixSum = new int[MAX_NODES];
        Map<Integer, Integer> prefixSumToCount = new HashMap<>();
        return pathSum(root, sum, pathPrefixSum, 0, prefixSumToCount);
    }

    private int pathSum(TreeNode root, int sum, int[] pathPrefixSum, int pathLength
            , Map<Integer, Integer> prefixSumToCount) {
        int pathCount = 0;
        pathPrefixSum[pathLength] = root.val;
        if (pathLength-1 >= 0)
            pathPrefixSum[pathLength] += pathPrefixSum[pathLength-1];

        if (pathPrefixSum[pathLength] == sum)
            pathCount++;

        int target = pathPrefixSum[pathLength] - sum;

        if (prefixSumToCount.containsKey(target)) {
            pathCount += prefixSumToCount.get(target);
        }

        if (prefixSumToCount.containsKey(pathPrefixSum[pathLength])) {
            prefixSumToCount.put(pathPrefixSum[pathLength], prefixSumToCount.get(pathPrefixSum[pathLength]) + 1);
        } else {
            prefixSumToCount.put(pathPrefixSum[pathLength], 1);
        }

        if (root.left != null) {
            pathCount += pathSum(root.left, sum, pathPrefixSum, pathLength+1, prefixSumToCount);
        }
        if (root.right != null) {
            pathCount += pathSum(root.right, sum, pathPrefixSum, pathLength+1, prefixSumToCount);
        }

        prefixSumToCount.put(pathPrefixSum[pathLength], prefixSumToCount.get(pathPrefixSum[pathLength]) - 1);

        return pathCount;
    }
}
