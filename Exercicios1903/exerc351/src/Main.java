//Criar um algoritmo que armazene cinco nomes em um vetor e depois possa ser digitado um número
//que corresponde a uma pessoa e imprimir esse nome.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
String[] nomes = new String[5];
        nomes[0] = "João";
        nomes[1] = "Maria";
        nomes[2] = "José";
        nomes[3] = "Ana";
        nomes[4] = "Pedro";

        int opcao = 0;

        while (true) {

            Scanner scan = new Scanner(System.in);

            System.out.println("Digite o numero da pessoa: ");

            opcao = scan.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Nome 1: " + nomes[0]);
                    break;
                case 2:
                    System.out.println("Nome 2: " + nomes[1]);
                    break;
                case 3:
                    System.out.println("Nome 3: " + nomes[2]);
                    break;
                case 4:
                    System.out.println("Nome 4: " + nomes[3]);
                    break;
                case 5:
                    System.out.println("Nome 5: " + nomes[4]);
                    break;

                default:
                    System.out.println("Opção inválida.");
                    break;
            }
        }
    }
}