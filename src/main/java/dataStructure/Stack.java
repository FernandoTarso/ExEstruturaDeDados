package dataStructure;

public class Stack {

   private Node top;
   private int height;

   public Stack() {}

   public Stack(String data) {
      Node newNode = new Node(data);
      this.height = 1;
      this.top = newNode;
   }

   public void getTop() {
      if (this.top==null) {
         System.out.println("Pilha vazia.");
      }
      System.out.println("Topo: " + this.top.getData());
   }

   public void getHeight() {
      System.out.println("Altura: " + this.height);
   }

   public void printStack() {
      System.out.println("######################");
      Node temp = this.top;
      while (temp!=null) {
         System.out.println(temp.getData());
         temp = temp.getNext();
      }
      System.out.println("######################");
   }

   public void push(String data) {
      if (height==0) {
         Stack pilha = new Stack(data);
      }
      Node newNode = new Node(data);
      newNode.setNext(this.top);
      this.top = newNode;
      height++;
   }

   public Node pop() {
      if (height==0) return null;
      Node temp = this.top;
      this.top = temp.getNext();
      temp.setNext(null);
      height--;
      return temp;
   }

   public static void inverterInt(int[] vetor) {

      int[] invertido = new int[vetor.length];
      Stack newStack = new Stack();

      for (int valor: vetor) {
         System.out.println(valor);
         newStack.push(Integer.toString(valor));
      }
      for (int i = 0; i < invertido.length; i++) {
         invertido[i] = Integer.parseInt(newStack.pop().getData());
      }
      System.out.println("####################");
      for (int valor: invertido) {
         System.out.println(valor);
      }
   }

   public static void inverterStr(String[] vetor) {

      String[] invertido = new String[vetor.length];
      Stack newStack = new Stack();

      for (String data: vetor) {
         System.out.println(data);
         newStack.push(data);
      }
      for (int i = 0; i < invertido.length; i++) {
         invertido[i] = newStack.pop().getData();
         System.out.println(invertido[i]);
      }
   }
}
