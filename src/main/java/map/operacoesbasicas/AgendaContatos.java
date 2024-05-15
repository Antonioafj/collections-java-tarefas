package main.java.map.operacoesbasicas;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {

    private Map<String, Integer> agendaContatoMap;

    public AgendaContatos() {
        this.agendaContatoMap = new HashMap<>();
    }

    public void adicionarContato(String nome, Integer telefone){
        agendaContatoMap.put(nome, telefone);
    }

    public void removerContato(String nome){
        if(!agendaContatoMap.isEmpty()){
            agendaContatoMap.remove(nome);
        }
    }
    public void exibirContatos(){
        System.out.println(agendaContatoMap);
    }

    public Integer pesquisarPorNome(String nome){
        Integer numeroPorNome = null;
        if (!agendaContatoMap.isEmpty()){
           numeroPorNome = agendaContatoMap.get(nome);
           if (numeroPorNome == null) {
               System.out.println("Contato não encontrado na agenda.");
           }
        }else {
            System.out.println("A agenda de contato está vazia");
        }
        return numeroPorNome;
    }


public static void main(String[] args) {
   AgendaContatos agendaContatos = new AgendaContatos();

   agendaContatos.adicionarContato("Antonio", 123456);
   agendaContatos.adicionarContato("Antonio", 321456);
   agendaContatos.adicionarContato("Antonio Alves", 12121212);
   agendaContatos.adicionarContato("Antonio Ferreira", 654321);
   agendaContatos.adicionarContato("Junior", 12121212);
   agendaContatos.adicionarContato("Antonio", 55555);

   agendaContatos.exibirContatos();

   agendaContatos.removerContato("Junior");
   agendaContatos.exibirContatos();


  System.out.println("O numero é: " + agendaContatos.pesquisarPorNome("Antonio Alves"));

  }

}