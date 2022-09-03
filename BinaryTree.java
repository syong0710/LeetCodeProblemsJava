import java.util.ArrayList;
import java.util.List;

class TreeNode{
    int value;
    TreeNode left;
    TreeNode right;

    public TreeNode(int nodeValue){
        value = nodeValue;
        left = null;
        right = null;
    }
}


public class BinaryTree {
    // Root of Binary Tree
    TreeNode root;

    // Constructors
    BinaryTree(int rootValue) { root = new TreeNode(rootValue); }
    BinaryTree() { root = null; }

    // Print in-order traversal
    void printInOrder(TreeNode root){
        if(root == null){
            return;
        }
        printInOrder(root.left);
        System.out.print(root.value + " ");
        printInOrder(root.right);
    }

    // return a list, in-order traversal
    public List<Integer> listInOrder(TreeNode root){
        List<Integer> results = new ArrayList<>();
        inOrderTrav(root,results);
        return results;
    }

  void inOrderTrav(TreeNode root, List<Integer> resultList){
        if(root == null){
            return;
        }
        inOrderTrav(root.left, resultList);
        resultList.add(root.value);
        inOrderTrav(root.right,resultList);
    }



    public static void main(String[] arg){

        // The first Binary Tree
        BinaryTree tree1 = new BinaryTree();
        // create root
        tree1.root = new TreeNode(1);
        tree1.root.left = new TreeNode(2);
        tree1.root.right = new TreeNode(3);
        tree1.root.left.left = new TreeNode(4);
        tree1.root.left.right = new TreeNode(5);
        /*
                       1
                    /    \
                   2       3
                 /  \
                4    5
         */

        // The second Binary Tree
        BinaryTree tree2 = new BinaryTree(11);
        tree2.root.left = new TreeNode(13);
        tree2.root.right = new TreeNode(15);
        tree2.root.left.left = new TreeNode(17);
        /*
                        11
                    /      \
                   13       15
                 /
                17
         */


        System.out.println("in-order traversal of tree1: ");
        tree1.printInOrder(tree1.root);
        System.out.println(" ");

        System.out.println("in-order traversal list of tree1: " + tree1.listInOrder(tree1.root));

        System.out.println("in-order traversal of tree2: ");
        tree2.printInOrder(tree2.root);
        System.out.println(" ");

        System.out.println("in-order traversal list of tree2: " + tree2.listInOrder(tree2.root));

    }
}
