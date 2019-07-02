package com.github.gustavohenriquerssilva.cs.aula10.domain;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DiaDaSemanaUtilsTest {

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
    String[] teste15 = {"20160131", "2016", "20160331", "3"};
    String[] teste16 = {"20150131", "2016", "20160331", "5"};
    String[] teste17 = {"20160331", "2016", "20150131", "5"};
    String[] teste18 = {"2018", "20160331", "3"};
    String[] teste19 = {"a", "2018", "20160331", "3"};
    String[] teste20 = {"20160331", "2018", "20160331", "-3"};
    String[] teste21 = {"20160331", "2018", "20160331", "7"};
    String[] teste22 = {"20160331", "0", "20160331", "3"};
    String[] teste23 = {"20160331", "2018", "20160332", "3"};

    @Test
    void testEhBisexto() {
        assertTrue(DiaDaSemanaUtils.ehAnoBisexto(2015, 2015));
        assertTrue(DiaDaSemanaUtils.ehAnoBisexto(2019, 2015));
        assertFalse(DiaDaSemanaUtils.ehAnoBisexto(2018, 2015));
        assertTrue(DiaDaSemanaUtils.ehAnoBisexto(2000, 1996));
        assertFalse(DiaDaSemanaUtils.ehAnoBisexto(1700, 1692));
    }

    @Test
    void testObtenhaUltDiaMes() {
        assertEquals(31, DiaDaSemanaUtils.obtenhaUltDiaDoMes(1, 2015, 2015));
        assertEquals(29, DiaDaSemanaUtils.obtenhaUltDiaDoMes(2, 2015, 2015));
        assertEquals(28, DiaDaSemanaUtils.obtenhaUltDiaDoMes(2, 2015, 2014));
        assertEquals(29, DiaDaSemanaUtils.obtenhaUltDiaDoMes(2, 1999, 1995));
        assertEquals(31, DiaDaSemanaUtils.obtenhaUltDiaDoMes(3, 2015, 2015));
        assertEquals(30, DiaDaSemanaUtils.obtenhaUltDiaDoMes(4, 2015, 2015));
        assertEquals(31, DiaDaSemanaUtils.obtenhaUltDiaDoMes(5, 2015, 2015));
        assertEquals(30, DiaDaSemanaUtils.obtenhaUltDiaDoMes(6, 2015, 2015));
        assertEquals(31, DiaDaSemanaUtils.obtenhaUltDiaDoMes(7, 2015, 2015));
        assertEquals(31, DiaDaSemanaUtils.obtenhaUltDiaDoMes(8, 2015, 2015));
        assertEquals(30, DiaDaSemanaUtils.obtenhaUltDiaDoMes(9, 2015, 2015));
        assertEquals(31, DiaDaSemanaUtils.obtenhaUltDiaDoMes(10, 2015, 2015));
        assertEquals(30, DiaDaSemanaUtils.obtenhaUltDiaDoMes(11, 2015, 2015));
        assertEquals(31, DiaDaSemanaUtils.obtenhaUltDiaDoMes(12, 2015, 2015));
        assertEquals(0, DiaDaSemanaUtils.obtenhaUltDiaDoMes(0, 2015, 2015));
    }

    @Test
    void testObtenhaDataMaior() {
        assertEquals(0, DiaDaSemanaUtils.obtenhaDataMaior("20180215", "20180215"));
        assertEquals(1, DiaDaSemanaUtils.obtenhaDataMaior("20180215", "20180216"));
        assertEquals(-1, DiaDaSemanaUtils.obtenhaDataMaior("20180215", "20180214"));
        assertEquals(1, DiaDaSemanaUtils.obtenhaDataMaior("20180215", "20180315"));
        assertEquals(-1, DiaDaSemanaUtils.obtenhaDataMaior("20180215", "20180114"));
        assertEquals(1, DiaDaSemanaUtils.obtenhaDataMaior("20180215", "20190215"));
        assertEquals(-1, DiaDaSemanaUtils.obtenhaDataMaior("20180215", "20170214"));
    }

    @Test
    void testExecutaPrograma() {
        assertEquals(-1, DiaDaSemanaUtils.executaPrograma(teste1));
        assertEquals(-1, DiaDaSemanaUtils.executaPrograma(teste2));
        assertEquals(-1, DiaDaSemanaUtils.executaPrograma(teste3));
        assertEquals(-1, DiaDaSemanaUtils.executaPrograma(teste4));
        assertEquals(-1, DiaDaSemanaUtils.executaPrograma(teste5));
        assertEquals(-1, DiaDaSemanaUtils.executaPrograma(teste6));
        assertEquals(-1, DiaDaSemanaUtils.executaPrograma(teste7));
        assertEquals(-1, DiaDaSemanaUtils.executaPrograma(teste8));
        assertEquals(-1, DiaDaSemanaUtils.executaPrograma(teste9));
        assertEquals(-1, DiaDaSemanaUtils.executaPrograma(teste10));
        assertEquals(-1, DiaDaSemanaUtils.executaPrograma(teste11));
        assertEquals(2, DiaDaSemanaUtils.executaPrograma(teste12));
        assertEquals(1, DiaDaSemanaUtils.executaPrograma(teste13));
        assertEquals(3, DiaDaSemanaUtils.executaPrograma(teste14));
        assertEquals(6, DiaDaSemanaUtils.executaPrograma(teste15));
        assertEquals(0, DiaDaSemanaUtils.executaPrograma(teste16));
        assertEquals(3, DiaDaSemanaUtils.executaPrograma(teste17));
        assertEquals(-1, DiaDaSemanaUtils.executaPrograma(teste18));
        assertEquals(-1, DiaDaSemanaUtils.executaPrograma(teste19));
        assertEquals(-1, DiaDaSemanaUtils.executaPrograma(teste20));
        assertEquals(-1, DiaDaSemanaUtils.executaPrograma(teste21));
        assertEquals(-1, DiaDaSemanaUtils.executaPrograma(teste22));
        assertEquals(-1, DiaDaSemanaUtils.executaPrograma(teste23));
    }

    @Test
    void testAvancaERecuaData() {
        assertEquals(1, DiaDaSemanaUtils.avancaData("20190101", "20190102", 2018));
        assertEquals(0, DiaDaSemanaUtils.avancaData("20190101", "20190101", 2018));
        assertEquals(1, DiaDaSemanaUtils.recuaData("20190102", "20190101", 2018));
        assertEquals(0, DiaDaSemanaUtils.recuaData("20190101", "20190101", 2018));
    }
}
