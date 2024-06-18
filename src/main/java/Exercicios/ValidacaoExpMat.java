package Exercicios;
import java.util.Stack;

public class ValidacaoExpMat {

   static String exp;

   public static void main(String[] args) {
//      exp = "2*(3+4+5*[2+3)]";
//      exp = "2*(3+4+5*[2+3])";
      exp = "[2*(3+4+5*[2+3]/(2+(3+(7+5)*9)*6)*[5+8]+17)+2]";
//      exp = "";
      Stack<Character> pilha = new Stack<>();

      if (!exp.isEmpty()){
         for (char letter: exp.toCharArray()) {
            if (letter=='(' || letter=='[' || letter=='{') {
               pilha.add(letter);
            }
            switch (letter) {
               case ')':
                  if (pilha.getLast()=='(') { pilha.removeLast(); break; }
                  else pilha.add(letter); break;
               case ']':
                  if (pilha.getLast()=='[') { pilha.removeLast(); break; }
                  else pilha.add(letter); break;
               case '}':
                  if (pilha.getLast()=='{') { pilha.removeLast(); break; }
                  else pilha.add(letter); break;
               default: break;
            }
         }
         if (pilha.isEmpty()) System.out.println("O balanceamento de '()', " +
                 "'[]' e '{}'\nda expressão está correto.");
         else System.out.println("O balanceamento de '()', '[]' e '{}'\nda " +
                 "expressão NÃO está correto.");
      } else {
         System.out.println("A expressão está vazia.");
      }
   }
}
