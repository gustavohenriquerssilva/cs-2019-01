package com.github.gustavohenriquerssilva.aula11.domain;
/*
 * Copyright (c) 2016.
 * Fábrica de Software - Instituto de Informática (UFG)
 * Creative Commons Attribution 4.0 International License.
 */


import com.github.gustavohenriquerssilva.aula11.application.dto.DiferencaDTO;
import com.github.gustavohenriquerssilva.aula11.application.api.DiferencaController;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class DiferencaControllerTest {

    @Test
    public void diferencaDiasControlleDiasTest() {
        long diferencaEsperada = new DiferencaDTO(2).getDiferencaDias();
        long diferenca = DiferencaController.diferencaDias("10-05-2019",
                "12-05-2019").getDiferencaDias();

        assertEquals(diferencaEsperada, diferenca);
    }

    @Test
    public void localDateFromStringTest() {
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate dataFormatada = LocalDate.parse("10-05-2019", fmt);
        assertEquals(dataFormatada, DiferencaController.localDateFromString("10-05-2019"));
    }

    @Test
    public void localDateFromStringNuloTest() {
        assertEquals(null,
                DiferencaController.localDateFromString(null));
    }

    @Test
    public void diferencaDiasPrimeiroNuloControllerTest() {
        assertThrows(IllegalArgumentException.class, () ->
                DiferencaController.diferencaDias(null, "10-05-2019"));
    }

    @Test
    public void diferencaDiasSegundoNuloControllerTest() {
        assertThrows(IllegalArgumentException.class, () ->
                DiferencaController.diferencaDias("10-05-2019", null));
    }

    @Test
    public void diferencaDiasForaDoFormatoTest() {
        assertThrows(IllegalArgumentException.class, () ->
                DiferencaController.diferencaDias("-2", null));
    }

    @Test
    public void diferencaDiasNuloControllerTest() {
        assertThrows(IllegalArgumentException.class, () ->
                DiferencaController.diferencaDias(null, null));
    }
}
