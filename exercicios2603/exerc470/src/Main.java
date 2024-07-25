import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int number = 0;

        Scanner scan = new Scanner(System.in);

        while (number != -1) {
            System.out.println("Digite um número, -1 para sair: ");
            number = scan.nextInt();
            if (number == -1) {
                break;
            }
            if (isprimo(number)) {
                System.out.println("O número " + number + " é primo");
            } else {
                System.out.println("O número " + number + " não é primo");
            }
        }

    }

    public static boolean isprimo(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}