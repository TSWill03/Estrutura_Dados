import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;

public class TorresDeHanoi {

    static class HanoiTask extends RecursiveTask<Void> {
        private static final int SEQUENTIAL_THRESHOLD = 10; // Ajuste do threshold

        int n;
        char origem, destino, auxiliar;

        HanoiTask(int n, char origem, char destino, char auxiliar) {
            this.n = n;
            this.origem = origem;
            this.destino = destino;
            this.auxiliar = auxiliar;
        }

        @Override
        protected Void compute() {
            if (n <= SEQUENTIAL_THRESHOLD) {
                resolverSequencial(n, origem, destino, auxiliar);
            } else {
                HanoiTask task1 = new HanoiTask(n - 1, origem, auxiliar, destino);
                HanoiTask task2 = new HanoiTask(1, origem, destino, auxiliar);
                HanoiTask task3 = new HanoiTask(n - 1, auxiliar, destino, origem);

                task1.fork();
                task2.compute();
                task3.fork();

                task1.join();
                task3.join();
            }
            return null;
        }

        private void resolverSequencial(int n, char origem, char destino, char auxiliar) {
            if (n > 0) {
                resolverSequencial(n - 1, origem, auxiliar, destino);
                resolverSequencial(n - 1, auxiliar, destino, origem);
            }
        }
    }

    public void rodarHanoi() {
        int n = 41; // Número de discos

        long startTime = System.currentTimeMillis();

        long movimentos = (long) Math.pow(2, n) - 1;

        int processors = Runtime.getRuntime().availableProcessors();
        ForkJoinPool pool = new ForkJoinPool(processors);

        pool.invoke(new HanoiTask(n, 'A', 'C', 'B'));

        long endTime = System.currentTimeMillis();
        long tempoMilissegundos = endTime - startTime;

        long tempoSegundos = tempoMilissegundos / 1000;
        long minutos = (tempoSegundos % 3600) / 60;
        long segundos = tempoSegundos % 60;

        System.out.println("Número de movimentos: " + movimentos);
        System.out.format("Tempo Levado para Resolver: %02d Minutos %02d Segundos %d Milissegundos%n", minutos, segundos, tempoMilissegundos % 1000);
    }
}
