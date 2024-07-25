public class Main {
    public static void main(String[] args) {

        String[] nome = new String[15];
        double[] pr1 = new double[15];
        double[] pr2 = new double[15];
        double[] media = new double[15];
        String[] situacao = new String[15];

        for (int i = 0; i < 15; i++) {
            nome[i] = String.format("Aluno %02d", i + 1);
            pr1[i] = Math.random() * 10;
            pr2[i] = Math.random() * 10;
            media[i] = (pr1[i] + pr2[i]) / 2;
            media[i] = Math.round(media[i]);
            if (media[i] >= 6) {
                situacao[i] = "AP";
            } else {
                situacao[i] = "RP";
            }
        }

        System.out.println("Nome\t\tPR1\t\tPR2\t\tMédia\tSituação");
        for (int i = 0; i < 15; i++) {
            System.out.println(nome[i] + "\t" + String.format("%.2f", pr1[i]) + "\t" + String.format("%.2f", pr2[i]) + "\t" + media[i] + "\t\t" + situacao[i]);
        }
    }
}
