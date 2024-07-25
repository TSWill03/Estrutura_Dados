import java.util.*;

public class Calculadora {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe a notação da expressão (infixa, pos-fixa ou pre-fixa):");
        String notacao = scanner.nextLine().trim().toLowerCase();

        System.out.println("Informe a expressão:");
        String expressao = scanner.nextLine().trim();

        String infixa, posFixa, preFixa;
        switch (notacao) {
            case "infixa":
                posFixa = infixaParaPosFixa(expressao);
                preFixa = infixaParaPreFixa(expressao);
                infixa = expressao;
                break;
            case "pos-fixa":
                infixa = posFixaParaInfixa(expressao);
                preFixa = infixaParaPreFixa(infixa);
                posFixa = expressao;
                break;
            case "pre-fixa":
                infixa = preFixaParaInfixa(expressao);
                posFixa = infixaParaPosFixa(infixa);
                preFixa = expressao;
                break;
            default:
                throw new IllegalArgumentException("Notação desconhecida: " + notacao);
        }

        System.out.println("Expressão infixa: " + infixa);
        System.out.println("Expressão pos-fixa: " + posFixa);
        System.out.println("Expressão pre-fixa: " + preFixa);

        System.out.println("Resultado: ");
        System.out.println("Informe os valores das variáveis (ex: a=1, b=2, ...):");
        String valores = scanner.nextLine().trim();
        Map<Character, Double> variaveis = obterValoresVariaveis(valores);

        double resultado = avaliarPosFixa(posFixa, variaveis);
        System.out.println("Resultado: " + resultado);
    }

    private static double avaliarPosFixa(String expressao, Map<Character, Double> variaveis) {
        Stack<Double> stack = new Stack<>();
        String[] tokens = expressao.split(" ");

        for (String token : tokens) {
            if (isOperador(token)) {
                double b = stack.pop();
                double a = stack.pop();
                switch (token) {
                    case "+": stack.push(a + b); break;
                    case "-": stack.push(a - b); break;
                    case "*": stack.push(a * b); break;
                    case "/": stack.push(a / b); break;
                    case "^": stack.push(Math.pow(a, b)); break;
                }
            } else {
                stack.push(variaveis.get(token.charAt(0)));
            }
        }
        return stack.pop();
    }

    private static boolean isOperador(String token) {
        return token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/") || token.equals("^");
    }

    private static String infixaParaPosFixa(String expressao) {
        StringBuilder posFixa = new StringBuilder();
        Stack<Character> stack = new Stack<>();
        for (char ch : expressao.toCharArray()) {
            if (Character.isLetterOrDigit(ch)) {
                posFixa.append(ch).append(' ');
            } else if (ch == '(') {
                stack.push(ch);
            } else if (ch == ')') {
                while (!stack.isEmpty() && stack.peek() != '(') {
                    posFixa.append(stack.pop()).append(' ');
                }
                stack.pop();
            } else if (isOperador(String.valueOf(ch))) {
                while (!stack.isEmpty() && precedencia(stack.peek()) >= precedencia(ch)) {
                    posFixa.append(stack.pop()).append(' ');
                }
                stack.push(ch);
            }
        }
        while (!stack.isEmpty()) {
            posFixa.append(stack.pop()).append(' ');
        }
        return posFixa.toString().trim();
    }

    private static String infixaParaPreFixa(String expressao) {
        StringBuilder preFixa = new StringBuilder();
        Stack<Character> operadores = new Stack<>();
        Stack<String> operandos = new Stack<>();
        for (char ch : expressao.toCharArray()) {
            if (Character.isLetterOrDigit(ch)) {
                operandos.push(String.valueOf(ch));
            } else if (ch == '(') {
                operadores.push(ch);
            } else if (ch == ')') {
                while (!operadores.isEmpty() && operadores.peek() != '(') {
                    String op1 = operandos.pop();
                    String op2 = operandos.pop();
                    char op = operadores.pop();
                    operandos.push(op + op2 + op1);
                }
                operadores.pop();
            } else if (isOperador(String.valueOf(ch))) {
                while (!operadores.isEmpty() && precedencia(operadores.peek()) >= precedencia(ch)) {
                    String op1 = operandos.pop();
                    String op2 = operandos.pop();
                    char op = operadores.pop();
                    operandos.push(op + op2 + op1);
                }
                operadores.push(ch);
            }
        }
        while (!operadores.isEmpty()) {
            String op1 = operandos.pop();
            String op2 = operandos.pop();
            char op = operadores.pop();
            operandos.push(op + op2 + op1);
        }
        while (!operandos.isEmpty()) {
            preFixa.insert(0, operandos.pop());
        }
        return preFixa.toString();
    }

    private static String posFixaParaInfixa(String expressao) {
        Stack<String> stack = new Stack<>();
        String[] tokens = expressao.split(" ");
        for (String token : tokens) {
            if (!isOperador(token)) {
                stack.push(token);
            } else {
                String b = stack.pop();
                String a = stack.pop();
                stack.push("(" + a + " " + token + " " + b + ")");
            }
        }
        return stack.pop();
    }

    private static String preFixaParaInfixa(String expressao) {
        Stack<String> stack = new Stack<>();
        String[] tokens = new StringBuilder(expressao).reverse().toString().split(" ");
        for (String token : tokens) {
            if (!isOperador(token)) {
                stack.push(token);
            } else {
                String a = stack.pop();
                String b = stack.pop();
                stack.push("(" + a + " " + token + " " + b + ")");
            }
        }
        return stack.pop();
    }

    private static int precedencia(char operador) {
        switch (operador) {
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
            case '^':
                return 3;
        }
        return -1;
    }

    private static Map<Character, Double> obterValoresVariaveis(String valores) {
        Map<Character, Double> variaveis = new HashMap<>();
        String[] tokens = valores.split(",");
        for (String token : tokens) {
            String[] partes = token.split("=");
            variaveis.put(partes[0].trim().charAt(0), Double.parseDouble(partes[1].trim()));
        }
        return variaveis;
    }
}
