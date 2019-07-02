package com.github.gustavohenriquerssilva.cs.aula08.domain;

import java.io.DataInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * Classe responsável por confetir
 * o arquivo passado é do tipo jpeg.
 */
public final class ConfereArquivoUtils {

    /**
     * Primeiro byte do arquivo jpeg.
     */
    private static final int PRIMEIRO_BYTE = 0xff;

    /**
     * Segundo byte do arquivo jpeg.
     */
    private static final int SEGUNDO_BYTE = 0xd8;

    /**
     * Penúltimo byte do arquivo jpeg.
     */
    private static final int PENULTIMO_BYTE = 0xff;

    /**
     * Último byte do arquivo jpeg.
     */
    private static final int ULTIMO_BYTE = 0xd9;


    /**
     * Construtor privado da classe.
     */
    private ConfereArquivoUtils() {

    }

    /**
     * Confere se arquivo passado é um arquivo do tipo jpeg.
     *
     * @param caminho Caminho do arquivo que deve
     * ser analisado
     *
     * @return Retorna {@code true} se o arquivo for jpeg,
     * ou {@code false} se o arquivo não for jpeg.
     *
     * @throws IOException Se houver problema ao ler o caminho do arquivo.
     * @throws IllegalArgumentException Se o arquivo não contiver dados para
     *                                  leitura.
     */
    public static boolean ehArquivoJpeg(final String caminho)
    throws IOException {
        final File arquivo = new File(caminho);

        if (arquivo.length() == 0) {
            throw new IllegalArgumentException(
                "Dados insuficientes no arquivo.");
        }

        final InputStream fis = Files.newInputStream(Paths.get(caminho));
        final DataInputStream dis = new DataInputStream(fis);

        final int aux1 = dis.readUnsignedByte();
        final int aux2 = dis.readUnsignedByte();

        if (aux1 != PRIMEIRO_BYTE && aux2 != SEGUNDO_BYTE) {
            dis.close();
            return false;
        }

        final int getPenultimoByte = 4;
        dis.skip(arquivo.length() - getPenultimoByte);
        final int aux3 = dis.readUnsignedByte();
        final int aux4 = dis.readUnsignedByte();

        boolean jpeg = false;
        if (aux3 == PENULTIMO_BYTE && aux4 == ULTIMO_BYTE) {
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
