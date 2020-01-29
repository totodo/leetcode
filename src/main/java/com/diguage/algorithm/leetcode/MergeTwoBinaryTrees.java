package com.diguage.algorithm.leetcode;

import com.diguage.algorithm.util.JsonUtils;
import com.diguage.algorithm.util.TreeNode;

import java.util.Objects;

import static com.diguage.algorithm.util.TreeNodeUtils.buildTree;
import static java.util.Arrays.asList;

/**
 * = 617. Merge Two Binary Trees
 *
 * https://leetcode.com/problems/merge-two-binary-trees/[Merge Two Binary Trees - LeetCode]
 *
 * @author D瓜哥, https://www.diguage.com/
 * @since 2020-01-29 16:17
 */
public class MergeTwoBinaryTrees {

    /**
     * Runtime: 0 ms, faster than 100.00% of Java online submissions for Merge Two Binary Trees.
     * Memory Usage: 41.6 MB, less than 22.22% of Java online submissions for Merge Two Binary Trees.
     */
    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        if (Objects.isNull(t1)) {
            return t2;
        }
        if (Objects.isNull(t2)) {
            return t1;
        }
        t1.val += t2.val;
        t1.left = mergeTrees(t1.left, t2.left);
        t1.right = mergeTrees(t1.right, t2.right);
        return t1;
    }

    public static void main(String[] args) {
        MergeTwoBinaryTrees solution = new MergeTwoBinaryTrees();
        TreeNode r1 = solution.mergeTrees(buildTree(asList(1, 3, 2, 5)), buildTree(asList(2, 1, 3, null, 4, 7)));
        System.out.println(JsonUtils.toJson(r1));
    }
}
