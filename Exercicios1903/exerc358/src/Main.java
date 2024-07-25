//Criar um algoritmo que leia o preço de compra e o preço de venda de 100 mercadorias O algoritmo devera imprimir quantas mercadorias proporcionam
//m lucro < 10 %
//        10 % <= lucro <= 20 %
//m lucro > 20 %
//prog vetor6
//real precocompra[100] ,precovenda[100] ,lucro;
//        int totlucromenor10,totlucromenor20,totlucromaior20, A;
//totiucromenorlø <- 0;
//totlucromenor20 <- 0;
//totlucromaior20 <- 0;
//para(A <- 0; A <>100; A++)
//        { imprima \nPreco de compra: ; leia precoconipra [A];
//imprima "\nPreco de venda: "; leia precovenda [A];
//        }
//para(A<-0;A < 100;A++)
//        {
//lucro <- precovenda[A] - precocompra[A]
//se(l ucro<10.0)
//{totl ucromenorlø+i-; }
//senao
//{ se(lucro <= 20.0)
//    { totlucronienor20++; }
//    senao
//    { totlucromaior20++; }
//}
//}
//imprima "\ntotal de mercadorias com lucro < 10%: ",totlucromenor10;
//imprima "\ntotal de mercadorias com 10% <= lucro
//        11 ,totlucromenor20;
//imprima "\ntotal de mercadorias com lucro > 20%: ",totlucromaior20; 281
//        282
//imprima "\n";
//fi mprog


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double[] precocompra = new double[100];
        double[] precovenda = new double[100];
        double lucro;
        int totlucromenor10 = 0, totlucromenor20 = 0, totlucromaior20 = 0, A;

        for (A = 0; A < 100; A++) {
            System.out.println("Preço de compra: ");
            precocompra[A] = scan.nextDouble();
            System.out.println("Preço de venda: ");
            precovenda[A] = scan.nextDouble();
            System.out.println("Produto " + (A + 1) + " cadastrado com sucesso!");
        }

        for (A = 0; A < 100; A++) {
            lucro = precovenda[A] - precocompra[A];
            if (lucro < 10.0) {
                totlucromenor10++;
            } else {
                if (lucro <= 20.0) {
                    totlucromenor20++;
                } else {
                    totlucromaior20++;
                }
            }
        }

        System.out.println("Total de mercadorias com lucro < 10%: " + totlucromenor10);
        System.out.println("Total de mercadorias com 10% <= lucro <= 20%: " + totlucromenor20);
        System.out.println("Total de mercadorias com lucro > 20%: " + totlucromaior20);

    }
}