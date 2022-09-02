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
    TreeNode root;
    public static void inOrderTrav(TreeNode treeRoot){
        if (treeRoot == null){
            return;
        }
        inOrderTrav(treeRoot.left);
        System.out.print(" " + treeRoot.value + " ");
        inOrderTrav(treeRoot.right);
    }

    public static void main(String[] arg){
        BinaryTree tree1 = new BinaryTree();
        tree1.root = new TreeNode(1);
        tree1.root.left = new TreeNode(2);
        tree1.root.right = new TreeNode(3);
        tree1.root.left.left = new TreeNode(4);
        tree1.root.left.right = new TreeNode(5);

        System.out.println("In-order traversal of the tree:");
        inOrderTrav(tree1.root);
    }
}
