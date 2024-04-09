public class Main {
    public static void main(String[] args) {
        Fila_Refeitorio filaRefeitorio = new Fila_Refeitorio();

        filaRefeitorio.add(new Aluno(1234, "João", "Engenharia"));
        filaRefeitorio.add(new Professor(5678, "Maria", "Doutorado"));
        filaRefeitorio.add(new TecnicoAdministrativo(9012, "José"));

        filaRefeitorio.imprimirFila();
    }
}
