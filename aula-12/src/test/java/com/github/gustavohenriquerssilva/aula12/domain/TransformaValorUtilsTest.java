package com.github.gustavohenriquerssilva.aula12.domain;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TransformaValorUtilsTest {

    @Test
    public void zeroTest() {
        assertEquals("zero", TransformaValorUtils.getValorPorExtenso(0));
    }

    @Test
    public void cemTest() {
        assertEquals("cem", TransformaValorUtils.getValorPorExtenso(100));
    }

    @Test
    public void especiaisTest() {
        assertEquals("dez", TransformaValorUtils.getValorPorExtenso(10));
        assertEquals("onze", TransformaValorUtils.getValorPorExtenso(11));
        assertEquals("quinze", TransformaValorUtils.getValorPorExtenso(15));
        assertEquals("cento e doze", TransformaValorUtils.getValorPorExtenso(112));
        assertEquals("mil e dezesseis", TransformaValorUtils.getValorPorExtenso(1016));

    }

    @Test
    public void umDigitoTest() {
        assertEquals("um", TransformaValorUtils.getValorPorExtenso(1));
        assertEquals("seis", TransformaValorUtils.getValorPorExtenso(6));
    }

    @Test
    public void doisDigitosTest() {
        assertEquals("vinte", TransformaValorUtils.getValorPorExtenso(20));
        assertEquals("vinte e um", TransformaValorUtils.getValorPorExtenso(21));
        assertEquals("trinta", TransformaValorUtils.getValorPorExtenso(30));
        assertEquals("trinta e seis", TransformaValorUtils.getValorPorExtenso(36));
        assertEquals("cinco", TransformaValorUtils.getValorPorExtenso(05));
        assertEquals("zero", TransformaValorUtils.getValorPorExtenso(00));
    }

    @Test
    public void tresDigitosTest() {
        assertEquals("cento e um", TransformaValorUtils.getValorPorExtenso(101));
        assertEquals("cento e vinte", TransformaValorUtils.getValorPorExtenso(120));
        assertEquals("cento e vinte e dois", TransformaValorUtils.getValorPorExtenso(122));
        assertEquals("duzentos", TransformaValorUtils.getValorPorExtenso(200));
        assertEquals("zero", TransformaValorUtils.getValorPorExtenso(000));

    }

    @Test
    public void quatroDigitosTest() {
        assertEquals("um mil", TransformaValorUtils.getValorPorExtenso(1000));
        assertEquals("mil e um", TransformaValorUtils.getValorPorExtenso(1001));
        assertEquals("dois mil", TransformaValorUtils.getValorPorExtenso(2000));
        assertEquals("dois mil e um", TransformaValorUtils.getValorPorExtenso(2001));
        assertEquals("três mil e vinte", TransformaValorUtils.getValorPorExtenso(3020));
        assertEquals("quatro mil e vinte e um", TransformaValorUtils.getValorPorExtenso(4021));
        assertEquals("quatro mil e cento e vinte e um", TransformaValorUtils.getValorPorExtenso(4121));
        assertEquals("mil e doze", TransformaValorUtils.getValorPorExtenso(1012));
        assertEquals("zero", TransformaValorUtils.getValorPorExtenso(0000));
    }

    @Test
    public void entradasInvalidas() {
        assertThrows(IllegalArgumentException.class, () -> TransformaValorUtils.getValorPorExtenso(12345));
        assertThrows(IllegalArgumentException.class, () -> TransformaValorUtils.getValorPorExtenso(-100));
    }
}