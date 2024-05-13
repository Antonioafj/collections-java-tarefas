package main.java.list.ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class OrdenacaoNumeros {

    private List<Integer> numeroList;

    public OrdenacaoNumeros() {
        this.numeroList = new ArrayList<>();

    }

    public void adicionarNumero(int numero) {
        this.numeroList.add(numero);
    }
    public List<Integer> ordenarAscendente() {
        List<Integer> ordemascedente = new ArrayList<>(numeroList);
        if (!numeroList.isEmpty()) {
            Collections.sort(ordemascedente);
            return ordemascedente;
        } else {
            throw new RuntimeException("A LISTA ESTA VAZIA");
        }
    }

    public List<Integer> ordenarDescendente() {
        List<Integer> ordemDescendente = new ArrayList<>(numeroList);
        if (!numeroList.isEmpty()){
            ordemDescendente.sort(Collections.reverseOrder());
            return ordemDescendente;
        }else{
         throw new RuntimeException("A LISTA ESTÁ VAZIA");
        }
    }

    public void exibirNumeros() {
        if (!numeroList.isEmpty()) {
            System.out.println(this.numeroList);
        } else {
            System.out.println("A LISTA ESTÁ VAZIA");
        }
    }
    public static void main(String[] args) {
        OrdenacaoNumeros ordenacaonumeros = new OrdenacaoNumeros();

        ordenacaonumeros.adicionarNumero(12);
        ordenacaonumeros.adicionarNumero(56);
        ordenacaonumeros.adicionarNumero(33);
        ordenacaonumeros.adicionarNumero(22);
        ordenacaonumeros.adicionarNumero(52);


        ordenacaonumeros.exibirNumeros();

        System.out.println(ordenacaonumeros.ordenarAscendente());

        ordenacaonumeros.exibirNumeros();

        System.out.println(ordenacaonumeros.ordenarDescendente());

        ordenacaonumeros.exibirNumeros();
    }
}