package test.java.com.github.gustavohenriquerssilva.cs.aula1.domain;

import org.junit.jupiter.api.Test;

import main.java.com.github.gustavohenriquerssilva.cs.aula1.domain.Exercicios;

import static org.junit.jupiter.api.Assertions.*;

class ExercicioTest {
	
	@Test
	public void propriedade3025ValorCorreto() {
        assertEquals(true, Exercicios.ehPropriedade3025(3025));
    }

    @Test
    public void propriedade3025ValorErrado() {
        assertEquals(false, Exercicios.ehPropriedade3025((56)));
    }

    @Test
    public void propriedade3025NumeroMenorQue0() {
        assertThrows(IllegalArgumentException.class, () -> Exercicios.ehPropriedade3025((-1)));
    }

    @Test
    public void propriedade3025NumeroMaiorQue9999() {
        assertThrows(IllegalArgumentException.class, () ->Exercicios.ehPropriedade3025((10000)));
    }
    
    @Test
    public void propriedade153ValorCorreto() {
    	assertEquals(true, Exercicios.ehPropriedade153(153));
    }
    
    @Test
    public void propriedade153ValorErrado() {
    	assertEquals(false, Exercicios.ehPropriedade153(154));
    }
    
    @Test
    public void propriedade153NumeroMenorQue100() {
    	assertThrows(IllegalArgumentException.class, () -> Exercicios.ehPropriedade153(99));
    }
    
    @Test
    public void propriedade153NumeroMaiorQue999() {
    	assertThrows(IllegalArgumentException.class,() -> Exercicios.ehPropriedade153(1000));
    }
    
    @Test
    public void diaDaSemanaValorCorretoQue0() {
    	assertEquals(0, Exercicios.obtenhaDiaDaSemana(19, 05, 2019));
    }
    
    @Test
    public void diaDaSemanaValorCorretoQue1() {
    	assertEquals(1, Exercicios.obtenhaDiaDaSemana(20, 05, 2019));
    }
    
    @Test
    public void diaDaSemanaValorCorretoQue2() {
    	assertEquals(2, Exercicios.obtenhaDiaDaSemana(21, 05, 2019));
    }
    
    @Test
    public void diaDaSemanaValorCorretoQue3() {
    	assertEquals(3, Exercicios.obtenhaDiaDaSemana(22, 05, 2019));
    }
    
    @Test
    public void diaDaSemanaValorCorretoQue4() {
    	assertEquals(4, Exercicios.obtenhaDiaDaSemana(23, 05, 2019));
    }
    
    @Test
    public void diaDaSemanaValorCorretoQue5() {
    	assertEquals(5, Exercicios.obtenhaDiaDaSemana(24, 05, 2019));
    }
    
    @Test
    public void diaDaSemanaValorCorreto6() {
    	assertEquals(6, Exercicios.obtenhaDiaDaSemana(25, 05, 2019));
    }
    
    //TODO COM VALOR 7
    
    @Test
    public void diaMenorQue1() {
    	assertThrows(IllegalArgumentException.class, () -> Exercicios.obtenhaDiaDaSemana(-1, 05, 2019));
    }
    
    @Test
    public void diaMaiorQue31() {
    	assertThrows(IllegalArgumentException.class, () -> Exercicios.obtenhaDiaDaSemana(32, 05, 2019));
    }
    
    @Test
    public void mesMenorQue1() {
    	assertThrows(IllegalArgumentException.class, () -> Exercicios.obtenhaDiaDaSemana(1, -1, 2019));
    }
    
    @Test
    public void mesMaiorQue12() {
    	assertThrows(IllegalArgumentException.class, () -> Exercicios.obtenhaDiaDaSemana(1, 13, 2019));
    }
    
    @Test
    public void anoMenorQue1753() {
    	assertThrows(IllegalArgumentException.class, () -> Exercicios.obtenhaDiaDaSemana(1, 13, 1500));
    }
    
    @Test
    public void restoValorCorreto() {
    	assertEquals(1, Exercicios.obtenhaResto(9, 2));
    }
    
    @Test
    public void restoComDividendoMenorQue0() {
    	assertThrows(IllegalArgumentException.class, () -> Exercicios.obtenhaResto(-1, 5));
    }
    
    @Test
    public void restoComDivisorMenorQue1() {
    	assertThrows(IllegalArgumentException.class, () -> Exercicios.obtenhaResto(1, 0));
    }
    
    @Test
    public void SomaPrimeirosNaturais() {
    	assertEquals(10, Exercicios.obtenhaSomaPrimeirosNaturais(4));
    }
    
    @Test
    public void restoComDivisorValorMenorQue1() {
    	assertThrows(IllegalArgumentException.class, () -> Exercicios.obtenhaSomaPrimeirosNaturais(0));
    }
    
    @Test
    public void fatorialValorCorreto() {
    	assertEquals(6, Exercicios.obtenhaFatorial(3));
    }
    
    @Test
    public void fatorialValorMenorQue1() {
    	assertThrows(IllegalArgumentException.class, () -> Exercicios.obtenhaFatorial(0));
    }
}
