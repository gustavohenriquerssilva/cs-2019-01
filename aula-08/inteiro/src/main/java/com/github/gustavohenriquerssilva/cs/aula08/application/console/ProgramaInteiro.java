package com.github.gustavohenriquerssilva.cs.aula08.application.console;

import java.io.IOException;

import com.github.gustavohenriquerssilva.cs.aula08.domain.InteiroUtils;

/**
 * Criada para a execução da classe InteiroUtils.
 *
 * @author Gustavo Henrique Rodrigues Santos Silva
 */
public final class ProgramaInteiro {

    /**
     * Construtor privado da classe para evitar instanciação.
     */
    private ProgramaInteiro() {

    }

    /**
     * Execução do programa para mostrar os
     * 4 primeiros bytes de um arquivo.
     *
     * @param args Caminho do arquivo que deve ser informado.
     *
     * @throws IOException Se houver problema ao ler o caminho do arquivo.
     * @throws IllegalArgumentException Se não for passado nenhum parâmetro.
     */
    public static void main(final String[] args) throws IOException {
		System.console().writer().println(InteiroUtils.byteFile(args[0]));
    }
}
