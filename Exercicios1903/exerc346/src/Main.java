import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String frase = "Frase completamente aleatoria";
        int opcao = 0;

        while (opcao != 4){

            Scanner scan = new Scanner(System.in);

            System.out.println("Menu:\n1 - imprimir comprimento da frase\n2 - imprimir os dois primeiros caracteres e os dois ultimos\n3 - imprimir a frase invertida\n4 - sair");
            
            opcao = scan.nextInt();
            
            switch (opcao) {
                case 1:
                    System.out.println("O comprimento da frase é: " + frase.length());
                    break;
                case 2:
                    System.out.println("Os dois primeiros caracteres são: " + frase.substring(0, 2) + "\nOs dois ultimos caracteres são: " + frase.substring(frase.length() - 2, frase.length()));
                    break;
                case 3:
                    StringBuilder fraseInvertida = new StringBuilder();
                    for (int i = frase.length() - 1; i >= 0; i--) {
                        fraseInvertida.append(frase.charAt(i));
                    }
                    System.out.println("A frase invertida é: " + fraseInvertida);
                    break;
                case 4:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida.");
                    break;
            }
        }
    }
}