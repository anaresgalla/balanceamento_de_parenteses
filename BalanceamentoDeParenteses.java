/*
Dada uma string de expressão exp, escreva um programa para examinar se
os pares e as ordens de {}, [], () estão corretos na expressão.

SOLUÇÃO:
Uso de pilhas(stacks):
1 - Empilhar caracteres de abertura
2 - Ao identificar um caractere de fechamento:
    - desempilhar e verificar se coincide com a abertura
    --> o caractere aberto por último deve ser o 1o a ser fechado.
3 - No final, a pilha deve estar vazia para que a expressão seja validada.
 */

import java.util.Set;
import java.util.Stack;

public class BalanceamentoDeParenteses {

    public static boolean solve(String expression){
        Set<Character> openSymbols = Set.of('(', '[', '{');
        Set<Character> closeSymbols = Set.of(')', ']', '}');
        Stack<Character> stack = new Stack<>();

        for(char c: expression.toCharArray()) {
            if (openSymbols.contains(c)) stack.push(c);
            if (closeSymbols.contains(c)) {
                if (stack.isEmpty()) return false;
                var open = stack.pop();
                if (open == '(' && c != ')') return false;
                if (open == '[' && c != ']') return false;
                if (open == '{' && c != '}') return false;
            }
        }
        return stack.isEmpty();
    }


    // para teste:

    public static void main(String[] args) {
        System.out.println(solve("2*(3+4+5*[2+3)]"));
        System.out.println(solve("[2*(3+4+5*[2+3]/(2+(3+(7+5)*9)*6)*[5+8]*17)+2]"));
    }
}
