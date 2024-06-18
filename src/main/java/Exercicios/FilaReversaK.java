package Exercicios;

import java.util.*;

public class FilaReversaK {

   public static Queue<Integer> reverterK(Queue<Integer> queue, int k) {
      int qLength = queue.size();
      Stack<Integer> aux = new Stack<>();
      for (int i = 0; i < k; i++) {
         aux.push(queue.remove());
      }
      int auxSize = aux.size();
      for (int i = 0; i < auxSize; i++) {
         queue.add(aux.pop());
      }
      for (int i = k; i < qLength; i++) {
         int element = queue.remove();
         queue.add(element);
      }
      return queue;
   }

   public static void main(String[] args) {
      Queue<Integer> fila = new LinkedList<>();
      fila.add(1);
      fila.add(2);
      fila.add(3);
      fila.add(4);
      fila.add(5);
      System.out.println(reverterK(fila, 3));
   }
}
