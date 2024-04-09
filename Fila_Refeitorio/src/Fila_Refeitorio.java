import java.util.LinkedList;
import java.util.Queue;

public class Fila_Refeitorio {
    Queue<Object> filaRefeitorio = new LinkedList<>();

public void add(Object frequentador) {
        filaRefeitorio.add(frequentador);
    }

public void imprimirFila() {
        System.out.println("Fila do refeitório:");
        for (Object frequentador : filaRefeitorio) {
            System.out.println(frequentador);
        }
    }

}
