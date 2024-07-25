import java.util.Scanner;

public class Main {



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] words = new String[10];

        System.out.print("Digite o caractere que deseja remover: ");
        char ch = scanner.next().charAt(0);
        scanner.nextLine();

        System.out.println("Digite 10 palavras");
        for (int i = 0; i < 10; i++) {
            System.out.print("Digite palavra" + (i + 1) + ": ");
            String word = scanner.nextLine();
            word = word.toLowerCase();
            words[i] = word;
        }

        System.out.println("\nResultados:");
        for (int i = 0; i < 10; i++) {
            char[] charArray = words[i].toCharArray();
            int count = removeCharAndCount(charArray, ch);
            System.out.println((i + 1) + " - " + new String(charArray));
        }

        scanner.close();
    }

    public static int removeCharAndCount(char[] array, char ch) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == ch) {
                array[i] = '*';
                count++;
            }
        }
        return count;
    }

}
