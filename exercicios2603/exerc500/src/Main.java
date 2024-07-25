import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    static double[] vetorA = new double[5];
    static double[] vetorB = new double[5];
    static boolean vetorAPreenchido = false;
    static boolean vetorBPreenchido = false;

    public static void main(String[] args) {
        int opcao;

        do {
            exibirMenu();
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    vetorA = dadosVetor("VETOR A");
                    vetorAPreenchido = true;
                    break;
                case 2:
                    vetorB = dadosVetor("VETOR B");
                    vetorBPreenchido = true;
                    break;
                case 3:
                    if (vetorAPreenchido && vetorBPreenchido) {
                        imprimeVetores(vetorA, vetorB);
                    } else {
                        System.out.println("Escolha primeiro as opções 1 e 2");
                    }
                    break;
                case 4:
                    if (vetorAPreenchido && vetorBPreenchido) {
                        double[] soma = somaVetores(vetorA, vetorB);
                        imprimeVetor(soma, "SOMA");
                    } else {
                        System.out.println("Escolha primeiro as opções 1 e 2");
                    }
                    break;
                case 5:
                    if (vetorAPreenchido && vetorBPreenchido) {
                        double[] subtracao = subtraiVetores(vetorA, vetorB);
                        imprimeVetor(subtracao, "DIFERENÇA");
                    } else {
                        System.out.println("Escolha primeiro as opções 1 e 2");
                    }
                    break;
                case 6:
                    System.out.println("Saindo do programa");
                    break;
                default:
                    System.out.println("Opção inválida");
                    break;
            }
        } while (opcao != 6);
    }

    public static void exibirMenu() {
        System.out.println("VETORES");
        System.out.println("1. Dados do VETOR A");
        System.out.println("2. Dados do VETOR B");
        System.out.println("3. Imprime VETORES");
        System.out.println("4. Soma VETORES");
        System.out.println("5. Subtrai VETORES");
        System.out.println("6. Sai do programa");
        System.out.print("OPÇÃO: ");
    }

    public static double[] dadosVetor(String nome) {
        double[] vetor = new double[5];
        System.out.println("Entrada do " + nome);
        for (int i = 0; i < 5; i++) {
            System.out.print("Digite o numero " + (i + 1) + ": ");
            vetor[i] = scanner.nextDouble();
        }
        return vetor;
    }

    public static void imprimeVetores(double[] vetorA, double[] vetorB) {
        System.out.println("VETOR A:");
        imprimeVetor(vetorA, "");
        System.out.println("VETOR B:");
        imprimeVetor(vetorB, "");
    }

    public static void imprimeVetor(double[] vetor, String nome) {
        if (!nome.isEmpty()) {
            System.out.println(nome + ":");
        }
        for (double num : vetor) {
            System.out.println(num);
        }
    }

    public static double[] somaVetores(double[] vetorA, double[] vetorB) {
        double[] soma = new double[5];
        for (int i = 0; i < 5; i++) {
            soma[i] = vetorA[i] + vetorB[i];
        }
        return soma;
    }

    public static double[] subtraiVetores(double[] vetorA, double[] vetorB) {
        double[] subtracao = new double[5];
        for (int i = 0; i < 5; i++) {
            subtracao[i] = vetorA[i] - vetorB[i];
        }
        return subtracao;
    }
}
