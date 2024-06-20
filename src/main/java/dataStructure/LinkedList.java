package dataStructure;

public class LinkedList {

   private Node head;
   private Node tail;
   private int length;

   public LinkedList() {}

   public LinkedList(String data) {
      Node newNode = new Node(data);
      this.head = newNode;
      this.tail = newNode;
      this.length = 1;
   }

   public void getHead() {
      if (this.head == null) {
         System.out.println("Lista vazia.");
      } else {
         System.out.println("Head: " + this.head.getData());
      }
   }

   public void getTail() {
      if (this.tail == null) {
         System.out.println("Lista vazia.");
      } else {
         System.out.println("Tail: " + this.tail.getData());
      }
   }

   public void getLength() {
      System.out.println("Comprimento: " +  this.length);
   }

   public void makeEmpty() {
      this.head = null;
      this.tail = null;
      this.length = 0;
   }

   public void printList() {
      System.out.println("######################");
      Node temp = this.head;
      while (temp!=null) {
         System.out.println(temp.getData());
         temp = temp.getNext();
      }
      System.out.println("######################");
   }

   public void append(String data) {
      Node newNode = new Node(data);
      if (this.length==0) {
         this.head = newNode;
      } else {
         this.tail.setNext(newNode);
      }
      this.tail = newNode;
      this.length++;
   }

   public Node removeLast () {
      if (this.length==0) {
         return null;
      }
      Node pre = this.head;
      Node temp = this.tail;
      while (pre.getNext()!=this.tail) {
         pre = pre.getNext();
      }
      this.tail = pre;
      this.tail.setNext(null);
      this.length--;
      if (this.length==0) {
         this.head = null;
         this.tail = null;
      }
      return temp;
   }

   public void prepend(String data) {
      Node newNode = new Node(data);
      if (this.length==0) {
         this.tail = newNode;
      } else {
         newNode.setNext(this.head);
      }
      this.head = newNode;
      this.length++;
   }

   public Node removeFirst() {
      if (this.length==0) {
         return null;
      }
      Node temp = this.head;
      this.head = this.head.getNext();
      temp.setNext(null);
      this.length--;
      if (this.length==0) {
         this.head = null;
         this.tail = null;
      }
      return temp;
   }

   public Node get(int index) {
      if (index<0 || index>=this.length) {
         return null;
      }
      Node temp = this.head;
      for (int i = 0; i <index; i++) {
         temp = temp.getNext();
      }
      return temp;
   }

   public boolean insert(int index, String data) {
      if (index<0 || index>this.length) return false;
      if (index==0) {
         prepend(data);
         return true;
      }
      if (index==this.length) {
         append(data);
         return true;
      }

      Node newNode = new Node(data);
      Node temp = get(index-1);
      newNode.setNext(temp.getNext());
      temp.setNext(newNode);
      this.length++;
      return true;
   }

   public boolean set(int index, String data) {
      Node temp = get(index);
      if (temp != null) {
         temp.setData(data);
         return true;
      }
      return false;
   }

   public Node delete(int index) {
      if (index<0 || index>=this.length) return null;
      if (index==0) return removeFirst();
      if (index==this.length-1) return removeLast();

      Node prev = get(index-1);
      Node temp = prev.getNext();
      prev.setNext(temp.getNext());
      temp.setNext(null);
      this.length--;
      return temp;
   }
}
