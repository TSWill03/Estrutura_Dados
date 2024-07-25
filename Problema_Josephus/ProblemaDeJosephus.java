import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ProblemaDeJosephus {

    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_RESET = "\u001B[0m";

    private List<Pessoas> pessoas;

    public ProblemaDeJosephus() {
        pessoas = new ArrayList<>();
        inicializarPessoas();
    }

    private void inicializarPessoas() {

        for (int i = 0; i < 20; i++) {
            pessoas.add(new Pessoas(i));
        }
    }

    public void RodarJosephao() {
        pessoas = new ArrayList<>();
        inicializarPessoas();

        Random rand = new Random();

        while (pessoas.size() > 1) {

            int m = rand.nextInt(pessoas.size()) + 1;
            Pessoas pessoaindice = pessoas.get(m - 1);

            System.out.println(ANSI_RED +
                    "Matando: "   + pessoaindice.getNome() +
                    " "          + pessoaindice.getSobrenome() +
                    " Telefone: " + pessoaindice.getTelefone() +
                    " Endereço: " + pessoaindice.getEndereco() +
                    " CPF: "      + pessoaindice.getCpf() +
                    "\n"         +
                    ANSI_RESET);
            pessoas.remove(pessoaindice);
        }
        System.out.println(ANSI_GREEN +
                "Sobrevivente: " + pessoas.getFirst().getNome() +
                " "              + pessoas.getFirst().getSobrenome() +
                " Telefone: "     + pessoas.getFirst().getTelefone() +
                " Endereço: "     + pessoas.getFirst().getEndereco() +
                " CPF: "          + pessoas.getFirst().getCpf() +
                ANSI_RESET);
    }
}