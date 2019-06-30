package com.github.gustavohenriquerssilva.cs.aula08.domain;

import java.io.DataInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * Tem a função de receber um arquivo e
 * conferir se o mesmo é um arquivo do tipo jpeg.
 */
public final class ConfereArquivoUtils {

    /**
     * Primeiro byte de arquivo jpeg.
     */
    private static final int PRIMEIROBYTE = 0xff;

    /**
     * Segundo byte de arquivo jpeg.
     */
    private static final int SEGUNDOBYTE = 0xd8;

    /**
     * Penúltimo byte de arquivo jpeg.
     */
    private static final int PENULTIMOBYTE = 0xff;

    /**
     * Último byte de arquivo jpeg.
     */
    private static final int ULTIMOBYTE = 0xd9;


    /**
     * Construtor privado da classe para evitar instanciação.
     */
    private ConfereArquivoUtils() {

    }

    /**
     * Método que tem como função conferir se o
     * arquivo passado é um arquivo do tipo jpeg.
     *
     * @param caminho Caminho do arquivo que deve
     * ser analisado para saber se é jpeg.
     *
     * @return Retorna {@code true} se o arquivo for jpeg,
     * ou {@code false} se o arquivo não for jpeg.
     *
     * @throws IOException Se houver problema ao ler o caminho do arquivo.
     * @throws IllegalArgumentException Se o arquivo não existir
     * ou se houverem dados insuficientes no arquivo.
     */
    public static boolean confereByte(final String caminho)
    throws IOException {
        final File arquivo = new File(caminho);

        if (!arquivo.exists()) {
            throw new IllegalArgumentException(
                "O arquivo não existe.");
        }

        if (!arquivo.canRead()) {
            throw new IllegalArgumentException(
                "O arquivo não pode ser lido.");
        }

        if (arquivo.length() == 0) {
            throw new IllegalArgumentException(
                "Dados insuficientes no arquivo.");
        }

        final InputStream fis = Files.newInputStream(Paths.get(caminho));
        final DataInputStream dis = new DataInputStream(fis);

        final int valor1 = dis.readUnsignedByte();
        final int valor2 = dis.readUnsignedByte();

        if (valor1 != PRIMEIROBYTE && valor2 != SEGUNDOBYTE) {
            dis.close();
            return false;
        }

        final int getPenultimoByte = 4;
        dis.skip(arquivo.length() - getPenultimoByte);
        final int valor3 = dis.readUnsignedByte();
        final int valor4 = dis.readUnsignedByte();

        boolean jpeg = false;
        if (valor3 == PENULTIMOBYTE && valor4 == ULTIMOBYTE) {
            jpeg = true;
        }
        dis.close();

        return jpeg;
    }

    /**
     * Método com função de retornar string confirmando
     * se o arquivo passado como parâmetro é ou não jpeg.
     *
     * @param jpeg Boolean contendo {@code true} se for jpeg,
     *             ou {@code false} se não for jpeg.
     * @return Retorna string contendo mensagem de
     *         confirmação se o arquivo é ou não jpeg.
     */
    public static String arquivoJpeg(final boolean jpeg) {
        if (jpeg) {
            return "O arquivo passado é um jpeg.";
        } else {
            return "O arquivo passado não é um jpeg.";
        }
    }
}
