package Exercicios;
import dataStructure.Node;
import dataStructure.TreeInt;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class ArvoreMaiorValorNivel {

   public static List<Integer> maiorValorPorNivel(TreeInt tree) {
      List<Integer> maior = new ArrayList<>();
      if (tree.getRoot()==null) {
         System.out.println("Não há nós na árvore.");
         return null;
      }
      Node node = tree.getRoot();
      Queue<Node> queueNode = new LinkedList<>();
      queueNode.add(node);
      while (!queueNode.isEmpty()){
         Queue<Integer> fila = new LinkedList<>();
         int counter = queueNode.size();
         while (counter>0) {
            node = queueNode.remove();
            fila.add(node.getValue());
            if (node.getLeft()!=null) queueNode.add(node.getLeft());
            if (node.getRight()!=null) queueNode.add(node.getRight());
            counter--;
         }
         maior.add(fila.remove());
         while (!fila.isEmpty()){
            maior.set(maior.size()-1, Math.max(maior.getLast(), fila.remove()));
         }
      }
      return maior;
   }
   public static void main(String[] args) {

      TreeInt tree = new TreeInt();
      tree.insert(5);
      tree.insert(7);
      tree.insert(2);
      tree.insert(3);
      tree.insert(8);
      tree.insert(16);
      tree.insert(4);
      tree.insert(33);
      tree.insert(45);
      tree.insert(16);
      tree.insert(104);
      tree.insert(88);
      tree.insert(110);

      System.out.println("########################");
      System.out.println(maiorValorPorNivel(tree));
      System.out.println("########################");
   }

}
