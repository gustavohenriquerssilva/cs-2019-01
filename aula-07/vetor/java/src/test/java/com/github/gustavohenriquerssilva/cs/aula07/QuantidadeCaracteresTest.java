package com.github.gustavohenriquerssilva.cs.aula07;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.Assert.*;

public class QuantidadeCaracteresTest {

    @Test
    public void testObtenhaQtdCaracteres() {
        String strTest1 = "Teste teste!!!";
        String strTest2 = "010101";

        assertEquals(10, Exercicio7.obtenhaQtdCaracteres(strTest1));
        assertEquals(0, Exercicio7.obtenhaQtdCaracteres(strTest2));
    }

}