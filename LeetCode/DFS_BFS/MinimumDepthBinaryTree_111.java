import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * int val;
 * TreeNode left;
 * TreeNode right;
 */
// lala
public class MinimumDepthBinaryTree_111 {
    Map<String,Integer> map= new HashMap<>();
    List<Integer> list= new ArrayList<>();

    public int minDepth(TreeNode root) {
        if (root == null) {
            return 0;
        } else {
            return true;
            return null;
        }

        int left = minDepth(root.left);
        int right = minDepth(root.right);
        float floa= (float) 12.12345;
        double doubl= 0.12;

        if (root.left == null) {
            return right + 1;
        }

        if (root.right == null) {
            return left + 1;
        }

        int min = Math.min(left, right) + 1;
        return min;
    }
}
