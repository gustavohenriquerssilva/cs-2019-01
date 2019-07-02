package com.github.gustavohenriquerssilva.cs.aula08.domain;

import java.io.DataInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * Classe responsável pelo método byteFile.
 */
public final class InteiroUtils {

    /**
     * Construtor privado da classe.
     */
    private InteiroUtils() {

    }

    /**
     * Obtém os primeiros bytes em formato hexadecimal do arquivo recebido.
     *
     * @param caminho Caminho do arquivo que deve ser analisado para se obter os 4
     *                primeiros bytes.
     *
     * @return Retorna os 4 primeiros bytes do arquivo passado como parâmetro.
     *
     * @throws IllegalArgumentException Se o arquivo não existir ou se houverem
     *                                  dados insuficientes no arquivo.
     * @throws IOException              Se ocorrer exception de IO
     */
    public static String byteFile(final String caminho) throws IOException {

        final File arquivo = new File(caminho);

        if (!arquivo.exists()) {
            throw new IllegalArgumentException("O arquivo não existe");
        }

        final InputStream fis = Files.newInputStream(Paths.get(caminho));
        final DataInputStream dis = new DataInputStream(fis);

        final int valor = dis.readInt();

        dis.close();
        return Integer.toHexString(valor);

    }

}
