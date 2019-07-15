/*
 * Copyright (c) 2018.
 * Fábrica de Software - Instituto de Informática (UFG)
 * Creative Commons Attribution 4.0 International License.
 */

package com.github.gustavohenriquerssilva.aula12.domain;

import java.util.HashMap;
import java.util.Map;

/**
 * Implementa métodos que transformam um valor para outro
 * 
 * @author Gustavo Henrique Rodrigues Santos Silva
 */
public class TransformaValorUtils {

    private static int unidade;
    private static int dezena;
    private static int centena;
    private static int milhar;

    /**
     * Obtém o número por extenso
     *
     * @param numero Número informado na tela. Valor entre 0 e 9999, inclusive.
     * 
     * @return Número por extenso. O valor 2 será dois, para 20 será vinte.
     * 
     * @throws IllegalArgumentException Se número contiver mais de 4 dígitos
     */
    public static String getValorPorExtenso(final int numero) {

        int qtdDigitos = obtenhaQtdDigitos(numero);

        if (numero > 9999 || numero < 0) {
            throw new IllegalArgumentException("Valor informado deve estar entre 0 e 9999");
        }

        Map<String, String> valores = obtenhaDicionario();

        adicionaUnidades(numero);

        String valor1 = "";
        String valor2 = "";
        String valor3 = "";
        String valor4 = "";

        if (dezena == 1) {
            valor2 = valores.get(String.valueOf("-" + unidade));
        } else {
            valor1 =  valores.get(String.valueOf(unidade));
            valor2 = valores.get(String.valueOf(dezena + "0"));
        }

        valor3 = valores.get(String.valueOf(centena + "00"));
        valor4 = valores.get(String.valueOf(numero / 1000));

        switch (qtdDigitos) {
        case 1:
            return valor1;

        case 2:
            return obtemValorDoisDig(valor1, valor2);

        case 3:
            return obtemValorTresDig(valor1, valor2, valor3);
        }

        return obtemValorQuatroDig(valor1, valor2, valor3, valor4);

    }

    private static void adicionaUnidades(final int numero) {
        unidade = numero % 10;
        dezena = (numero / 10) % 10;
        centena = (numero / 100) % 10;
        milhar = (numero / 1000) % 10;
    }

    private static String obtemValorDoisDig(final String valor1, final String valor2) {
        if (dezena == 1)
            return valor2;
        if (dezena == 0)
            return valor1;
        if (unidade == 0)
            return valor2;

        return valor2 + " e " + valor1;
    }

    private static String obtemValorTresDig(final String valor1, final String valor2, final String valor3) {
        if (unidade == 0 && dezena == 0 && centena == 1)
            return "cem";
        if (unidade == 0 && dezena == 0)
            return valor3;

        if (centena == 0)
            return obtemValorDoisDig(valor1, valor2);
        return valor3 + " e " + obtemValorDoisDig(valor1, valor2);
    }

    private static String obtemValorQuatroDig(String valor1, String valor2, String valor3, String valor4) {
        if (unidade == 0 && dezena == 0 && centena == 0)
            return valor4 + " mil";
        if (milhar == 1)
            return "mil e " + obtemValorTresDig(valor1, valor2, valor3);

        return valor4 + " mil e " + obtemValorTresDig(valor1, valor2, valor3);
    }

    public static int obtenhaQtdDigitos(int n) {
        n = Math.abs(n);
        if (n == 0)
            return 1;
        else
            return (int) (Math.log10(n) + 1);
    }

    private static Map<String, String> obtenhaDicionario() {
        Map<String, String> valores = new HashMap<String, String>();

        valores.put("0", new String("zero"));
        valores.put("1", new String("um"));
        valores.put("2", new String("dois"));
        valores.put("3", new String("três"));
        valores.put("4", new String("quatro"));
        valores.put("5", new String("cinco"));
        valores.put("6", new String("seis"));
        valores.put("7", new String("sete"));
        valores.put("8", new String("oito"));
        valores.put("9", new String("nove"));
        valores.put("-0", new String("dez"));
        valores.put("-1", new String("onze"));
        valores.put("-2", new String("doze"));
        valores.put("-3", new String("treze"));
        valores.put("-4", new String("quartoze"));
        valores.put("-5", new String("quinze"));
        valores.put("-6", new String("dezesseis"));
        valores.put("-7", new String("dezessete"));
        valores.put("-8", new String("dezoito"));
        valores.put("-9", new String("dezenove"));
        valores.put("20", new String("vinte"));
        valores.put("30", new String("trinta"));
        valores.put("40", new String("quarenta"));
        valores.put("50", new String("cinquenta"));
        valores.put("60", new String("sessenta"));
        valores.put("70", new String("setenta"));
        valores.put("80", new String("oitenta"));
        valores.put("90", new String("noventa"));
        valores.put("100", new String("cento"));
        valores.put("200", new String("duzentos"));
        valores.put("300", new String("trezentos"));
        valores.put("400", new String("quatrocentos"));
        valores.put("500", new String("quinhentos"));
        valores.put("600", new String("seicentos"));
        valores.put("700", new String("setecentos"));
        valores.put("800", new String("oitocentos"));
        valores.put("900", new String("novecentos"));
        return valores;
    }
}
