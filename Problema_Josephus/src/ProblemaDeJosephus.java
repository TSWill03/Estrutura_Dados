import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ProblemaDeJosephus {
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_RESET = "\u001B[0m";

    public void RodarJosephao() {

        List<Integer> pessoas = new ArrayList<>();
        for (int i = 1; i <= 20; i++) {
            pessoas.add(i);
        }

        Random rand = new Random();

        while (pessoas.size() > 1) {

            int m = rand.nextInt(pessoas.size()) + 1;

            int indice = (m - 1) % pessoas.size();

            int pessoaEliminada = pessoas.remove(indice);
            System.out.println(ANSI_RED + "A pessoa eliminada foi a de número " + String.format("%02d", pessoaEliminada) + ANSI_RESET);

            List<Integer> novaLista = new ArrayList<>();
            novaLista.addAll(pessoas.subList(indice, pessoas.size()));
            novaLista.addAll(pessoas.subList(0, indice));
            pessoas = novaLista;
        }

        int pessoaSobrevivente = pessoas.getFirst();
        System.out.println(ANSI_GREEN + "\nA pessoa sobrevivente é a de número " + String.format("%02d", pessoaSobrevivente) + ANSI_RESET);
    }
}
