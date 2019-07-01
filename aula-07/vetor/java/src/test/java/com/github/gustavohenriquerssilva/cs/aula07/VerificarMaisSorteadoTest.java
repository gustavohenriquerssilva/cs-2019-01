package com.github.gustavohenriquerssilva.cs.aula07;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.hamcrest.collection.IsEmptyCollection;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.collection.IsCollectionWithSize.hasSize;
import static org.hamcrest.collection.IsIterableContainingInAnyOrder.containsInAnyOrder;
import static org.hamcrest.collection.IsIterableContainingInOrder.contains;
import static org.hamcrest.MatcherAssert.assertThat;

public class VerificarMaisSorteadoTest {

    int[] vetorTeste = {1, 2, 3, 4, 5, 6, 7 ,8, 9, 10};

    @Test
    void testVerificarMaisSorteado() {
        assertThat(Exercicio7.verificarMaisSorteado(), not(IsEmptyCollection.empty()));
    }

}