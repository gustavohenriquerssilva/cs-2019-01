package com.github.gustavohenriquerssilva.cs.aula07;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SomaImparesTest {

    @Test
    public void testNumerosImpares() {
        int[] vetorTest1 = {1};
        int[] vetorTest2 = {0, 1, 2, 3, 4, 5, 6, 7 ,8, 9};
        int[] vetorTest3 = {10, 2, 2, 4};
        assertEquals(1, Exercicio7.obtenhaSomaImpares(vetorTest1));
        assertEquals(25, Exercicio7.obtenhaSomaImpares(vetorTest2));
        assertEquals(0, Exercicio7.obtenhaSomaImpares(vetorTest3));
    }
}