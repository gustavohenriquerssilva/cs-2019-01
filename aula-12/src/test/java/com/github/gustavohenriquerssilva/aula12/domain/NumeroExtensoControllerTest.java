package com.github.gustavohenriquerssilva.aula12.domain;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import com.github.gustavohenriquerssilva.aula12.application.api.NumeroExtensoController;
import com.github.gustavohenriquerssilva.aula12.application.dto.NumeroDTO;


public class NumeroExtensoControllerTest {

    @Test
    public void zeroTest() {
        assertEquals(new NumeroDTO("zero").getNumero() , NumeroExtensoController.numeroExtenso("0").getNumero());
    }

    @Test
    public void cemTest() {
        assertEquals(new NumeroDTO("cem").getNumero() , NumeroExtensoController.numeroExtenso("100").getNumero());
    }

    @Test
    public void especiaisTest() {
        assertEquals(new NumeroDTO("dez").getNumero() , NumeroExtensoController.numeroExtenso("10").getNumero());
        assertEquals(new NumeroDTO("onze").getNumero() , NumeroExtensoController.numeroExtenso("11").getNumero());
        assertEquals(new NumeroDTO("quinze").getNumero() , NumeroExtensoController.numeroExtenso("15").getNumero());
        assertEquals(new NumeroDTO("cento e doze").getNumero() , NumeroExtensoController.numeroExtenso("112").getNumero());
        assertEquals(new NumeroDTO("mil e dezesseis").getNumero() , NumeroExtensoController.numeroExtenso("1016").getNumero());

    }

    @Test
    public void umDigitoTest() {
        assertEquals(new NumeroDTO("um").getNumero() , NumeroExtensoController.numeroExtenso("1").getNumero());
        assertEquals(new NumeroDTO("seis").getNumero() , NumeroExtensoController.numeroExtenso("6").getNumero());
    }

    @Test
    public void doisDigitosTest() {
        assertEquals(new NumeroDTO("vinte").getNumero() , NumeroExtensoController.numeroExtenso("20").getNumero());
        assertEquals(new NumeroDTO("vinte e um").getNumero() , NumeroExtensoController.numeroExtenso("21").getNumero());
        assertEquals(new NumeroDTO("trinta").getNumero() , NumeroExtensoController.numeroExtenso("30").getNumero());
        assertEquals(new NumeroDTO("trinta e seis").getNumero() , NumeroExtensoController.numeroExtenso("36").getNumero());
        assertEquals(new NumeroDTO("cinco").getNumero() , NumeroExtensoController.numeroExtenso("05").getNumero());
        assertEquals(new NumeroDTO("zero").getNumero() , NumeroExtensoController.numeroExtenso("00").getNumero());

    }

    @Test
    public void tresDigitosTest() {
        assertEquals(new NumeroDTO("cento e um").getNumero() , NumeroExtensoController.numeroExtenso("101").getNumero());
        assertEquals(new NumeroDTO("cento e vinte").getNumero() , NumeroExtensoController.numeroExtenso("120").getNumero());
        assertEquals(new NumeroDTO("cento e vinte e dois").getNumero() , NumeroExtensoController.numeroExtenso("122").getNumero());
        assertEquals(new NumeroDTO("duzentos").getNumero() , NumeroExtensoController.numeroExtenso("200").getNumero());
        assertEquals(new NumeroDTO("zero").getNumero() , NumeroExtensoController.numeroExtenso("000").getNumero());

    }

    @Test
    public void quatroDigitosTest() {
        assertEquals(new NumeroDTO("um mil").getNumero() , NumeroExtensoController.numeroExtenso("1000").getNumero());
        assertEquals(new NumeroDTO("mil e um").getNumero() , NumeroExtensoController.numeroExtenso("1001").getNumero());
        assertEquals(new NumeroDTO("dois mil").getNumero() , NumeroExtensoController.numeroExtenso("2000").getNumero());
        assertEquals(new NumeroDTO("dois mil e um").getNumero() , NumeroExtensoController.numeroExtenso("2001").getNumero());
        assertEquals(new NumeroDTO("três mil e vinte").getNumero() , NumeroExtensoController.numeroExtenso("3020").getNumero());
        assertEquals(new NumeroDTO("quatro mil e vinte e um").getNumero() , NumeroExtensoController.numeroExtenso("4021").getNumero());
        assertEquals(new NumeroDTO("quatro mil e cento e vinte e um").getNumero() , NumeroExtensoController.numeroExtenso("4121").getNumero());
        assertEquals(new NumeroDTO("mil e doze").getNumero() , NumeroExtensoController.numeroExtenso("1012").getNumero());
        assertEquals(new NumeroDTO("cento e um").getNumero() , NumeroExtensoController.numeroExtenso("0101").getNumero());
        assertEquals(new NumeroDTO("zero").getNumero() , NumeroExtensoController.numeroExtenso("0000").getNumero());
        assertEquals(new NumeroDTO("cento e um").getNumero() , NumeroExtensoController.numeroExtenso("0101").getNumero());
    }

    @Test
    public void entradasInvalidas(){
        assertThrows(IllegalArgumentException.class,
            () -> NumeroExtensoController.numeroExtenso("12345"));
            assertThrows(IllegalArgumentException.class,
            () -> NumeroExtensoController.numeroExtenso("-100"));
    }
}
