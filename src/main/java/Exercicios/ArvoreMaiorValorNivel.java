package Exercicios;
import dataStructure.NodeInt;
import dataStructure.TreeInt;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class ArvoreMaiorValorNivel {

   public static List<Integer> maiorValorPorNivel(TreeInt tree) {
      List<Integer> maior = new ArrayList<>();
      if (tree.getRoot()==null) return null;
      NodeInt node = tree.getRoot();
      int level = 0;
      Queue<NodeInt> queueNode = new LinkedList<>();
      queueNode.add(node);
      while (!queueNode.isEmpty()){
         Queue<Integer> fila = new LinkedList<>();
         int counter = (int) Math.pow(2, (double) level);
         while (counter>0) {
            node = queueNode.remove();
            fila.add(node.value);
            if (node.left!=null) {
               queueNode.add(node.left);
            }
            if (node.right!=null) {
               queueNode.add(node.right);
            }
            counter--;
         }
         int maiorElemento=0;
         if (fila.size()==1) {
            maiorElemento = fila.remove();
         } else {
            while (!fila.isEmpty()){
               maiorElemento = Math.max(maiorElemento, fila.remove());
            }
         }
         maior.add(maiorElemento);
         level++;
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
      tree.insert(8);
      tree.insert(104);
      tree.insert(88);
      tree.insert(106);
      tree.insert(10);

      System.out.println("########################");
      System.out.println(maiorValorPorNivel(tree));
      System.out.println("########################");
   }

}
