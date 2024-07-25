//Criar um algoritmo que armazene nome e duas notas de 5 alunos e imprima uma
//listagem contendo nome, as duas notas e a média de cada aluno.

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    String nome;
    float nota1;
    float nota2;
    public static void main(String[] args) {

        ArrayList<Aluno> alunos = new ArrayList<Aluno>();

        for( int i = 0; i < 5; i++){

            Scanner scan = new Scanner(System.in);

            System.out.println("Digite o nome : ");
            String nome = scan.nextLine();

            System.out.println("Digite a primeira nota: ");
            float nota1 = scan.nextFloat();

            System.out.println("Digite a segunda nota: ");
            float nota2 = scan.nextFloat();

            Aluno aluno = new Aluno(nome, nota1, nota2);
            alunos.add(aluno);
        }

        for(Aluno aluno : alunos){
            System.out.println("\nNome: " + aluno.getNome() + "\nNota 1: " + aluno.getNota1() + "\nNota 2: " + aluno.getNota2() + "\nMédia: " + aluno.getMedia());
        }
    }
}