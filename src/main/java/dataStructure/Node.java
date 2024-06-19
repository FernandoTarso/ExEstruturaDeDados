package dataStructure;

public class Node {

   int value;
   String data;
   Node next;
   Node left;
   Node right;

   public Node() {}

   public Node(String data) {
      this.data = data;
   }
   public Node(int value) {
      this.value = value;
   }


   public int getValue() {
      return value;
   }
   public void setValue(int value) {
      this.value = value;
   }

   public String getData() {
      return data;
   }

   public void setLeft(Node left) {
      this.left = left;
   }
   public Node getLeft() {
      return this.left;
   }

   public void setRight(Node right) {
      this.right = right;
   }
   public Node getRight() {
      return this.right;
   }

   public boolean isLeaf() {
      return this.left==null && this.right==null;
   }

}
