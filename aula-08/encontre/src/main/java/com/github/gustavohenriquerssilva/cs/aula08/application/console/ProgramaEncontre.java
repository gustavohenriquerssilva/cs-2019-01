package com.github.gustavohenriquerssilva.cs.aula08.application.console;

import java.io.IOException;

import com.github.gustavohenriquerssilva.cs.aula08.domain.EncontreUtils;

/**
 * Tem a finalidade de execução da classe EncontreUtils.
 * 
 * @author Gustavo Henrique Rodrigues Santos Silva
 */
public final class ProgramaEncontre {

    /**
     * Construtor privado da classe ProgramaEncontre.
     */
    private ProgramaEncontre() {

    }

    /**
     * Encontra a palavra chave no arquivo e imprime 
     * a quantidade e os locais que é encotrado.
     *
     * @param args Caminho do arquivo e palavra a ser analizada.
     *
     * @throws IOException Se houver problema ao ler caminho do arquivo.
     */
    public static void main(final String[] args) throws IOException {
        System.out.println(EncontreUtils.obtenhaResultado(args[0], args[1]));
    }
}
