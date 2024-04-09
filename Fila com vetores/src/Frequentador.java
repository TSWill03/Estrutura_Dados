class Frequentador {
    protected String nome;

    public Frequentador(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    // Método para representar o frequentador como uma string
    @Override
    public String toString() {
        return "Frequentador(a) " + nome + "";
    }
}

