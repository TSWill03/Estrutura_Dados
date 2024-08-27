public class Main {
    public static void main(String[] args) {
        ListaDuplamenteEncadeada lista = new ListaDuplamenteEncadeada();

        // 1) Adicione Homer e Marge na lista e depois imprima o resultado.
        lista.inserirNoFinal("Homer");
        lista.inserirNoFinal("Marge");
        lista.exibir();
        System.out.println("\n");

        // 2) Esvazie a lista e imprima.
        lista.esvaziar();
        lista.exibir();
        System.out.println("\n");

        // 3) Adicione Homer na lista. Depois adicione Bart na posição 0 e Moll na posição 1 e imprima a lista
        lista.inserirNoFinal("Homer");
        lista.inserirNaPosicao("Bart", 0);
        lista.inserirNaPosicao("Moll", 1);
        lista.exibir();
        System.out.println("\n");

        // 4) Esvazie a lista.
        lista.esvaziar();
        System.out.println("\n");

        // 5) Adicione Homer e Bart na lista e depois Adicione Lisa no início da lista. Imprima o resultado e o tamanho da lista.
        lista.inserirNoFinal("Homer");
        lista.inserirNoFinal("Bart");
        lista.inserirNoInicio("Lisa");
        lista.exibir();
        lista.exibirTamanhoLista();
        System.out.println("\n");

        // 6) Esvazie a lista e imprima.
        lista.esvaziar();
        lista.exibir();
        System.out.println("\n");

        // 7) Adicione Homer e Maggie na lista. Depois adicione Bart na posição 0 e Marge na posição 1 e imprima a lista. Verifique se Lisa está na lista.
        lista.estaNaLista("Homer");
        lista.estaNaLista("Maggie");
        lista.inserirNaPosicao("Bart", 0);
        lista.inserirNaPosicao("Marge", 1);
        lista.exibir();
        lista.estaNaLista("Lisa");
        System.out.println("\n");

        // 8) Esvazie a lista.
        lista.esvaziar();
        lista.exibir();
        System.out.println("\n");

        // 9) Adicione Homer e Bart na lista e depois imprima o resultado e o tamanho da lista.
        lista.inserirNoFinal("Homer");
        lista.inserirNoFinal("Bart");
        lista.exibir();
        lista.exibirTamanhoLista();
        System.out.println("\n");

        // 10) Verifique se Marge, Homer, Bart e Maggie estão na lista e depois imprima o resultado e o tamanho da lista.
        lista.estaNaLista("Marge");
        lista.estaNaLista("Homer");
        lista.estaNaLista("Bart");
        lista.estaNaLista("Maggie");
        lista.exibir();
        lista.exibirTamanhoLista();
        System.out.println("\n");

        // 11) Esvazie a lista.
        lista.esvaziar();
        System.out.println("\n");

        // 12) Adicione Homer e Bart no começo da lista. Depois adicione Marge, e depois Maggie na posição 1 e depois Ned Flanders no Começo da lista e Sr. Burns no Final da lista imprima a lista
        lista.inserirNoInicio("Homer");
        lista.inserirNoInicio("Bart");
        lista.inserirNoFinal("Marge");
        lista.inserirNaPosicao("Maggie", 1);
        lista.inserirNoInicio("Ned Flanders");
        lista.inserirNoFinal("Sr. Burns");
        lista.exibir();
        System.out.println("\n");

        // 13) Remova do fim da lista e imprima a lista.
        lista.removerDoFinal();
        lista.exibir();
        System.out.println("\n");

        // 14) Remova a posição 1, depois imprima a lista e o tamanho da lista.
        lista.removerNaPosicao(1);
        lista.exibir();
        lista.exibirTamanhoLista();
        System.out.println("\n");

        // 15) Verifique se Marge, Homer, Bart e Maggie estão na lista e depois imprima o resultado e o tamanho da lista.
        lista.estaNaLista("Marge");
        lista.estaNaLista("Homer");
        lista.estaNaLista("Bart");
        lista.estaNaLista("Maggie");
        lista.exibir();
        lista.exibirTamanhoLista();
        System.out.println("\n");

        // 16) Remova do começo da lista, depois imprima a lista e tamanho da lista.
        lista.removerDoInicio();
        lista.exibir();
        lista.exibirTamanhoLista();
        System.out.println("\n");

        // 17) Verifique se Marge, Homer, Bart e Maggie na lista depois imprima o resultado e o tamanho da lista.
        lista.estaNaLista("Marge");
        lista.estaNaLista("Homer");
        lista.estaNaLista("Bart");
        lista.estaNaLista("Maggie");
        lista.exibirTamanhoLista();
        System.out.println("\n");

        // 18) Esvazie a lista e imprima.
        lista.esvaziar();
        lista.exibir();
    }
}
