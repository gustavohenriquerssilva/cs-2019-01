package com.github.gustavohenriquerssilva.aula11.domain;

import com.github.gustavohenriquerssilva.aula11.application.dto.DiferencaDTO;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DiferencaDTOTest {

    @Test
    public void diferencaDTOTrueTest() {
        long diferenca = new DiferencaDTO(2).getDiferencaDias();

        assertEquals(2, diferenca);
    }
}
