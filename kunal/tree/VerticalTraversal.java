package tree;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

/**
 * VerticalTraversal
 */
public class VerticalTraversal {
  public List<List<Integer>> verticalTraversal(TreeNode root) {
    List<List<Integer>> result = new ArrayList<>();
    if (root == null) {
      return result;
    }

    int col = 0;
    Queue<Map<TreeNode, Integer>> queue = new LinkedList<>();
    Map<Integer, ArrayList<Integer>> map = new HashMap<>();
    queue.offer()

    return result;
  }

  private class TreeNode {
    private int val;
    private int height;
    TreeNode left;
    TreeNode right;

    public TreeNode(int val) {
      this.val = val;
    }
  }
}
