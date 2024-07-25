import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class GeradorDeNomes {

    private ArrayList<String> nomes;
    private ArrayList<String> sobrenomes;

    String[] nomesLista = {
            "Maria", "João", "Thiago", "Cleber", "Marcos", "Pedro", "Carlos", "Osmar",
            "Messias", "Wagner", "Fabio", "William", "Jéssica", "Pietra", "Paola", "Luana",
            "Bruna", "Ana", "Thaís", "Isabela", "Lula", "Ricardo", "Roberta", "Larissa",
            "Juliana", "Lucas", "Gabriel", "Sofia", "Eduardo", "Camila", "Aline", "Rodrigo",
            "Beatriz", "Fernanda", "Vinícius", "Rafael", "Vitor", "Hugo", "Mariana", "Luís",
            "Daniel", "Leonardo", "Alice", "Júlia", "Arthur", "Miguel", "Matheus", "Davi",
            "Helena", "Manuela", "Valentina", "Yasmin", "Livia", "Larissa", "Antônio", "Henry",
            "Tomás", "Bianca", "Lorenzo", "Enzo", "Nicolas", "Samuel", "Agatha", "Noah",
            "Eloá", "Stella", "Clara", "Alana", "Bernardo", "Sarah", "Isis", "Lucca",
            "Breno", "Theo", "Cecília", "Aurora", "Gabriela", "Rafaela", "Ruan", "Melissa",
            "Leandro", "Heitor", "Joaquim", "Benjamin", "Isadora", "Emanuel", "Alexandre",
            "Diego", "Bárbara", "Lia", "Pedro Henrique", "Maria Eduarda", "Lorena", "Sophia",
            "Esther", "Luna", "Rebeca", "Jade", "Luiz", "Cauã", "Iago", "Zoe", "Milena"};
    String[] sobrenomesLista = {
            "da Silva", "de Souza", "Soares", "Bonfim", "Pereira", "Costa", "Inácio",
            "Bolsonaro", "Nascimento", "Moura", "Martins", "Almeida", "Barbosa", "Vieira",
            "Cardoso", "Freitas", "Fernandes", "Gomes", "Barros", "Santos", "Oliveira",
            "Ribeiro", "Dias", "Lima", "Teixeira", "Araújo", "Carvalho", "Rocha",
            "Moreira", "Mendes", "Silva", "Souza", "Monteiro", "Melo", "Castro",
            "Medeiros", "Barreto", "Alves", "Batista", "Vasconcelos", "Cavalcante",
            "Duarte", "Ferreira", "Gonçalves", "Henriques", "Iglesias", "Junqueira",
            "Lacerda", "Magalhães", "Neves", "Ornelas", "Pacheco", "Quaresma",
            "Ramalho", "Sales", "Tavares", "Uchoa", "Viana", "Xavier", "Zanetti",
            "Assis", "Braga", "Corrêa", "Diniz", "Esteves", "Farias", "Guedes",
            "Hoffmann", "Ibrahim", "Jardim", "Klein", "Leal", "Macedo", "Nóbrega",
            "Olivetti", "Peixoto", "Queiroz", "Rezende", "Salazar", "Torres",
            "Urbano", "Valle", "Wanderley", "Ximenes", "Yamamoto", "Zambrano",
            "Abreu", "Borges", "Coelho", "Domingues", "Esposito", "Freire",
            "Guimarães", "Holanda", "Imbiriba", "Junqueira", "Kerr", "Lima",
            "Manso", "Nunes", "Oliveira", "Pinto", "Queiróz", "Rodrigues",
            "Silveira", "Teles", "Vieira", "Ximenes", "Yunes", "Zamboni"
    };

    public GeradorDeNomes() {
        nomes = new ArrayList<>();
        sobrenomes = new ArrayList<>();


    }



    public String gerarNome() {

        Random rd = new Random();

        nomes.addAll(Arrays.asList(nomesLista));

        int numNome = rd.nextInt(nomes.size());

        return nomes.get(numNome);
    }
    public String gerarSobrenome() {

        Random rd = new Random();

        sobrenomes.addAll(Arrays.asList(sobrenomesLista));

        int numSobrenome = rd.nextInt(nomes.size());

        return sobrenomes.get(numSobrenome);
    }


}
