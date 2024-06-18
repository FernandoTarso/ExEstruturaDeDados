package Exercicios;
import java.util.*;

public class SolucaoFilaReversaK {

   public static Queue<Integer> reverterK(Queue<Integer> queue, int k) {
      solveQueue(queue, k);
      int n = queue.size()-k;
      while (n-- > 0) {
         int element = queue.remove();
         queue.add(element);
      }
      return queue;
   }

   private static void  solveQueue(final Queue<Integer> queue, int k) {
      if (k==0) return;
      int element = queue.remove();
      solveQueue(queue, k-1);
      queue.add(element);
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
