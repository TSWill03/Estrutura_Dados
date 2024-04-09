public class Main {
    public static void main(String[] args) {
        FilaRefeitorio fila = new FilaRefeitorio(5);

        fila.entrar(new Frequentador("João"));
        fila.entrar(new Frequentador("Maria"));
        fila.entrar(new Frequentador("José"));
        fila.mostrarFila();

        fila.sair();
        fila.mostrarFila();

        fila.entrar(new Frequentador("Pedro"));
        fila.entrar(new Frequentador("Ana"));
        fila.entrar(new Frequentador("Lucas"));
        fila.entrar(new Frequentador("Carla")); // A fila está cheia, este frequentador não será adicionado

        fila.mostrarFila();
    }
}