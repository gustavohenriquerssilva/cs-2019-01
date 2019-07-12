/*
 * Copyright (c) 2018.
 * Fábrica de Software - Instituto de Informática (UFG)
 * Creative Commons Attribution 4.0 International License.
 */

package com.github.gustavohenriquerssilva.aula11.domain;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

/**
 * Implementa métodos relacionados ao calendário.
 *
 * @author Gustavo Henrique Rodrigues Santos Silva
 */
public final class CalendarioUtils {

    /**
     * Construtor privado da classe.
     */
    private CalendarioUtils() {

    }

    /**
     * Obtém a diferença entre datas.
     *
     * @param dataInicial A data inicial informada na tela.
     * @param dataFinal   A data final informada na tela.
     * @return Quantidade de dias absoluta entre data inicial e final.
     *
     * @throws IllegalArgumentException Se data for inválida.
     */
    public static long getDiferencaEntreDatas(final LocalDate dataInicial,
                                              final LocalDate dataFinal) {

        try {
            return Math.abs(ChronoUnit.DAYS.between(dataInicial, dataFinal));
        } catch (IllegalArgumentException | DateTimeException
                | ArithmeticException ex) {
            throw new IllegalArgumentException("Data inválida", ex);
        }
    }

}
