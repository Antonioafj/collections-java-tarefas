package main.java.list.pesquisa;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SomaNumeros{

    public List<Integer> numeros;

    public SomaNumeros() {
        this.numeros = new ArrayList<>();
    }

    public void adicionarNumero(int numero) {
        this.numeros.add(numero);
    }

    public int calcularSoma() {
        int soma = 0;
            for (Integer numero : numeros)
                soma += numero;
            return soma;
        }


    public int encontrarMaiorNumero() {
        int maiorNumero = Integer.MIN_VALUE;
        if (!numeros.isEmpty()) {
            for (Integer numero : numeros) {
                if (numero >= maiorNumero) {
                    maiorNumero = numero;
                }
            }
            return maiorNumero;
        } else {
            throw new RuntimeException("A LISTA ESTÁ VAZIA");
        }
    }

    public int encontrarMenorNumero() {
        int menorNumero = Integer.MAX_VALUE;
        if (!numeros.isEmpty()) {
            for (Integer numero : numeros) {
                if (numero <= menorNumero) {
                    menorNumero = numero;
                }
            }
            return menorNumero;
        } else {
            throw new RuntimeException("A LISTA ESTÁ VAZIA");
        }
    }

    public void exibirNumeros() {
        if (!numeros.isEmpty()) {
            System.out.println(this.numeros);
        } else {
            System.out.println("A LISTA ESTA VAZIA");
        }
    }

     public static void main(String[] args) {
        SomaNumeros somanumeros = new SomaNumeros();

        somanumeros.adicionarNumero(255);
        somanumeros.adicionarNumero(651);
        somanumeros.adicionarNumero(6114);
        somanumeros.adicionarNumero(-127);
        somanumeros.adicionarNumero(1111);
        somanumeros.adicionarNumero(-244);

        System.out.println("Numeros adicionados");
        somanumeros.exibirNumeros();


        System.out.println("Soma dos numeros = " + somanumeros.calcularSoma());

        System.out.println("Maior Numero = " + somanumeros.encontrarMaiorNumero());


        System.out.println("Menor numero = " + somanumeros.encontrarMenorNumero());

    }
}

