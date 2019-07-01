package com.github.gustavohenriquerssilva.cs.aula07;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.Assert.*;

public class QuantidadePalavrasTest {

    @Test
    public void testObtenhaQtdPalavras() {
        String[] strTest1 = {"teste", "1001", "teste", "teste"};

        assertEquals(3, Exercicio7.obtenhaQtdPalavras("teste", strTest1));
    }

}