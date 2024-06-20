package dataStructure;
import java.lang.*;
import java.util.LinkedList;
import java.util.Queue;

public class Tree {

   private Node root;

   public void insert(String data) {
      if (this.root==null) this.root = new Node(data);
      else {
         Node newNode = new Node(data);
         Queue<Node> queue = new LinkedList<>();
         queue.add(this.root);
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
   public void insert(int value) {
      if (this.root==null) this.root = new Node(value);
      else {
         Node newNode = new Node(value);
         Queue<Node> queue = new LinkedList<>();
         queue.add(this.root);
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
      preOrder(this.root);
   }
   private void preOrder(final Node node) {
      // R-E-D
      if (node==null) return;
      if (node.getData()!=null) System.out.println(node.getData());
      if (node.getValue()!=null) System.out.println(node.getValue());
      preOrder(node.getLeft());
      preOrder(node.getRight());
   }

   public Node getRoot() {
      return this.root;
   }

   public void inOrder() {
      inOrder(this.root);
   }
   private void inOrder(final Node node) {
      // E-R-D
      if (node==null) return;
      inOrder(node.getLeft());
      if (node.getData()!=null) System.out.println(node.getData());
      if (node.getValue()!=null) System.out.println(node.getValue());
      inOrder(node.getRight());
   }

   public void postOrder() {
      postOrder(this.root);
   }
   private void postOrder(final Node node) {
      // E-D-R
      if (node==null) return;
      postOrder(node.getLeft());
      postOrder(node.getRight());
      if (node.getData()!=null) System.out.println(node.getData());
      if (node.getValue()!=null) System.out.println(node.getValue());
   }

   public void bfs() {
      if (this.root==null) return;
      Queue<Node> queue = new LinkedList<>();
      queue.add(this.root);
      while (!queue.isEmpty()) {
         Node node = queue.remove();
         if (node.getLeft()!=null) queue.add(node.getLeft());
         if (node.getRight()!=null) queue.add(node.getRight());
         System.out.println(node.getData());
      }
   }
}
