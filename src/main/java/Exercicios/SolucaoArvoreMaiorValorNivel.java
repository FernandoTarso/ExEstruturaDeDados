package Exercicios;

import dataStructure.Node;
import dataStructure.Tree;
import java.util.ArrayList;
import java.util.List;

public class SolucaoArvoreMaiorValorNivel {

   public static List<Integer> maioresValores(Tree tree) {
      var list = new ArrayList<Integer>();
      solveTree(tree.getRoot(), 0, list);
      return list;
   }

   private static void solveTree(Node node,
                                 int level,
                                 ArrayList<Integer> list) {
      if (node == null) return;
      if (level == list.size()) {
         list.add(node.getValue());
      } else {
         list.set(level, Math.max(list.get(level), node.getValue()));
      }

      solveTree(node.getLeft(), level+1, list);
      solveTree(node.getRight(), level+1, list);
   }

   public static void main(String[] args) {
      Tree tree = new Tree();
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
