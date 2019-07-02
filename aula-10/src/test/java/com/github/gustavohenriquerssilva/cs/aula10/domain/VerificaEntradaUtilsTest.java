package com.github.gustavohenriquerssilva.cs.aula10.domain;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class VerificaEntradaUtilsTest {
    
    String[] teste1 = {"2010101", "1", "23450101", "1"};
    String[] teste2 = {"100000101", "", "23450101", "1"};
    String[] teste3 = {"20161301", "", "23450101", "1"};
    String[] teste4 = {"20160001", "", "23450101", "1"};
    String[] teste5 = {"20160931", "", "23450101", "1"};
    String[] teste6 = {"20160900", "", "23450101", "1"};
    String[] teste7 = {"", "0", "23450101", "1"};
    String[] teste8 = {"", "-1", "23450101", "1"};
    String[] teste9 = {"", "", "20191232", "1"};
    String[] teste10 = {"", "", "23450101", "-1"};
    String[] teste11 = {"", "", "23450101", "7"};
    String[] teste12 = {"20160928", "2016", "20160928", "2"};
    String[] teste13 = {"20160301", "2016", "20160228", "6"};
    String[] teste14 = {"20160331", "2018", "20160331", "3"};
    String[] teste15 = {"2018", "20160331", "3"};
    String[] teste16 = {"a", "2018", "20160331", "3"};
    String[] teste17 = {"20160331", "2018", "20160331", "-3"};
    String[] teste18 = {"20160331", "2018", "20160331", "7"};
    String[] teste19 = {"20160331", "0", "20160331", "3"};
    String[] teste20 = {"20160331", "2018", "20160332", "3"};
    String[] teste21 = {"20190229", "2018", "20190301", "3"};

    @Test
    void testVerifiqueTamanhoArg() {
        assertEquals(-1, VerificaEntradaUtils.verifiqueTamanhoArg(teste15));
    }

    @Test
    void testEhInteiro() {
        assertEquals(-1, VerificaEntradaUtils.ehInteiro(teste16));
        assertEquals(-1, VerificaEntradaUtils.ehInteiro(teste17));
    }

    @Test
    void testVerifiqueSemana() {
        assertEquals(-1, VerificaEntradaUtils.verifiqueSemana(7));
    }

    @Test
    void testVerifiqueAnoBisexto() {
        assertEquals(-1, VerificaEntradaUtils.verifiqueAnoBisexto(0));
    }

    @Test
    void testVerifiqueData() {
        assertEquals(-1, VerificaEntradaUtils.verifiqueData("00190615", 2018));
        assertEquals(-1, VerificaEntradaUtils.verifiqueData("20190015", 2018));
        assertEquals(-1, VerificaEntradaUtils.verifiqueData("20191315", 2018));
        assertEquals(-1, VerificaEntradaUtils.verifiqueData("20190600", 2018));
        assertEquals(-1, VerificaEntradaUtils.verifiqueData("20190632", 2018));
    }

    @Test
    void testValidadorEntrada() {
        assertEquals(-1, VerificaEntradaUtils.verifiqueValor(teste1));
        assertEquals(-1, VerificaEntradaUtils.verifiqueValor(teste2));
        assertEquals(-1, VerificaEntradaUtils.verifiqueValor(teste3));
        assertEquals(-1, VerificaEntradaUtils.verifiqueValor(teste4));
        assertEquals(-1, VerificaEntradaUtils.verifiqueValor(teste5));
        assertEquals(-1, VerificaEntradaUtils.verifiqueValor(teste6));
        assertEquals(-1, VerificaEntradaUtils.verifiqueValor(teste7));
        assertEquals(-1, VerificaEntradaUtils.verifiqueValor(teste8));
        assertEquals(-1, VerificaEntradaUtils.verifiqueValor(teste9));
        assertEquals(-1, VerificaEntradaUtils.verifiqueValor(teste10));
        assertEquals(-1, VerificaEntradaUtils.verifiqueValor(teste11));
        assertEquals(1, VerificaEntradaUtils.verifiqueValor(teste12));
        assertEquals(1, VerificaEntradaUtils.verifiqueValor(teste13));
        assertEquals(1, VerificaEntradaUtils.verifiqueValor(teste14));
        assertEquals(-1, VerificaEntradaUtils.verifiqueValor(teste15));
        assertEquals(-1, VerificaEntradaUtils.verifiqueValor(teste18));
        assertEquals(-1, VerificaEntradaUtils.verifiqueValor(teste19));
        assertEquals(-1, VerificaEntradaUtils.verifiqueValor(teste20));
        assertEquals(-1, VerificaEntradaUtils.verifiqueValor(teste21));
    }

}
