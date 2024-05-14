package main.java.set.pesquisa;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ListaTarefas {

    private Set<Tarefa> tarefaSet;

    public ListaTarefas() {
        this.tarefaSet = new HashSet<>();
    }

    public void adicionarTarefa(String descricao) {
        tarefaSet.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao) {
        Tarefa tarefaParaRemover = null;
        if (!tarefaSet.isEmpty()) {
            for (Tarefa t : tarefaSet) {
                if (t.getDescricao().equalsIgnoreCase(descricao)) {
                    tarefaParaRemover = t;
                    break;
                }
            }
            tarefaSet.remove(tarefaParaRemover);
        } else {
            System.out.println("O conjunto esta vazio");
        }

        if (tarefaParaRemover == null) {
            System.out.println("Tarefa não encontrada!");
        }
    }

    public void exibirTarefas() {
        if (!tarefaSet.isEmpty()) {
            System.out.println(tarefaSet);
        } else {
            System.out.println("Tarefa não encontrada!");
        }
    }

    public int contarTarefa() {
        return tarefaSet.size();
    }

    public Set<Tarefa> obterTarefasConcluidas() {
        Set<Tarefa> tarefasConcluidas = new HashSet<>();
        for (Tarefa t : tarefaSet) {
            if (t.isConcluido()) {
                tarefasConcluidas.add(t);
            }
        }
        return tarefasConcluidas;
    }

    public Set<Tarefa> obterTarefasPendentes() {
        Set<Tarefa> tarefasPendentes = new HashSet<>();
        for (Tarefa ta : tarefaSet) {
            if (!ta.isConcluido()) {
                tarefasPendentes.add(ta);
            }
        }
        return tarefasPendentes;
    }

    public void marcarTarefaConcluida(String descricao) {
        for (Tarefa t : tarefaSet) {
            if (t.getDescricao().equalsIgnoreCase(descricao)){
                t.setConcluido(true);
             }
        }
    }
    public void marcarTarefaPendente(String descricao) {
        Tarefa tarefaParaMarcarPendente = null;
        for (Tarefa t : tarefaSet) {
            if (t.getDescricao().equalsIgnoreCase(descricao)) {
                tarefaParaMarcarPendente = t;
                break;
            }
        }

        if (tarefaParaMarcarPendente != null) {
            if (tarefaParaMarcarPendente.isConcluido()) {
                tarefaParaMarcarPendente.setConcluido(false);
            }
        } else {
            System.out.println("Tarefa não encontrada no lista");
        }
    }

    public void limparListaTarefas(){
        if (tarefaSet.isEmpty()){
            System.out.println("A lista está vazia");
        }else {
            tarefaSet.clear();
        }
    }

    public static void main(String[] args) {
        ListaTarefas listaTarefas = new ListaTarefas();

        listaTarefas.adicionarTarefa("Estudar Java");
        //listaTarefas.adicionarTarefa("Fazer exercícios físicos");
        //listaTarefas.adicionarTarefa("Organizar a mesa de trabalho");
        //listaTarefas.adicionarTarefa("Ler livro");
        //listaTarefas.adicionarTarefa("Preparar Apresentação");

       // listaTarefas.exibirTarefas();

       //listaTarefas.removerTarefa("Fazer exercícios físicos");
        //listaTarefas.exibirTarefas();

        //System.out.println("Total de tarefas na lista " + listaTarefas.contarTarefa());

        //System.out.println(listaTarefas.obterTarefasPendentes());

        //listaTarefas.marcarTarefaConcluida("Ler livro");
         listaTarefas.marcarTarefaConcluida("Estudar Java");

        System.out.println(listaTarefas.obterTarefasConcluidas());

        //listaTarefas.marcarTarefaPendente("Estudar Java");
        //listaTarefas.exibirTarefas();


        //listaTarefas.limparListaTarefas();
        //listaTarefas.exibirTarefas();
    }
}