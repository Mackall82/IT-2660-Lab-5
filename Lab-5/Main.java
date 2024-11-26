import java.util.ArrayList;
import java.util.List;

import javax.sound.sampled.SourceDataLine;

class Main {
  public static void main(String[] args) {


    // Step 1 - Create a BST tree object called lab5Tree

    
    BST<Integer> lab5Tree = new BST<>();



    
    // Step 2 - Insert the following values: 13, 22, 36, 5, 48, 17, 39, 2, 26, 40, 29, 34, 10

      lab5Tree.insert(13);
      lab5Tree.insert(22);
      lab5Tree.insert(36);
      lab5Tree.insert(5);
      lab5Tree.insert(48);
      lab5Tree.insert(17);
      lab5Tree.insert(39);
      lab5Tree.insert(2);
      lab5Tree.insert(26);
      lab5Tree.insert(40);
      lab5Tree.insert(29);
      lab5Tree.insert(34);
      lab5Tree.insert(10);


      
    // Step 3 - Delete the value 17

    System.out.println(lab5Tree.path(2));

    lab5Tree.delete(17);

    lab5Tree.path(2);
    
    // Step 4 - Traverse and output the values using inorder (sorted)

    System.out.print("Lab 5 in order: ");
    lab5Tree.inorder();

    // Step 5 - Traverse and output the values using postorder

    System.out.print("\nLab 5 in postorder: ");
    lab5Tree.postorder();

    // Step 6 - Traverse and output the values using preorder

    System.out.print("\nLab 5 in preorder: ");
    lab5Tree.preorder();

    // Step 7 - Display the result of a search for the value 36

    System.out.println("\n" + lab5Tree.search(36));

    

    // Step 8 - Display the result of a search for the value 37
  
    System.out.println(lab5Tree.search(37));
    

    // Step 9 - Using the path() method, display the path from the root to 2

    

    java.util.ArrayList<BST.TreeNode<Integer>> path = lab5Tree.path(2);

    for(int i =0; i < path.size(); i++)

    System.out.println(path.get(i).element + " ");
    
    

    // Step 10 - Display the path from the root to 34

    class Node {
    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

 class FindPath {

    public static List<Integer> findPath(Node root, int target) {
        List<Integer> path = new ArrayList<>();
        if (findPathUtil(root, target, path)) {
            return path;
        } else {
            return new ArrayList<>(); // Return an empty list if path not found
        }
    }

    private static boolean findPathUtil(Node node, int target, List<Integer> path) {
        if (node == null) {
            return false;
        }

        path.add(node.data);

        if (node.data == target) {
            return true;
        }

        if (findPathUtil(node.left, target, path) || findPathUtil(node.right, target, path)) {
            return true;
        }

        path.remove(path.size() - 1); // Backtrack if target not found in subtree
        return false;
    }
34
}

FindPath.findPath(lab5Tree.getRoot(), 34)
}
}