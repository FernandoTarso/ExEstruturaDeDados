package dataStructure;

public class Queue {

   private Node first;
   private Node last;
   private int length;

   public Queue() {}

   public Queue(String data) {
      Node newNode = new Node(data);
      this.length = 1;
      this.first = newNode;
      this.last = newNode;
   }

   public void getFirst() {
      if (this.first == null) {
         System.out.println("Fila vazia.");
      } else {
         System.out.println("Primeiro: " + this.first.getData());
      }
   }

   public void getLast() {
      if (this.last == null) {
         System.out.println("Fila vazia.");
      } else {
         System.out.println("Último: " + this.last.getData());
      }
   }

   public void getLength() {
      System.out.println("Comprimento: " +  this.length);
   }

   public void queue(String data) {
      Node newNode = new Node(data);
      if (length==0) {
         this.first = newNode;
      } else {
         this.last.setNext(newNode);
      }
      this.last = newNode;
      this.length++;
   }

   public Node dequeue() {
      if (this.length==0) {
         return null;
      }
      Node temp = this.first;
      this.first = this.first.getNext();
      temp.setNext(null);
      this.length--;
      if (this.length==0) {
         this.first = null;
         this.last = null;
      }
      return temp;
   }

   public void printQueue() {
      System.out.println("######################");
      Node temp = this.first;
      while (temp!=null) {
         System.out.println(temp.getData());
         temp = temp.getNext();
      }
      System.out.println("######################");
   }
}
