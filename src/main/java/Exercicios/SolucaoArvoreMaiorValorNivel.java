package Exercicios;

import dataStructure.NodeInt;
import dataStructure.TreeInt;

import java.util.ArrayList;
import java.util.List;

public class SolucaoArvoreMaiorValorNivel {

   public static List<Integer> maioresValores(TreeInt tree) {
      var list = new ArrayList<Integer>();
      solveTree(tree.getRoot(), 0, list);
      return list;
   }

   private static void solveTree(NodeInt node,
                                 int level,
                                 ArrayList<Integer> list) {
      if (node == null) return;
      if (level == list.size()) {
         list.add(node.value);
      } else {
         list.set(level, Math.max(list.get(level), node.value));
      }

      solveTree(node.left, level+1, list);
      solveTree(node.right, level+1, list);
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

      System.out.println(maioresValores(tree));
   }
}
