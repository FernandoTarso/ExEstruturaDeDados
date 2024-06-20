package dataStructure;

public class BinarySearchTree {

   public Node root;

   public void insert(int value) {
      if (root==null)    {
         root = new Node(value);
      } else {
         insert(root, value);
      }
   }

   private void insert(final Node root, int value) {
      if (root==null) return;
      if (value==root.getValue()) return;
      if (value > root.getValue()) {
         if (root.getRight() == null) root.setRight(new Node(value));
         else insert(root.getRight(), value);
      } else {
         if (root.getLeft() == null) root.setLeft(new Node(value));
         else insert(root.getLeft(), value);
      }
   }

   public void inOrder() {
      inOrder(root);
   }
   private void inOrder(final Node node) {
      // E-R-D
      if (node==null) return;
      inOrder(node.getLeft());
      System.out.println(node.getValue());
      inOrder(node.getRight());
   }

   public boolean contains(int value) {
      return contains(root, value);
   }
   private boolean contains(final Node root, final int value) {
      if (root==null) return false;
      if (root.getValue()==value) return true;
      if (value > root.getValue()) return contains(root.getRight(), value);
      else return contains(root.getLeft(), value);
   }

   public int minValue(Node currentNode) {
      while (currentNode.getLeft() != null) {
         currentNode = currentNode.getLeft();
      }
      return currentNode.getValue();
   }

   public void deleteNode(int value) {
      root = deleteNode(root, value);
   }

   private Node deleteNode(final Node root, int value) {
      if (root==null) return null;
      if (value < root.getValue()) {
         root.setLeft(deleteNode(root.getLeft(), value));
      } else if (value > root.getValue()) {
         root.setRight(deleteNode(root.getRight(), value));
      } else {
         if (root.getLeft()==null && root.getRight()==null) return null;
         else if (root.getLeft()==null) return root.getRight();
         else if (root.getRight()==null) return root.getLeft();
         else {
            int minValue = minValue(root.getRight());
            root.setValue(minValue);
            root.setRight(deleteNode(root.getRight(), minValue));
         }
      }
      return root;
   }

   public static void main(String[] args) {

      BinarySearchTree bst = new BinarySearchTree();
      bst.insert(2);
      bst.insert(1);
      bst.insert(3);
      bst.insert(5);
      bst.insert(7);
      bst.insert(8);
      bst.insert(6);
      bst.insert(10);

      System.out.println("---1---");
      System.out.println(bst.contains(4));

      System.out.println("---2---");
      System.out.println(bst.contains(2));

      System.out.println("---3---");
      bst.inOrder();

      bst.deleteNode(6);

      System.out.println("---4---");
      bst.inOrder();
   }
}
