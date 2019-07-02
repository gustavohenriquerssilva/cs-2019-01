package com.github.gustavohenriquerssilva.cs.aula08.domain;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * Obtém a quantidade de ocorrência de uma palavra fornecida como parametro em
 * um arquivo.
 */
public final class EncontreUtils {

    /**
     * Construtor privado da classe.
     */
    private EncontreUtils() {

    }

    /**
     * Encontra a quantidade de ocorrências de uma palavra fornecida como parâmetro
     * no arquivo.
     *
     * @param caminhoArquivo Caminho do arquivo que será lido.
     * @param palavraBuscada Palavra que será buscada no aquivo encontrado.
     *
     * @return Retorna a quantidade de ocorrências.
     *
     * @throws IOException Se houver problema ao ler o caminho do arquivo.
     */
    public static String obtenhaQtdOcorrencia(final String caminhoArquivo, final String palavraBuscada)
            throws IOException {
        final File arquivo = new File(caminhoArquivo);

        if (arquivo.length() == 0) {
            throw new IllegalArgumentException("O arquivo não contem dados suficientes.");
        }

        final BufferedReader br = Files.newBufferedReader(Paths.get(caminhoArquivo));

        String[] palavras;
        String linhaSelecionada = br.readLine();
        int ocorrencias = 0;

        while (linhaSelecionada != null) {
            palavras = linhaSelecionada.split(" ");

            for (int contador = 0; contador < palavras.length; contador++) {
                if (palavraBuscada.equals(palavras[contador])) {
                    ocorrencias++;
                }
            }

            linhaSelecionada = br.readLine();
        }

        br.close();
        return String.format("Encontradas: %d.", ocorrencias);
    }

    /**
     * Busca uma palavra informada e especifica a linha e coluna das ocorrencias
     * encontradas dela mesma.
     *
     * @param caminhoArquivo Caminho do arquivo que será lido.
     * @param palavraBuscada Palavra que será buscada no aquivo encontrado.
     *
     * @return Retorna as linhas e colunas das ocorrências da palavra no arquivo
     *         passado.
     *
     * @throws IOException Se houver problema ao ler o caminho do arquivo.
     */
    public static String obtenhaLinhasEColunas(final String caminhoArquivo, final String palavraBuscada)
            throws IOException {
        final File arquivo = new File(caminhoArquivo);

        if (arquivo.length() == 0) {
            throw new IllegalArgumentException("O arquivo não contem dados suficientes.");
        }

        final BufferedReader br = Files.newBufferedReader(Paths.get(caminhoArquivo));

        final StringBuilder resultado = new StringBuilder();
        final StringBuilder linha = new StringBuilder();
        int contadorLinhas = 0;
        String linhaSelecionada;

        linhaSelecionada = br.readLine();
        while (linhaSelecionada != null) {
            linha.append(linhaSelecionada);
            contadorLinhas++;

            if (linha.toString().contains(palavraBuscada)) {
                resultado.append(String.format("%nL%d C%d: %s", contadorLinhas, linha.indexOf(palavraBuscada) + 1,
                        linha.toString()));
            }
            linha.setLength(0);
            linhaSelecionada = br.readLine();
        }

        br.close();
        return resultado.toString();
    }

    /**
     * Obtém a quantidade e locais das ocorrências da palavra chave no arquivo em
     * questão.
     *
     * @param caminhoArquivo Caminho do arquivo que será lido.
     * @param palavraBuscada Palavra que será buscada no aquivo encontrado.
     *
     * @return Retorna quantidade e locais das ocorrências da palavra chave no
     *         arquivo passado.
     *
     * @throws IOException Se houver problema ao ler o caminho do arquivo.
     */
    public static String obtenhaResultado(final String caminhoArquivo, final String palavraBuscada) throws IOException {

        final StringBuilder resultado = new StringBuilder();
        resultado.append(obtenhaQtdOcorrencia(caminhoArquivo, palavraBuscada))
                .append(obtenhaLinhasEColunas(caminhoArquivo, palavraBuscada));

        return resultado.toString();
    }
}
