package main.java.set.ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class GerenciadorAlunos {

    private Set<Aluno> alunoSet;

    public GerenciadorAlunos() {
        this.alunoSet = new HashSet<>();
    }

    public void adicionarAluno(String nome, Long matricula, double nota) {
        alunoSet.add(new Aluno(nome, matricula, nota));
    }

    public void removerAluno(long matricula) {
        Aluno alunoParaRemover = null;
        if (!alunoSet.isEmpty()) {
            for (Aluno a : alunoSet) {
                if (a.getMatricula() == matricula) {
                    alunoParaRemover = a;
                    break;
                }
            }
            alunoSet.remove(alunoParaRemover);
        } else {
            throw new RuntimeException("O conjunto esta vazio");
        }
        if (alunoParaRemover == null) {
            System.out.println("Matricula não encontrada!");
        }
    }

    public void exibirAlunosPorNome() {
        Set<Aluno> alunoPorNome = new TreeSet<>(alunoSet);
        if (!alunoSet.isEmpty()) {
            System.out.println(alunoPorNome);
        } else{
            System.out.println("O conjunto esta vazio");
    }
}

    public void exibirAlunosPorNota() {
        Set<Aluno> alunosPorNota = new TreeSet<>(new ComparatorPorNota());
        if (!alunoSet.isEmpty()) {
        alunosPorNota.addAll(alunoSet);
        System.out.println(alunosPorNota);
    }else{
            System.out.println("O conjunto esta vazio");
        }
    }

    public void exibirAlunos() {
        if (!alunoSet.isEmpty()) {
            System.out.println(alunoSet);
        } else {
            System.out.println("Alunos não encontrados!");
        }
    }


    public static void main(String[] args) {
        GerenciadorAlunos gerenciarAlunos = new GerenciadorAlunos();

        gerenciarAlunos.adicionarAluno("Aluno 1", 123456L, 6.8);
        gerenciarAlunos.adicionarAluno("Aluno 2", 1234567L, 3.8);
        gerenciarAlunos.adicionarAluno("Aluno 4", 12345678L, 4.8);
        gerenciarAlunos.adicionarAluno("Aluno 5", 12345679L, 6.4);
        gerenciarAlunos.adicionarAluno("Aluno 6", 123456789L, 8.8);

        //gerenciarAlunos.exibirAlunos();

        //System.out.println("\n Alunos no gerenciador: \n");
        //System.out.println(gerenciarAlunos.alunoSet);


        //gerenciarAlunos.removerAluno(000L);
        //gerenciarAlunos.removerAluno(1234567L);
        //System.out.println(gerenciarAlunos.alunoSet);

        gerenciarAlunos.exibirAlunosPorNome();

        gerenciarAlunos.exibirAlunosPorNota();

    }
}




