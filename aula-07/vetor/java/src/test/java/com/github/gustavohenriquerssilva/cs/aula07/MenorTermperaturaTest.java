package com.github.gustavohenriquerssilva.cs.aula07;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class MenorTermperaturaTest {

    @Test
    public void testObtenhaMenorTermperatura() {
        double[] vetorTest1 = {30.06};
        double[] vetorTest2 = {10, -10, 30};
        assertEquals(30.06, Exercicio7.obtenhaMenorTermperatura(vetorTest1));
        assertEquals(-10, Exercicio7.obtenhaMenorTermperatura(vetorTest2));
    }

}