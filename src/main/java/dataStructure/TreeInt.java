package dataStructure;
import java.lang.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
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
            if (currentNode.left==null) {
               currentNode.left = newNode;
               break;
            } else {
               queue.add(currentNode.left);
            }
            if (currentNode.right==null) {
               currentNode.right = newNode;
               break;
            } else {
               queue.add(currentNode.right);
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
      System.out.println(node.value);
      preOrder(node.left);
      preOrder(node.right);
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
      inOrder(node.left);
      System.out.println(node.value);
      inOrder(node.right);
   }

   public void postOrder() {
      postOrder(root);
   }
   private void postOrder(final Node node) {
      // E-D-R
      if (node==null) return;
      postOrder(node.left);
      postOrder(node.right);
      System.out.println(node.value);
   }

   public void bfs() {
      if (root==null) return;
      Queue<Node> queue = new LinkedList<>();
      queue.add(root);
      while (!queue.isEmpty()) {
         Node node = queue.remove();
         if (node.left!=null) queue.add(node.left);
         if (node.right!=null) queue.add(node.right);
         System.out.println(node.value);
      }
   }
//   public List<Integer> maiorValorPorNivel() {
//      List<Integer> maior = new ArrayList<>();
//      if (root==null) return null;
//      Node node = root;
//      int level = 0;
//      Queue<Node> queueNode = new LinkedList<>();
//      queueNode.add(node);
//      while (!queueNode.isEmpty()){
//         Queue<Integer> fila = new LinkedList<>();
//         int counter = (int) Math.pow(2, (double) level);
//         while (counter>0) {
//            node = queueNode.remove();
//            fila.add(node.value);
//            if (node.left!=null) {
//               queueNode.add(node.left);
//            }
//            if (node.right!=null) {
//               queueNode.add(node.right);
//            }
//            counter--;
//         }
//         int maiorElemento=0;
//         if (fila.size()==1) {
//            maiorElemento = fila.remove();
//         } else {
//            while (!fila.isEmpty()){
//               maiorElemento = Math.max(maiorElemento, fila.remove());
//            }
//         }
//         maior.add(maiorElemento);
//         level++;
//      }
//      return maior;
//   }

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

//      System.out.println(tree.root.value);
//      System.out.println(tree.root.isLeaf());
//      System.out.println(tree.root.left.value);
//      System.out.println(tree.root.left.isLeaf());
//      System.out.println(tree.root.right.value);
//      System.out.println(tree.root.right.isLeaf());
   }


}
