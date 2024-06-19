package dataStructure;
import java.lang.*;
import java.util.LinkedList;
import java.util.Queue;

public class TreeInt {

   private Node root;

   public void insert(int value) {
      if (root==null) root = new Node(value);
      else {
         Node newNode = new Node(value);
         Queue<Node> queue = new LinkedList<>();
         queue.add(root);
         while (!queue.isEmpty()) {
            Node currentNode = queue.remove();
            if (currentNode.getLeft()==null) {
               currentNode.setLeft(newNode);
               break;
            } else {
               queue.add(currentNode.getLeft());
            }
            if (currentNode.getRight()==null) {
               currentNode.setRight(newNode);
               break;
            } else {
               queue.add(currentNode.getRight());
            }
         }
      }
   }

   public void preOrder() {
      preOrder(root);
   }
   private void preOrder(final Node node) {
      // R-E-D
      if (node==null) return;
      System.out.println(node.getValue());
      preOrder(node.getLeft());
      preOrder(node.getRight());
   }

   public Node getRoot() {
      return root;
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

   public void postOrder() {
      postOrder(root);
   }
   private void postOrder(final Node node) {
      // E-D-R
      if (node==null) return;
      postOrder(node.getLeft());
      postOrder(node.getRight());
      System.out.println(node.getValue());
   }

   public void bfs() {
      if (root==null) return;
      Queue<Node> queue = new LinkedList<>();
      queue.add(root);
      while (!queue.isEmpty()) {
         Node node = queue.remove();
         if (node.getLeft()!=null) queue.add(node.getLeft());
         if (node.getRight()!=null) queue.add(node.getRight());
         System.out.println(node.getValue());
      }
   }

   public static void main(String[] args) {
      TreeInt tree = new TreeInt();
      tree.insert(1);
      tree.insert(2);
      tree.insert(3);
      tree.insert(4);
      tree.insert(5);
      tree.insert(6);
      tree.insert(7);

//      System.out.println("########################");
//      tree.preOrder();
//      System.out.println("########################");

//      System.out.println("########################");
//      tree.inOrder();
//      System.out.println("########################");

//      System.out.println("########################");
//      tree.postOrder();
//      System.out.println("########################");
      System.out.println("########################");
      tree.bfs();
      System.out.println("########################");

//      System.out.println(tree.root.getValue());
//      System.out.println(tree.root.isLeaf());
//      System.out.println(tree.root.getLeft().getValue());
//      System.out.println(tree.root.getLeft().isLeaf());
//      System.out.println(tree.root.getRight().getValue());
//      System.out.println(tree.root.getRight().isLeaf());
   }


}
