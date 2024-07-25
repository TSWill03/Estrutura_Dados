import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int count = 0;
        float num = 0;

        while (count < 3){
            System.out.println("Digite um número: ");
            num = scan.nextFloat();
            System.out.println("dobro: " + dobro(num));
            count++;
        }
    }

    public static float dobro(float num){
        return num * 2;
    }
}