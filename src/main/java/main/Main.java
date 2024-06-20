package main;
import dataStructure.*;
import java.lang.*;

public class Main {

   public static void main(String[] args) {

      System.out.println("LISTA LIGADA:");

      LinkedList lista = new LinkedList("elemento 1");
      lista.append("elemento 2");
      lista.append("elemento 3");

      System.out.println("---1---");
      System.out.println(lista.get(2).getData());

      System.out.println("---2---");
      System.out.println(lista.get(1).getData());

      System.out.println("---3---");
      System.out.println(lista.get(0).getData());

      System.out.println("---4---");
      lista.getHead();

      System.out.println("---5---");
      lista.getTail();

      System.out.println("---6---");
      lista.getLength();

      System.out.println("---7---");
      lista.printList();

      System.out.println("---8---");
      System.out.println(lista.removeLast().getData());

      System.out.println("---9---");
      lista.printList();
      lista.prepend("elemento 0");

      System.out.println("---10---");
      lista.printList();
      lista.insert(1, "elemento 0.5");

      System.out.println("---11---");
      lista.printList();
      lista.removeFirst();

      System.out.println("---12---");
      lista.printList();

      System.out.println("---13---");
      System.out.println("Alterando valor do índice '0' para '0':");
      lista.set(0, "elemento 0");

      System.out.println("---14---");
      lista.printList();

      System.out.println("---15---");
      System.out.println("Delete index 2:");
      lista.delete(2);
      lista.append("elemento 4");

      System.out.println("---16---");
      lista.printList();

      System.out.println("Make empty:");
      lista.makeEmpty();

      System.out.println("---17---");
      lista.printList();

      System.out.println("PILHA:");

      Stack pilha = new Stack("1");
      System.out.println("Pilha criada.");

      System.out.println("---18---");
      pilha.getTop();

      System.out.println("---19---");
      pilha.getHeight();

      System.out.println("---20---");
      pilha.printStack();
      pilha.push("2");
      pilha.push("3");

      System.out.println("---21---");
      pilha.printStack();

      System.out.println("---22---");
      pilha.getTop();

      System.out.println("---23---");
      pilha.getHeight();
      System.out.println("Removido: " + pilha.pop().getData());

      System.out.println("---24---");
      pilha.printStack();

      System.out.println("---25---");
      pilha.getTop();

      System.out.println("---26---");
      pilha.getHeight();
      System.out.println("Removido: " + pilha.pop().getData());
      System.out.println("Removido: " + pilha.pop().getData());

      System.out.println("---27---");
      System.out.println(pilha.pop()==null);
      
      int[] numeros = {5, 4, 3, 2, 1, 0, 3, 2, 1, 16, 2, 4, 8};
      String[] palavras = {"elemento 10", "elemento 25", "elemento 40", "elemento 55", "elemento 70", "elemento 85", "elemento 100"};
      Stack.inverterInt(numeros);
      Stack.inverterStr(palavras);

      System.out.println("FILA:");

      Queue fila = new Queue("Pessoa 1");

      System.out.println("---28---");
      fila.printQueue();

      System.out.println("---29---");
      fila.getFirst();

      System.out.println("---30---");
      fila.getLast();
      fila.queue("Pessoa 2");

      System.out.println("---31---");
      fila.printQueue();

      System.out.println("---32---");
      fila.getFirst();

      System.out.println("---33---");
      fila.getLast();
      fila.queue("Pessoa 3");
      fila.queue("Pessoa 4");
      fila.queue("Pessoa 5");

      System.out.println("---34---");
      fila.printQueue();

      System.out.println("---35---");
      fila.getFirst();

      System.out.println("---36---");
      fila.getLast();
      fila.dequeue();

      System.out.println("---37---");
      fila.printQueue();

      System.out.println("---38---");
      fila.getFirst();

      System.out.println("---39---");
      fila.getLast();
      fila.queue("Pessoa 6");

      System.out.println("---40---");
      fila.printQueue();

      System.out.println("---41---");
      fila.getFirst();

      System.out.println("---42---");
      fila.getLast();
      fila.dequeue();

      System.out.println("---43---");
      fila.printQueue();

      System.out.println("---44---");
      fila.getFirst();

      System.out.println("---45---");
      fila.getLast();
      fila.dequeue();

      System.out.println("---46---");
      fila.printQueue();

      System.out.println("---47---");
      fila.getFirst();

      System.out.println("---48---");
      fila.getLast();
      fila.dequeue();

      System.out.println("---49---");
      fila.printQueue();

      System.out.println("---50---");
      fila.getFirst();

      System.out.println("---51---");
      fila.getLast();

      System.out.println("ÁRVORE:");
      Tree tree = new Tree();
      tree.insert("A");
      tree.insert("B");
      tree.insert("C");
      tree.insert("D");
      tree.insert("E");
      tree.insert("F");
      tree.insert("G");

      System.out.println("######PRE-ORDER#########");
      tree.preOrder();
      System.out.println("########################");

      System.out.println("#######IN-ORDER#########");
      tree.inOrder();
      System.out.println("########################");

      System.out.println("######POST-ORDER########");
      tree.postOrder();
      System.out.println("########################");

      System.out.println("##########BFS###########");
      tree.bfs();
      System.out.println("########################");

      System.out.println("---52---");
      System.out.println(tree.getRoot().getData());
      System.out.println("---53---");
      System.out.println(tree.getRoot().isLeaf());
      System.out.println("---54---");
      System.out.println(tree.getRoot().getLeft().getData());
      System.out.println("---55---");
      System.out.println(tree.getRoot().getLeft().isLeaf());
      System.out.println("---56---");
      System.out.println(tree.getRoot().getRight().getData());
      System.out.println("---57---");
      System.out.println(tree.getRoot().getRight().isLeaf());

      System.out.println("ÁRVORE BINÁRIA DE BUSCA:");

      BinarySearchTree bst = new BinarySearchTree();
      bst.insert(2);
      bst.insert(1);
      bst.insert(3);
      bst.insert(5);
      bst.insert(7);
      bst.insert(8);
      bst.insert(6);
      bst.insert(10);

      System.out.println("---58---");
      System.out.println(bst.contains(4));

      System.out.println("---59---");
      System.out.println(bst.contains(2));

      System.out.println("---60---");
      bst.inOrder();

      bst.deleteNode(6);

      System.out.println("---61---");
      bst.inOrder();
   }

}
