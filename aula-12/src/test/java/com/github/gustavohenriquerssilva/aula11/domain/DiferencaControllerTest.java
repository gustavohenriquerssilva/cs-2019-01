package com.github.gustavohenriquerssilva.aula12.domain;
/*
 * Copyright (c) 2016.
 * Fábrica de Software - Instituto de Informática (UFG)
 * Creative Commons Attribution 4.0 International License.
 */


import com.github.gustavohenriquerssilva.aula12.application.DTO.DiferencaDTO;
import com.github.gustavohenriquerssilva.aula12.application.api.DiferencaController;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class DiferencaControllerTest {

    @Test
    public void diferencaDiasControllerTest() {
        DiferencaDTO diferenca = new DiferencaDTO(2);
        assertEquals(diferenca, DiferencaController.diferencaDias("10-05-2019", "12-05-2019"));
    }

    @Test
    public void diferencaDiasControlleDiasTest() {
        DiferencaDTO diferenca = new DiferencaDTO(2);
        assertEquals(diferenca.obtenhaDTODiferencaDias(), DiferencaController.diferencaDias("10-05-2019", "12-05-2019").obtenhaDTODiferencaDias());
    }

    @Test
    public void diferencaDiasControlleVerdadeiroTest() {
        DiferencaDTO diferenca = new DiferencaDTO(2);
        assertEquals(true, DiferencaController.diferencaDias("10-05-2019", "12-05-2019").equals(diferenca));
    }

    @Test
    public void diferencaDiasControlleFalseTest() {
        DiferencaDTO diferenca = new DiferencaDTO(3);
        assertEquals(false, DiferencaController.diferencaDias("10-05-2019", "12-05-2019").equals(diferenca));
    }

    @Test
    public void diferencaDiasControlleHashTrueTest() {
        DiferencaDTO diferenca = new DiferencaDTO(2);
        assertEquals(true, DiferencaController.diferencaDias("10-05-2019", "12-05-2019").hashCode() == diferenca.hashCode());
    }

    @Test
    public void diferencaDiasControlleHashFalseTest() {
        DiferencaDTO diferenca = new DiferencaDTO(3);
        assertEquals(false, DiferencaController.diferencaDias("10-05-2019", "12-05-2019").hashCode() == diferenca.hashCode());
    }

    @Test
    public void localDateFromStringTest() {
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate dataFormatada = LocalDate.parse("10-05-2019", fmt);
        assertEquals(dataFormatada, DiferencaController.localDateFromString("10-05-2019"));
    }

    @Test
    public void localDateFromStringNuloTest() {
        assertEquals(null, DiferencaController.localDateFromString(null));
    }

    @Test
    public void diferencaDiasPrimeiroNuloControllerTest() {
        assertThrows(IllegalArgumentException.class, () -> DiferencaController.diferencaDias(null, "10-05-2019" ));
    }

    @Test
    public void diferencaDiasSegundoNuloControllerTest() {
        assertThrows(IllegalArgumentException.class, () -> DiferencaController.diferencaDias("10-05-2019", null));
    }
}
