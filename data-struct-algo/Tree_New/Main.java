package Tree_New;

public class Main {
    public static void main(String[] args) {
        // Create an instance of SearchKey and add elements
        SearchKey searchTree = new SearchKey();
        searchTree.insert(3);
        searchTree.insert(1);
        searchTree.insert(9);
        searchTree.insert(6);

        // Perform search in SearchKey instance
        TreeNode foundNode = searchTree.searchForKey(9);
        System.out.println("\nSearchKey Result:");
        if (foundNode != null) {
            System.out.println("Found: " + foundNode.val);
        } else {
            System.out.println("Key not found in the tree.");
        }

        // You can also perform in-order traversal on SearchKey instance if desired
        System.out.println("SearchKey In-Order Traversal:");
        searchTree.inOrder();

        System.out.println("\n\n----- PATH SUM BELOW-----");
        PathSum pathSumTree = new PathSum();
        pathSumTree.insert(5);
        pathSumTree.insert(4);
        pathSumTree.insert(8);
        pathSumTree.insert(11);
        pathSumTree.insert(7);
        pathSumTree.insert(2);
        pathSumTree.insert(13);
        pathSumTree.insert(4);
        pathSumTree.insert(1);

        // Check if the tree has a path sum of 22
        boolean hasPath = pathSumTree.hasPathSum(pathSumTree.root, 22);
        System.out.println("PathSum check for sum 22: " + hasPath);

        // Perform in-order traversal on PathSum instance if desired
        System.out.println("PathSum In-Order Traversal:");
        pathSumTree.inOrder();

        System.out.println("\n\n----- FIND TARGET VALUE -----");
        FindTarget find = new FindTarget();
        find.insert(1);
        find.insert(2);
        find.insert(2);
        find.insert(1);

        find.insert(1);
        boolean hasTarget = find.findTarget(find.root, 7);
        System.out.println("Target of total sum: " + hasTarget);

        System.out.println("In-Order Traversal ");
        find.inOrder();
    }
}
