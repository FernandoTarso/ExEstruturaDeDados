package dataStructure;

public class Node {

   private int value;
   private String data;
   private Node next;
   private Node left;
   private Node right;

//   public Node() {}

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
   public void setData(String data) {
      this.data = data;
   }

   public Node getLeft() {
      return this.left;
   }
   public void setLeft(Node left) {
      this.left = left;
   }

   public Node getRight() {
      return this.right;
   }
   public void setRight(Node right) {
      this.right = right;
   }

   public Node getNext() {
      return next;
   }
   public void setNext(Node next) {
      this.next = next;
   }

   public boolean isLeaf() {
      return this.left==null && this.right==null;
   }
}
