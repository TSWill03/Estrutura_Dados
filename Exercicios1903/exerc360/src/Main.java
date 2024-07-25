//Criar um algoritmo que imprima o horóscopo de várias pessoas, a partir de sua
//data de nascimento (ddmm). O fim é determinado quando se digita 9999 para
//        data; considere que a data foi digitada corretamente.
//Mês Último dia Signo
//01 20 Capricórnio
//02 19 Aquário
//03 20 Peixes
//04 20 Áries
//05 20 Touro
//06 20 Gêmeos
//07 21 Câncer
//08 22 Leão
//09 22 Virgem
//10 22 Libra
//11 21 Escorpião
//1 12 121 Sagitário

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int dia, mes;
        String signo;

        int opcao = 0;
        while (opcao != 9999) {
            System.out.println("Digite o dia e o mes do seu nascimento ex ddmm, para sair digite 9999: ");
            opcao = scan.nextInt();

            dia = opcao / 100;
            mes = opcao % 100;

            if (mes == 1 && dia <= 20) {
                signo = "Capricórnio";
            }
            else if (mes == 1 && dia > 20 || mes == 2 && dia <= 19) {
                signo = "Aquário";
            }

            else if (mes == 2 && dia > 19 || mes == 3 && dia <= 20) {
                signo = "Peixes";
            }

            else if (mes == 3 && dia > 20 || mes == 4 && dia <= 20) {
                signo = "Áries";
            }

            else if (mes == 4 && dia > 20 || mes == 5 && dia <= 20) {
                signo = "Touro";
            }

            else if (mes == 5 && dia > 20 || mes == 6 && dia <= 20) {
                signo = "Gêmeos";
            }

            else  if (mes == 6 && dia > 20 || mes == 7 && dia <= 21) {
                signo = "Câncer";
            }

            else if (mes == 7 && dia > 21 || mes == 8 && dia <= 22) {
                signo = "Leão";
            }

            else if (mes == 8 && dia > 22 || mes == 9 && dia <= 22) {
                signo = "Virgem";
            }

            else if (mes == 9 && dia > 22 || mes == 10 && dia <= 22) {
                signo = "Libra";
            }

            else if (mes == 10 && dia > 22 || mes == 11 && dia <= 21) {
                signo = "Escorpião";
            }

            else if (mes == 11 && dia > 21 || mes == 12 && dia <= 21) {
                signo = "Sagitário";
            }

            else {
                signo = "Capricórnio";
            }

            System.out.println("Seu signo é: " + signo);
        }

    }
}