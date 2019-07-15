/*
 * Copyright (c) 2016.
 * Fábrica de Software - Instituto de Informática (UFG)
 * Creative Commons Attribution 4.0 International License.
 */

package com.github.gustavohenriquerssilva.aula11.domain;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import static org.junit.jupiter.api.Assertions.*;

public class CalendarioUtilsTest {


    @Test
    public void diferencaDiasZero() {
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate dataIncial = LocalDate.parse("12-05-2019", fmt);
        LocalDate dataFinal = LocalDate.parse("12-05-2019", fmt);
        assertEquals(0, CalendarioUtils.getDiferencaEntreDatas(dataIncial, dataFinal));
    }

    @Test
    public void diferencaDiasContrario() {
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate dataIncial = LocalDate.parse("12-05-2019", fmt);
        LocalDate dataFinal = LocalDate.parse("10-05-2019", fmt);
        assertEquals(2, CalendarioUtils.getDiferencaEntreDatas(dataIncial, dataFinal));
    }

    @Test
    public void diferencaDiasCorreto() {
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate dataIncial = LocalDate.parse("10-05-2019", fmt);
        LocalDate dataFinal = LocalDate.parse("12-05-2019", fmt);
        assertEquals(2, CalendarioUtils.getDiferencaEntreDatas(dataIncial, dataFinal));
    }

    @Test
    public void CalendarioPrimeiroNuloTest() {
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate dataFinal = LocalDate.parse("12-05-2019", fmt);
        assertThrows(IllegalArgumentException.class, () ->
                CalendarioUtils.getDiferencaEntreDatas(null, dataFinal));
    }

    @Test
    public void CalendarioSegundoNuloTest() {
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate dataIncial = LocalDate.parse("10-05-2019", fmt);
        assertThrows(IllegalArgumentException.class, () ->
                CalendarioUtils.getDiferencaEntreDatas(dataIncial, null));
    }
}


