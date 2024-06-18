package Exercicios;

import java.util.Set;
import java.util.Stack;

public class SoluçãoValidacaoExpMat {

   public static boolean solve(String expression) {
      Set<Character> openSymbols= Set.of('(','[','{');
      Set<Character> closeSymbols= Set.of(')',']','}');
      Stack<Character> pilha = new Stack<>();

      for (char c: expression.toCharArray()) {
         if (openSymbols.contains(c)) pilha.push(c);
         if (closeSymbols.contains(c)) {
            if (pilha.isEmpty()) return false;
            var open = pilha.pop();
            if (open == '(' && c != ')') return false;
            if (open == '[' && c != ']') return false;
            if (open == '{' && c != '}') return false;

         }
      }
      return pilha.isEmpty();
   }

   public static void main(String[] args) {
      System.out.println(solve("2*(3+4+5*[2+3)]"));
      System.out.println(solve("2*(3+4+5*[2+3])"));
      System.out.println(solve("[2*(3+4+5*[2+3]/(2+(3+(7+5)*9)*6)*[5+8]+17)+2]"));
   }
}
