class Professor {
    private int siape;
    private String nome;
    private String titulacao;

    public Professor(int siape, String nome, String titulacao) {
        this.siape = siape;
        this.nome = nome;
        this.titulacao = titulacao;
    }

    @Override
    public String toString() {
        return "Professor [SIAPE=" + siape + ", Nome=" + nome + ", Titulação=" + titulacao + "]";
    }
}
