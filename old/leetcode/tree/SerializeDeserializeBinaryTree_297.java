package tree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * SerializeDeserializeBinaryTree_297
 * hard af
 */
public class SerializeDeserializeBinaryTree_297 {
  // Serializes a tree to a single string.
  public String serialize(TreeNode root) {
    List<String> list = new ArrayList<>();
    serializeHelper(root, list);
    return String.join(",", list); // Join list into a single string with commas
  }

  private void serializeHelper(TreeNode node, List<String> list) {
    if (node == null) {
      list.add("null");
      return;
    }
    list.add(String.valueOf(node.val));
    serializeHelper(node.left, list);
    serializeHelper(node.right, list);
  }

  // Deserializes your encoded data to tree.
  public TreeNode deserialize(String data) {
    List<String> list = new LinkedList<>(Arrays.asList(data.split(",")));
    return deserializeHelper(list);
  }

  private TreeNode deserializeHelper(List<String> list) {
    if (list.get(0).equals("null")) {
      list.remove(0);
      return null;
    }

    TreeNode node = new TreeNode(Integer.parseInt(list.remove(0)));
    node.left = deserializeHelper(list);
    node.right = deserializeHelper(list);

    return node;
  }
}
