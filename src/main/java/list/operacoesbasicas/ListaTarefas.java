package main.java.list.operacoesbasicas;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

public class ListaTarefas {

    private List<Tarefa> tarefalist;

    public ListaTarefas() {
        this.tarefalist = new ArrayList<>();
    }

    public  void adicionarTarefa(String descricao){
        tarefalist.add(new Tarefa(descricao));
    }

    public  void removerTarefa(String descricao){
        List<Tarefa> tarefasParaRemover = new ArrayList<>();
                for(Tarefa t : tarefalist){
                    if (t.getDescricao().equalsIgnoreCase(descricao)) {
                        tarefasParaRemover.add(t);
                    }
                }
                tarefalist.removeAll(tarefasParaRemover);
            }
     public int obterNumeroTotalTarefas(){
        return tarefalist.size();
     }

     public void obterDescricoesTarefas(){
         System.out.println(tarefalist);
     }

    public static void main(String[] args) {

        ListaTarefas listaTarefas = new ListaTarefas();
        System.out.println("O numero total de elementos na lista é: " + listaTarefas.obterNumeroTotalTarefas());


        listaTarefas.adicionarTarefa("tarefa 1");
        listaTarefas.adicionarTarefa("tarefa 1");
        listaTarefas.adicionarTarefa("tarefa 2");

        System.out.println("O numero total de elementos na lista é: " + listaTarefas.obterNumeroTotalTarefas());

        listaTarefas.removerTarefa("tarefa 1");
        System.out.println("O numero total de elementos na lista é: " + listaTarefas.obterNumeroTotalTarefas());

        listaTarefas.obterDescricoesTarefas();
    }
}
