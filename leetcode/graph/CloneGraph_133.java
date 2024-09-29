package graph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import linkedlist.ListNode;

/**
 * CloneGraph_133
 * public Node() {
 * val = 0;
 * neighbors = new ArrayList<Node>();
 * }
 */
public class CloneGraph_133 {
  private Map<ListNode, ListNode> visited = new HashMap<>();

  public ListNode cloneGraph(ListNode node) {
    if (node == null) {
      return node;
    }

    if (visited.containsKey(node)) {
      return visited.get(node);
    }

    ListNode cloneNode = new ListNode(node.val, new ArrayList());
    visited.put(node, cloneNode);

    for (ListNode neighbor : node.neighbors) {
      cloneNode.neighbors.add(cloneGraph(neighbor));
    }
    return cloneNode;
  }
}
