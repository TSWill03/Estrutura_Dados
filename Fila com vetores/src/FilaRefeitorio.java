public class FilaRefeitorio {
    private Frequentador[] fila;
    private int tamanho;
    private int capacidade;
    private int inicio;
    private int fim;

    // Construtor
    public FilaRefeitorio(int capacidade) {
        this.capacidade = capacidade;
        this.fila = new Frequentador[capacidade];
        this.tamanho = 0;
        this.inicio = 0;
        this.fim = -1;
    }

    public boolean estaVazia() {
        return tamanho == 0;
    }


    public boolean estaCheia() {
        return tamanho == capacidade;
    }

    public int tamanho_fila() {
        return tamanho;
    }

    // Método para adicionar um frequentador à fila
    public void entrar(Frequentador frequentador) {
        if (estaCheia()) {
            System.out.println("A fila está cheia, não é possível adicionar mais frequentadores.");
            return;
        }
        fim = (fim + 1) % capacidade;
        fila[fim] = frequentador;
        tamanho++;
    }

    // Método para remover um frequentador da fila
    public Frequentador sair() {
        if (estaVazia()) {
            System.out.println("A fila está vazia, não há frequentadores para sair.");
            return null;
        }
        Frequentador frequentador = fila[inicio];
        inicio = (inicio + 1) % capacidade;
        tamanho--;
        System.out.println(frequentador.getNome() + " saiu da fila.");
        return frequentador;
    }

    // Método para mostrar todos os frequentadores da fila
    public void mostrarFila() {
        if (estaVazia()) {
            System.out.println("A fila está vazia.");
            return;
        }
        System.out.println("\nFila do refeitório:");
        for (int i = 0; i < tamanho; i++) {
            int indice = (inicio + i) % capacidade;
            System.out.println(fila[indice]);
        }
    }


}
