import java.util.Random;


public class GeradorDeDados {

    private static Random gerador;

    public GeradorDeDados() {
        gerador = new Random();
    }

    public String gerarTelefone() {
        int ddd = 10 + gerador.nextInt(80); // Gera um DDD entre 10 e 89
        int numero = 900000000 + gerador.nextInt(100000000); // Gera um número no formato 9XXXXXXX
        return String.format("(%02d) %d", ddd, numero);
    }

    public String gerarCPF() {
        int[] cpf = new int[11];
        int soma = 0;

        // Gera os nove primeiros dígitos do CPF
        for (int i = 0; i < 9; i++) {
            cpf[i] = gerador.nextInt(10);
        }

        // Calcula o primeiro dígito verificador
        for (int i = 0; i < 9; i++) {
            soma += cpf[i] * (10 - i);
        }
        int digito1 = (soma % 11 < 2) ? 0 : 11 - (soma % 11);
        cpf[9] = digito1;

        // Calcula o segundo dígito verificador
        soma = 0;
        for (int i = 0; i < 10; i++) {
            soma += cpf[i] * (11 - i);
        }
        int digito2 = (soma % 11 < 2) ? 0 : 11 - (soma % 11);
        cpf[10] = digito2;

        // Formata o CPF
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 11; i++) {
            sb.append(cpf[i]);
            if (i == 2 || i == 5) {
                sb.append(".");
            } else if (i == 8) {
                sb.append("-");
            }
        }
        return sb.toString();
    }

    public String gerarEndereco() {
        String[] ruas = {
                "Rua das Flores", "Avenida Paulista", "Rua dos Alfeneiros", "Rua 25 de Março",
                "Avenida Atlântica", "Rua da Harmonia", "Rua das Acácias", "Rua São João",
                "Avenida Brasil", "Rua Augusta", "Avenida Ipiranga", "Rua da Consolação",
                "Rua Sete de Setembro", "Avenida dos Andradas", "Rua do Catete", "Rua Barão de Tefé",
                "Rua Riachuelo", "Rua da Glória", "Rua da Alfândega", "Avenida Independência"
        };

        String[] cidades = {
                "São Paulo", "Rio de Janeiro", "Belo Horizonte", "Porto Alegre",
                "Curitiba", "Recife", "Salvador", "Fortaleza", "Brasília", "Manaus",
                "Belém", "Goiânia", "Vitória", "Cuiabá", "Campo Grande", "Florianópolis",
                "Maceió", "Aracaju", "João Pessoa", "Teresina", "Natal", "Boa Vista",
                "Macapá", "Palmas", "São Luís", "Porto Velho", "Rio Branco"
        };

        String[] estados = {
                "AC", "AL", "AP", "AM", "BA", "CE", "DF", "ES", "GO", "MA",
                "MT", "MS", "MG", "PA", "PB", "PR", "PE", "PI", "RJ", "RN",
                "RS", "RO", "RR", "SC", "SP", "SE", "TO"
        };

        String rua = ruas[gerador.nextInt(ruas.length)];
        int numero = 1 + gerador.nextInt(9999);
        String cidade = cidades[gerador.nextInt(cidades.length)];
        String estado = estados[gerador.nextInt(estados.length)];
        String cep = String.format("%05d-%03d", gerador.nextInt(100000), gerador.nextInt(1000));

        return String.format("%s, Numero: %d, Cidade: %s - Estado: %s, CEP: %s", rua, numero, cidade, estado, cep);
    }
}
