/*
 * Copyright (c) 2016.
 * Fábrica de Software - Instituto de Informática (UFG)
 * Creative Commons Attribution 4.0 International License.
 */

package com.github.gustavohenriquerssilva.aula11.domain;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

public class CalendarioTest {

    @Test
    public void diferencaDiasController() {
        DiferencaDTO diferenca = new DiferencaDTO(2);
        assertEquals(diferenca, DiferencaController.diferencaDias("10-05-2019", "12-05-2019"));
    }

    @Test 
    public void 
}


