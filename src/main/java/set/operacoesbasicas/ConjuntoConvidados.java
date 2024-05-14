package main.java.set.operacoesbasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {

    private Set<Convidado> convidadoSet;

    public ConjuntoConvidados() {
        this.convidadoSet = new HashSet<>();
    }

    public void adicionarConvidado(String nome, int codigo) {
        convidadoSet.add(new Convidado (nome, codigo));
    }

    public void removerConvidadoPorCodigoConvite(int codigo){
        Convidado convidadoRemover = null;
        for(Convidado c : convidadoSet){
            if (c.getCodigo() == codigo) {
                convidadoRemover = c ;
                break;
            }
        }
        convidadoSet.remove(convidadoRemover);
    }

    public int contarConvidados(){
        return convidadoSet.size();
    }

    public void exibirConvidados(){
        System.out.println(convidadoSet);
    }

    public static void main(String[] args) {
        ConjuntoConvidados conjuntoconvidados = new ConjuntoConvidados();
        System.out.println("Existem " + conjuntoconvidados.contarConvidados() + " dentro do Set de Convidados");

        conjuntoconvidados.adicionarConvidado("canditato 1", 1234);
        conjuntoconvidados.adicionarConvidado("canditato 2", 1236);
        conjuntoconvidados.adicionarConvidado("canditato 3", 1235);
        conjuntoconvidados.adicionarConvidado("canditato 4", 1236);
        conjuntoconvidados.adicionarConvidado("canditato 5", 1237);

        conjuntoconvidados.exibirConvidados();

        System.out.println("Existem " + conjuntoconvidados.contarConvidados() + " dentro do Set de Convidados ");

       conjuntoconvidados.removerConvidadoPorCodigoConvite(1235);

       System.out.println("Existem " + conjuntoconvidados.contarConvidados() + " dentro do Set de Convidados");


       conjuntoconvidados.exibirConvidados();
    }
}
