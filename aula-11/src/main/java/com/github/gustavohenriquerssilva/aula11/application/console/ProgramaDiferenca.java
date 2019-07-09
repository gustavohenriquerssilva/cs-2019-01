/*
 * Copyright (c) 2016.
 * Fábrica de Software - Instituto de Informática (UFG)
 * Creative Commons Attribution 4.0 International License.
 */

package com.github.gustavohenriquerssilva.aula11.application.console;

import com.github.gustavohenriquerssilva.aula11.domain.Calendario;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Programa que exibe o dia da semana para o dia em que é executado.
 *
 */
public final class ProgramaDiferenca {

    private static final Logger logger =
            LogManager.getLogger(ProgramaDiferenca.class);

    /**
     * Restringe criação de instância.
     */
    private ProgramaDiferenca() {
        // Apenas evita criação de instância.
    }

    /**
     * Ponto de entrada da aplicação. Apenas para ilustra chamada de método.
     *
     * @param args Ignorados.
     */
    public static void main(final String[] args) {

        logger.info("iniciado");
        System.out.println(Calendario.diaDaSemanaParaHoje());;
    }

}
