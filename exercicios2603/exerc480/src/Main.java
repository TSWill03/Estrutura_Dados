//Um número é capicua quando lido da esquerda para a direita ou da direita para a
//esquerda. O ano 2002 é um ano capicua. Elabore uma função que verifique essa
//característica

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int number = -1;
        Scanner scan = new Scanner(System.in);

        while (number != 0) {
            System.out.println("Digite um número para verificar se é capicua, 0 para sair: ");
            number = scan.nextInt();
            if (number == 0) {
                break;
            }
            if (isCapicua(number)) {
                System.out.println("O número " + number + " é capicua");
            }
            else {
                System.out.println("O número " + number + " não é capicua");
            }
        }
        
    }

    public static boolean isCapicua(int number) {
        String numberString = Integer.toString(number);
        String reverseNumberString = new StringBuilder(numberString).reverse().toString();
        return numberString.equals(reverseNumberString);
    }
}