package com.github.gustavohenriquerssilva.aula12.domain;

import java.util.HashMap;
import java.util.Map;

/**
 * Implementa métodos que transformam um valor para outro.
 * 
 * @author Gustavo Henrique Rodrigues Santos Silva
 */
public class TransformaValorUtils {

    // Representa a unidade considerando o valor individual,
    // isolado ou sozinho.
    private static int unidade;

    // Representa um grupo de 10 unidades.
    private static int dezena;

    // Representa um grupo de 100 unidades.
    private static int centena;

    // Representa um grupo de 1000 unidades.
    private static int milhar;

    /**
     * Obtém o número por extenso.
     *
     * @param numero Número informado na tela. Valor entre 0 e 9999, inclusive.
     * 
     * @return Número por extenso. O valor 2 será dois, para 20 será vinte.
     * 
     * @throws IllegalArgumentException Se número for menor que 0 ou maior que 9999.
     */
    public static String getValorPorExtenso(final int numero) {

        int qtdDigitos = obtenhaQtdDigitos(numero);

        if (numero > 9999 || numero < 0) {
            throw new IllegalArgumentException("Valor informado deve estar entre 0 e 9999");
        }

        Map<String, String> valores = obtenhaDicionario();

        adicionaUnidades(numero);

        String unidadeExtenso = "";
        String dezenaExtenso = "";
        String centenaExtenso = "";
        String milharExtenso = "";

        if (dezena == 1) {
            dezenaExtenso = valores.get(String.valueOf("-" + unidade));
        } else {
            unidadeExtenso = valores.get(String.valueOf(unidade));
            dezenaExtenso = valores.get(String.valueOf(dezena + "0"));
        }

        centenaExtenso = valores.get(String.valueOf(centena + "00"));
        milharExtenso = valores.get(String.valueOf(numero / 1000));

        switch (qtdDigitos) {
        case 1:
            return unidadeExtenso;

        case 2:
            return obtemValorDoisDig(unidadeExtenso, dezenaExtenso);

        case 3:
            return obtemValorTresDig(unidadeExtenso, dezenaExtenso, centenaExtenso);
        }

        return obtemValorQuatroDig(unidadeExtenso, dezenaExtenso, centenaExtenso, milharExtenso);

    }

    /**
     * Método recebe um número inteiro, e adiciona as unidades dele nas variáveis
     * globais
     * 
     * @param numero Um número inteiro.
     */
    private static void adicionaUnidades(final int numero) {
        unidade = numero % 10;
        dezena = (numero / 10) % 10;
        centena = (numero / 100) % 10;
        milhar = (numero / 1000) % 10;
    }

    /**
     * Método recebe um números inteiros, e retorna uma string com o número escrito
     * por extenso. Caso valor para classe contenha 2 dígitos
     * 
     * @param unidadeExtenso Valor unidade
     * @param dezenaExtenso  Valor dezena
     * @return Uma string com o número escrito em extenso.
     */
    private static String obtemValorDoisDig(final String unidadeExtenso, final String dezenaExtenso) {
        if (dezena == 1)
            return dezenaExtenso;
        if (dezena == 0)
            return unidadeExtenso;
        if (unidade == 0)
            return dezenaExtenso;

        return dezenaExtenso + " e " + unidadeExtenso;
    }

    /**
     * Método recebe um números inteiros, e retorna uma string com o número escrito
     * por extenso. Caso valor para classe contenha 3 dígitos
     * 
     * @param unidadeExtenso Valor unidade
     * @param dezenaExtenso  Valor dezena
     * @param centenaExtenso Valor centena
     * @return Uma string com o número escrito em extenso.
     */
    private static String obtemValorTresDig(final String unidadeExtenso, final String dezenaExtenso,
            final String centenaExtenso) {
        if (unidade == 0 && dezena == 0 && centena == 1)
            return "cem";
        if (unidade == 0 && dezena == 0)
            return centenaExtenso;

        if (centena == 0)
            return obtemValorDoisDig(unidadeExtenso, dezenaExtenso);
        return centenaExtenso + " e " + obtemValorDoisDig(unidadeExtenso, dezenaExtenso);
    }

    /**
     * Método recebe um números inteiros, e retorna uma string com o número escrito
     * por extenso. Caso valor para classe contenha 4 dígitos
     * 
     * @param unidadeExtenso Valor unidade
     * @param dezenaExtenso  Valor dezena
     * @param centenaExtenso Valor centena
     * @param milharExtenso  Valor milhar
     * @return Uma string com o número escrito em extenso.
     */
    private static String obtemValorQuatroDig(String unidadeExtenso, String dezenaExtenso, String centenaExtenso,
            String milharExtenso) {
        if (unidade == 0 && dezena == 0 && centena == 0)
            return milharExtenso + " mil";
        if (milhar == 1)
            return "mil e " + obtemValorTresDig(unidadeExtenso, dezenaExtenso, centenaExtenso);

        return milharExtenso + " mil e " + obtemValorTresDig(unidadeExtenso, dezenaExtenso, centenaExtenso);
    }

    /**
     * Obtém quantidade de dígitos que o número contém
     * 
     * @param numero Número inteiro
     * @return Quantidade de dígitos do número passado O valor 10 será 2, para 100
     *         será 3.
     */
    public static int obtenhaQtdDigitos(int numero) {
        return Integer.toString(numero).length();
    }

    // Mapeia os nomes por extenso de possíveis números passados
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
