package com.github.gustavohenriquerssilva.cs.aula08.application.console;

import java.io.IOException;

import com.github.gustavohenriquerssilva.cs.aula08.domain.ConfereArquivoUtils;

/**
 * Tem finalidade da execução da classe ConfereArquivoUtils.
 */
public final class ProgramaJpeg {

    /**
     * Construtor privado da classe para evitar instanciação.
     */
    private ProgramaJpeg() {

    }

    /**
     * Confere se o arquivo é ou não jpeg.
     *
     * @param args Caminho do arquivo que deve ser informado.
     *
     * @throws IOException Se houver problema ao ler o caminho do arquivo.
     */
    public static void main(final String[] args) throws IOException {
        System.out.println(ConfereArquivoUtils.arquivoJpeg(
            ConfereArquivoUtils.ehArquivoJpeg(args[0])));
    }
}
