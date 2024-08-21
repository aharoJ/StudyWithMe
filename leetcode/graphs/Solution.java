package graphs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Stack;

/**
 * Input: edges = [[1,2],[2,3],[4,2]]
 * Output: 2
 * 
 * Input: edges = [[1,2],[5,1],[1,3],[1,4]]
 * Output: 0
 */
@SuppressWarnings("unused") // Nvim
class Solution {
  private HashMap<Node, Node> visited = new HashMap<>();
  public Node cloneGraph(Node node) {
    if (node == null) {
      return node;
    }

    if (visited.containsKey(node)) {
      return visited.get(node);
    }

    // Create a clone for the given node.
    // Note that we don't have cloned neighbors as of now, hence [].
    Node cloneNode = new Node(node.val, new ArrayList());
    // The key is original node and value being the clone node.
    visited.put(node, cloneNode);

    // Iterate through the neighbors to generate their clones
    // and prepare a list of cloned neighbors to be added to the cloned node.
    for (Node neighbor : node.neighbors) {
      cloneNode.neighbors.add(cloneGraph(neighbor));
    }
    return cloneNode;
  }
}
