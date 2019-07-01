package com.github.gustavohenriquerssilva.cs.aula07;

/**
 * Implementação em Java dos 6 algoritmos propostos na aula 07.
 */

import java.util.Collection;
import java.util.ArrayList;
import java.util.Random;

public final class Exercicio7 {

    private Exercicio7() {
    };

    /**
     * Obtém a menor temperatura.
     *
     * @param temperaturas Vetor de valores de temperaturas.
     * @return A menor temperatura encontrada no vetor.
     */

    public static double obtenhaMenorTermperatura(final double[] temperaturas) {

        double menorTemperatura = temperaturas[0];

        for (int index = 0; index < temperaturas.length; index++) {
            if (temperaturas[index] < menorTemperatura) {
                menorTemperatura = temperaturas[index];
            }
        }

        return menorTemperatura;
    }

    /**
     * Obtém soma de números ímpares.
     *
     * @param valorEntrada Vetor de números inteiros.
     * @return A soma dos números ímpares do vetor.
     */

    public static int obtenhaSomaImpares(final int[] valorEntrada) {

        int soma = 0;

        for (int index = 0; index < valorEntrada.length; index++) {
            if (valorEntrada[index] % 2 != 0) {
                soma = soma + valorEntrada[index];
            }
        }

        return soma;
    }

    /**
     * Obtém quantidade de repeticões em que determinado número ocorre em um vetor.
     *
     * @param vetor      Vetor que será analisado.
     * @param comparador Valor que será buscado no vetor e contabilizado.
     * @return A quantidade de valores no vetor iguais ao comparador.
     */

    public static int obtenhaQtdElementosIguais(final double[] vetor, final int comparador) {

        int qtdElemIguais = 0;

        for (int index = 0; index < vetor.length; index++) {
            if (vetor[index] == comparador) {
                qtdElemIguais++;
            }
        }

        return qtdElemIguais;
    }

    /**
     * Obtém a quantidade de letras em uma sequência de caracteres.
     *
     * @param palavra A sequência de caracteres.
     * @return Vetor com a quantidade de repetições de cada letra na string.
     */

    public static int obtenhaQtdCaracteres(final String palavra) {

        int quantidadeLetras = 0;
        for (int index = 0; index < palavra.length(); index++) {
            if (Character.isLetter(palavra.charAt(index))) {
                quantidadeLetras++;
            }
        }

        return quantidadeLetras;
    }

    /**
     * obtenha a quantidade de vezes que uma palavra ocorre em um vetor de palavras.
     *
     * @param palavraSelecionada A palavra selecionada.
     * @param frase              A sequência de palavras.
     * @return A palavraSelecionada que mais aparece na sequência de caracteres.
     */

    public static int obtenhaQtdPalavras(final String palavraSelecionada, final String[] frase) {

        int quantidade = 0;
        for (int index = 0; index < frase.length; index++) {
            if (palavraSelecionada.equals(frase[index])) {
                quantidade++;
            }
        }

        return quantidade;

    }

    /**
     * A função sorteia aleatoriamente 1.000.000 de valores inteiros de 0 a 1000 e
     * identifica o número que mais foi sorteado. Se mais de um número foi o “mais
     * frequente”, então todos eles são retornados (em uma coleção) juntamente com a
     * quantidade de vezes em que ocorrerão.
     *
     * @return Coleção de strings contendo os números mais sorteados juntamente com
     *         a quantidade de vezes que foram sorteados.
     */

    public static Collection<String> verificarMaisSorteado() {

        final int valorMaxSorteavel = 1000;
        final int qtdNumSorteados = 1_000_000;

        final Random gerador = new Random();
        int[] qtdSorteada = new int[valorMaxSorteavel];
        int maiorQtdSorteio = 0;
        final Collection<String> maisSorteados = new ArrayList();

        for (int i = 0; i < qtdNumSorteados; i++) {
            qtdSorteada[gerador.nextInt(valorMaxSorteavel)]++;
        }

        for (int j = 0; j < valorMaxSorteavel; j++) {
            if (qtdSorteada[j] > maiorQtdSorteio) {
                maiorQtdSorteio = qtdSorteada[j];
            }
        }

        for (int k = 0; k < valorMaxSorteavel; k++) {
            if (qtdSorteada[k] == maiorQtdSorteio) {
                maisSorteados.add(k + " foi sorteado " + maiorQtdSorteio + " vezes.");
            }
        }

        return maisSorteados;
    }
}
