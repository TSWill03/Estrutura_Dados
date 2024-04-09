import java.util.Stack;

public class Inverte_String_Meu {

    public String inversor_String(String input) {
        // cria os objetos palavras e pilha
        StringBuilder palavras = new StringBuilder();
        // palavras armazenará as palavras invertidas
        Stack<Character> pilha = new Stack<>();
        // pilha armazenará as letras de cada palavra

        // percorre a string de entrada
        for (int i = 0; i < input.length(); i++) {
            // pega o caractere atual
            char c = input.charAt(i);
            // se o caractere for um espaço ou for o último caractere da string
            if (c == ' ' || i == input.length() - 1) {
                // enquanto a pilha não estiver vazia
                while (!pilha.isEmpty()) {
                    // adiciona a letra no final da palavra
                    palavras.append(pilha.pop());
                }
                // se o caractere for um espaço
                if (c == ' ') {
                    // adiciona um espaço no final da palavra
                    palavras.append(" ");
                }
            // se o caractere não for um espaço
            } else {
                // adiciona o caractere na pilha
                pilha.push(c);
            }
        }
        return palavras.toString();
    }
}
