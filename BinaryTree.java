import java.util.*;

class TreeNode{
    int value;
    TreeNode left;
    TreeNode right;

    // The constructor
    public TreeNode(int nodeValue){
        value = nodeValue;
        left = null;
        right = null;
    }
}

public class BinaryTree{
    public TreeNode root;

    static List<Integer> results = new ArrayList<>();
    public static List<Integer> inOrderTravList(TreeNode treeRoot){
        if (treeRoot != null){
            inOrderTravList(treeRoot.left);
            // System.out.print(" " + treeRoot.value + " ");
            results.add(treeRoot.value);
            inOrderTravList(treeRoot.right);
        }
        return results;
    }

    public static void main(String[] arg){
        BinaryTree tree1 = new BinaryTree();
        tree1.root = new TreeNode(1);
        tree1.root.left = new TreeNode(2);
        tree1.root.right = new TreeNode(3);
        tree1.root.left.left = new TreeNode(4);
        tree1.root.left.right = new TreeNode(5);

        /*

                        1
                     /    \
                   2        3
                 /   \
                4     5

         */

        System.out.println("In-order traversal:" + (inOrderTravList(tree1.root)) );
    }
}
