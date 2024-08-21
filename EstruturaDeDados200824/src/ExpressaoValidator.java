import java.util.Objects;
import java.util.Scanner;
import java.util.Stack;

public class ExpressaoValidator {

    // Método para verificar se dois caracteres são correspondentes
    private static boolean isMatchingPair(char open, char close) {
        return (open == '(' && close == ')') ||
                (open == '{' && close == '}') ||
                (open == '[' && close == ']');
    }

    // Método para validar a expressão
    public static boolean isValidExpression(String expression) {
        Stack<Character> stack = new Stack<>();

        for (char ch : expression.toCharArray()) {
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch); // Adiciona os caracteres de abertura à pilha
            } else if (ch == ')' || ch == '}' || ch == ']') {
                if (stack.isEmpty() || !isMatchingPair(stack.pop(), ch)) {
                    return false; // Verifica se a pilha está vazia ou se os pares não correspondem
                }
            }
        }

        return stack.isEmpty(); // A expressão é válida se a pilha estiver vazia no final
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String expression = null;

        while(!Objects.equals(expression, "sair")) {

            System.out.println("Para sair digite sair\nDigite uma expressão aritmética:");
            expression = scanner.nextLine();

            if (isValidExpression(expression)) {
                System.out.println("A expressão está corretamente parametrizada.");
            } else {
                System.out.println("A expressão está incorretamente parametrizada.");
            }
        }

        scanner.close();
    }
}
