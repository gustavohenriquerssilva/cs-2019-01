package com.github.gustavohenriquerssilva.cs.aula07;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.Assert.*;

public class QuantidadeElementosIguaisTest {

    double[] vetorTest1 = { 1, 2, 3, 1, 1, 2 };
    double[] vetorTest2 = { 0, 1, 0, 1, 1.1 };

    @Test
    public void testObtenhaQtdElementosIguais() {

        assertEquals(3, Exercicio7.obtenhaQtdElementosIguais(vetorTest1, 1));
        assertEquals(2, Exercicio7.obtenhaQtdElementosIguais(vetorTest2, 0));
    }

}