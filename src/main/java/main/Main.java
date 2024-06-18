package main;
import dataStructure.*;
import java.lang.*;

public class Main {

   public static void main(String[] args) {

      System.out.println("LISTA LIGADA:");

      LinkedList lista = new LinkedList("elemento 1");
      lista.append("elemento 2");
      lista.append("elemento 3");
      System.out.println(lista.get(2).getData());
      System.out.println(lista.get(1).getData());
      System.out.println(lista.get(0).getData());
      lista.getHead();
      lista.getTail();
      lista.getLength();
      lista.print();
      System.out.println(lista.removeLast().getData());
      lista.print();
      lista.prepend("elemento 0");
      lista.print();
      lista.insert(1, "elemento 0.5");
      lista.print();
      lista.removeFirst();
      lista.print();
      lista.set(0, "elemento 0");
      lista.print();
      lista.delete(2);
      lista.print();
      lista.makeEmpty();
      lista.print();

      System.out.println("PILHA:");

      Stack pilha = new Stack("1");
      System.out.println("Pilha criada.");

      pilha.getTop();
      pilha.getHeight();
      pilha.print();
      pilha.push("2");
      pilha.push("3");
      pilha.print();
      pilha.getTop();
      pilha.getHeight();
      System.out.println("Removido: " + pilha.pop().getData());
      pilha.print();
      pilha.getTop();
      pilha.getHeight();
      System.out.println("Removido: " + pilha.pop().getData());
      System.out.println("Removido: " + pilha.pop().getData());
      System.out.println(pilha.pop()==null);
      
      int[] numeros = {5, 4, 3, 2, 1, 0, 3, 2, 1, 16, 2, 4, 8};
      String[] palavras = {"elemento 10", "elemento 25", "elemento 40", "elemento 55", "elemento 70", "elemento 85", "elemento 100"};
      Stack.inverterInt(numeros);
      Stack.inverterStr(palavras);

      System.out.println("FILA:");

      Queue fila = new Queue("Pessoa 1");
      fila.print();
      fila.getFirst();
      fila.getLast();
      fila.queue("Pessoa 2");
      fila.print();
      fila.getFirst();
      fila.getLast();
      fila.queue("Pessoa 3");
      fila.queue("Pessoa 4");
      fila.queue("Pessoa 5");
      fila.print();
      fila.getFirst();
      fila.getLast();
      fila.dequeue();
      fila.print();
      fila.getFirst();
      fila.getLast();
      fila.queue("Pessoa 6");
      fila.print();
      fila.getFirst();
      fila.getLast();
      fila.dequeue();
      fila.print();
      fila.getFirst();
      fila.getLast();
      fila.dequeue();
      fila.print();
      fila.getFirst();
      fila.getLast();
      fila.dequeue();
      fila.print();
      fila.getFirst();
      fila.getLast();
   }

}
