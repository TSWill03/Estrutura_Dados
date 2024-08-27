class ListaDuplamenteEncadeada {
    No inicio;
    No fim;

    public ListaDuplamenteEncadeada() {
        this.inicio = null;
        this.fim = null;
    }

    public void inserirNoFinal(String valor) {
        No novoNo = new No(valor);
        if (inicio == null) { // Lista vazia
            inicio = fim = novoNo;
        } else {
            fim.proximo = novoNo;
            novoNo.anterior = fim;
            fim = novoNo;
        }
    }

    public void inserirNoInicio(String valor) {
        No novoNo = new No(valor);
        if (inicio == null) {
            inicio = fim = novoNo;
        } else {
            novoNo.proximo = inicio;
            inicio.anterior = novoNo;
            inicio = novoNo;
        }
    }

    public void inserirNaPosicao(String valor, int posicao) {
        if (posicao == 0) {
            inserirNoInicio(valor);
            return;
        }

        No atual = inicio;
        for (int i = 0; i < posicao - 1 && atual != null; i++) {
            atual = atual.proximo;
        }

        if (atual == null) {
            System.out.println("Posição inválida!");
            return;
        }

        No novoNo = new No(valor);
        novoNo.proximo = atual.proximo;
        novoNo.anterior = atual;

        if (atual.proximo != null) {
            atual.proximo.anterior = novoNo;
        } else {
            fim = novoNo;
        }

        atual.proximo = novoNo;
    }

    public void removerDoFinal() {
        if (fim == null) {
            System.out.println("Lista vazia!");
            return;
        }

        if (inicio == fim) {
            inicio = fim = null;
        } else {
            fim = fim.anterior;
            fim.proximo = null;
        }
    }

    public void removerDoInicio() {
        if (inicio == null) {
            System.out.println("Lista vazia!");
            return;
        }

        if (inicio == fim) {
            inicio = fim = null;
        } else {
            inicio = inicio.proximo;
            inicio.anterior = null;
        }
    }

    public void removerNaPosicao(int posicao) {
        if (inicio == null) {
            System.out.println("Lista vazia!");
            return;
        }

        if (posicao == 0) {
            removerDoInicio();
            return;
        }

        No atual = inicio;
        for (int i = 0; i < posicao && atual != null; i++) {
            atual = atual.proximo;
        }

        if (atual == null) {
            System.out.println("Posição inválida!");
            return;
        }

        if (atual.proximo != null) {
            atual.proximo.anterior = atual.anterior;
        } else {
            fim = atual.anterior;
        }

        if (atual.anterior != null) {
            atual.anterior.proximo = atual.proximo;
        }
    }

    public String verificarPresenca(String valor) {
        No atual = inicio;
        while (atual != null) {
            if (atual.valor.equals(valor)) {
                return "Está";
            }
            atual = atual.proximo;
        }
        return "Não está";
    }

    public void exibir() {
        No atual = inicio;
        int pos = 0;
        while (atual != null) {
            System.out.print(atual.valor + " " + pos + "\n");
            atual = atual.proximo;
            pos += 1;
        }
        System.out.println();
    }

    public int tamanho() {
        int tamanho = 0;
        No atual = inicio;
        while (atual != null) {
            tamanho++;
            atual = atual.proximo;
        }
        return tamanho;
    }

    public void esvaziar() {
        inicio = fim = null;
    }

    public void exibirTamanhoLista(){
        System.out.println("Tamanho da lista: " + tamanho());
    }

    public void estaNaLista(String valor){
        System.out.println(valor + " está na lista? " + verificarPresenca(valor));
    }
}
