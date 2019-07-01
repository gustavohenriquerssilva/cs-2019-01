package com.github.gustavohenriquerssilva.cs.aula07;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class SomaImparesTest {

    @Test
    public void testNumerosImpares() {
        int[] vetorTest1 = {1};
        int[] vetorTest2 = {10, 2, 2, 4};
        assertEquals(1, Exercicio7.obtenhaSomaImpares(vetorTest1));
        assertEquals(0, Exercicio7.obtenhaSomaImpares(vetorTest2));
    }
}