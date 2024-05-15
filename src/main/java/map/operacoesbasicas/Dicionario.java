package main.java.map.operacoesbasicas;

import java.util.HashMap;
import java.util.Map;

public class Dicionario {
    private Map<String,String> dicionarioMap;

    public Dicionario() {
        this.dicionarioMap = new HashMap<>();
    }
    public void adicionarPalavra(String palavra, String definicao){
        dicionarioMap.put(palavra, definicao);
    }

    public void removerPalavra(String palavra) {
        if (!dicionarioMap.isEmpty()) {
            dicionarioMap.remove(palavra);
        }
    }
     public void exibirPalavras(){
            System.out.println(dicionarioMap);
    }
    public String pesquisarPorPalavra(String palavra){
        String pesquisaPalavra = null;
        if (!dicionarioMap.isEmpty()){
            pesquisaPalavra = dicionarioMap.get(palavra);
            if (pesquisaPalavra == null) {
                System.out.println("Palavra não encontrada no dicionario.");
            }
        }else {
            System.out.println("Dicionario vazio");
        }
        return pesquisaPalavra;
    }

public static void main(String[] args) {
    Dicionario dicionario = new Dicionario();

    dicionario.adicionarPalavra("Lol", "rindo muito");
    dicionario.adicionarPalavra("esta", "aqui");
    dicionario.adicionarPalavra("caramba", "u e pa");
    dicionario.adicionarPalavra("vai loco", "heheheh");
    dicionario.adicionarPalavra("Lol", "kkkkkkkkkk");


    dicionario.exibirPalavras();

    String definicaoEsta = dicionario.pesquisarPorPalavra("esta");
    System.out.println("Definição de 'esta': " + definicaoEsta);

    dicionario.removerPalavra("caramba");
    dicionario.exibirPalavras();


    }
}


