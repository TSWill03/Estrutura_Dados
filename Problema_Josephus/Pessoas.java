
public class Pessoas {
    private String nome;
    private String sobrenome;
    private String telefone;
    private String endereço;
    private String cpf;
    private int indice;

    public Pessoas(int indice) {
        GeradorDeNomes gDn = new GeradorDeNomes();
        GeradorDeDados gDd = new GeradorDeDados();
        this.nome = gDn.gerarNome();
        this.sobrenome = gDn.gerarSobrenome();
        this.telefone = gDd.gerarTelefone();
        this.endereço = gDd.gerarEndereco();
        this.cpf = gDd.gerarCPF();
        this.indice = indice;
    }

    public String getNome() {
        return nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getEndereco() {
        return endereço;
    }

    public String getCpf() {
        return cpf;
    }

    public int getIndice() {
        return indice;
    }
}
