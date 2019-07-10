/*
 * Copyright (c) 2018.
 * Fábrica de Software - Instituto de Informática (UFG)
 * Creative Commons Attribution 4.0 International License.
 */

package com.github.gustavohenriquerssilva.aula11.domain;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

/**
 * Reúne a diferença entre datas
 */
public class CalendarioUtils {

    /**
     * Construtor privado da classe.
     */
    private CalendarioUtils() {

    }

    /**
     * Obtém a diferença entre datas
     *
     * @param dataInicial Ignorados.
     * @param dataFinal   Ignorados.
     * @return Diferença de dias entre a data inicial e final
     */
    public static long getDiferencaEntreDatas(final LocalDate dataInicial,
                                              final LocalDate dataFinal) {

        return ChronoUnit.DAYS.between(dataInicial, dataFinal);
    }
}
