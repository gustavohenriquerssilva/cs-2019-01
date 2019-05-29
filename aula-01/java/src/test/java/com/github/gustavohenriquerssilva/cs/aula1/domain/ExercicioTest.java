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
    public void diaDaSemanaValorCorretoQue0Mes1() {
        assertEquals(0, Exercicios.obtenhaDiaDaSemana(28, 01, 2019));
    }

    @Test
    public void diaDaSemanaValorCorretoQue0Mes2() {
        assertEquals(0, Exercicios.obtenhaDiaDaSemana(25, 02, 2019));
    }
    
    @Test
    public void diaDaSemanaValorCorretoQue0() {
    	assertEquals(0, Exercicios.obtenhaDiaDaSemana(20, 05, 2019));
    }
    
    @Test
    public void diaDaSemanaValorCorretoQue1() {
    	assertEquals(1, Exercicios.obtenhaDiaDaSemana(21, 05, 2019));
    }
    
    @Test
    public void diaDaSemanaValorCorretoQue2() {
    	assertEquals(2, Exercicios.obtenhaDiaDaSemana(22, 05, 2019));
    }
    
    @Test
    public void diaDaSemanaValorCorretoQue3() {
    	assertEquals(3, Exercicios.obtenhaDiaDaSemana(23, 05, 2019));
    }
    
    @Test
    public void diaDaSemanaValorCorretoQue4() {
    	assertEquals(4, Exercicios.obtenhaDiaDaSemana(24, 05, 2019));
    }
    
    @Test
    public void diaDaSemanaValorCorretoQue5() {
    	assertEquals(5, Exercicios.obtenhaDiaDaSemana(25, 05, 2019));
    }
    
    @Test
    public void diaDaSemanaValorCorreto6() {
    	assertEquals(6, Exercicios.obtenhaDiaDaSemana(26, 05, 2019));
    }

    
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
    public void SomaPrimeirosNaturaisCorreto() {
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

    @Test
    public void produtoDeInteirosUsandoSomasCorreto() {
        assertEquals(6, Exercicios.obtenhaProdutoDeInteirosUsandoSomas(2, 3));
    }

    @Test
    public void produtoDeInteirosComMultiplicadorMenorQue0() {
        assertThrows(IllegalArgumentException.class, () -> Exercicios.obtenhaProdutoDeInteirosUsandoSomas(-1, 2));
    }

    @Test
    public void produtoDeInteirosComMultiplicandoMenorQue0() {
        assertThrows(IllegalArgumentException.class, () -> Exercicios.obtenhaProdutoDeInteirosUsandoSomas(2, -1));
    }

    @Test
    public void potenciaCorreto() {
        assertEquals(8, Exercicios.obtenhaPotenciaUsandoAsSomas(2, 3));
    }

    @Test
    public void potenciaComBaseMenorQue0() {
        assertThrows(IllegalArgumentException.class, () -> Exercicios.obtenhaPotenciaUsandoAsSomas(-1, 2));
    }

    @Test
    public void potenciaComExpoenteMenorQue0() {
        assertThrows(IllegalArgumentException.class, () -> Exercicios.obtenhaPotenciaUsandoAsSomas(2, -2));
    }

    @Test
    public void valorPiCorreto() {
        assertEquals(3.121594652591011, Exercicios.obtenhaValorPi(50));
    }

    @Test
    public void valorPiPrecisaoMenorQue1() {
        assertThrows(IllegalArgumentException.class, () -> Exercicios.obtenhaValorPi(0));
    }

    @Test
    public void logaritimoNaturalCorreto() {
        assertEquals(6.0, Exercicios.obtenhaLogaritmoNatural(2, 2));
    }

    @Test
    public void logaritimoNaturalBaseMenorQue1() {
        assertThrows(IllegalArgumentException.class, () -> Exercicios.obtenhaLogaritmoNatural(0, 2));
    }

    @Test
    public void logaritimoNaturalkMenorQue2() {
        assertThrows(IllegalArgumentException.class, () -> Exercicios.obtenhaLogaritmoNatural(2, 1));
    }

    @Test
    public void razaoAureaCorreta() {
        assertEquals(1.6180339887498947, Exercicios.obtenhaRazaoAurea(1, 2, 1000));
    }

    @Test
    public void razaoAureaAnteriorMenorQue0() {
        assertThrows(IllegalArgumentException.class,
                () -> Exercicios.obtenhaRazaoAurea(-1, 2, 1000));
    }

    @Test
    public void razaoAureaPosteriorMenorQueAnterior() {
        assertThrows(IllegalArgumentException.class,
                () -> Exercicios.obtenhaRazaoAurea(2, 1, 1000));
    }

    @Test
    public void razaoAureaLimiteMenorQue1() {
        assertThrows(IllegalArgumentException.class,
                () -> Exercicios.obtenhaRazaoAurea(1, 2, 0));
    }

    @Test
    public void quadradoPerfeitoCorreto() {
        assertEquals(true, Exercicios.ehQuadradoPerfeito(4));
    }

    @Test
    public void quadradoPerfeitoIncorreto() {
        assertEquals(false, Exercicios.ehQuadradoPerfeito(3));
    }

    @Test
    public void quadradoPerfeitoEntradaMenorQue1() {
        assertThrows(IllegalArgumentException.class,
                () -> Exercicios.ehQuadradoPerfeito(0));
    }

    @Test
    public void raizQuadradaCorreta() {
        assertEquals(4, Exercicios.obtenhaRaizQuadrada(16, 100));
    }

    @Test
    public void raizQuadradaCorretaValorEntradaMenorQue0() {
        assertThrows(IllegalArgumentException.class,
                () -> Exercicios.obtenhaRaizQuadrada(-1, 5));
    }

    @Test
    public void numeroPrimoCorreto() {
        assertEquals(true, Exercicios.ehNumeroPrimo(7));
    }

    @Test
    public void numeroPrimoIncorreto() {
        assertEquals(false, Exercicios.ehNumeroPrimo(16));
    }

    @Test
    public void numeroPrimoValorEntradaMenorQue1() {
        assertThrows(IllegalArgumentException.class,
                () -> Exercicios.ehNumeroPrimo(0));
    }

    @Test
    public void crivoCasoCorreto() {
        assertEquals(false, Exercicios.crivoErastotenes(19));
    }

    @Test
    public void crivoIncorreto() {
        assertEquals(true, Exercicios.crivoErastotenes(18));
    }

    @Test
    public void crivonMenorQue2() {
        assertThrows(IllegalArgumentException.class,
                () -> Exercicios.crivoErastotenes(1));
    }

    @Test
    public void mdcCorreto() {
        assertEquals(3, Exercicios.obtenhaMDC1(12,9));
    }

    @Test
    public void mdcPrimeiroValorMenorQueSegundo() {
        assertThrows(IllegalArgumentException.class,
                () -> Exercicios.obtenhaMDC1(1, 5));
    }

    @Test
    public void mdcPrimeiroValorMenorQue1() {
        assertThrows(IllegalArgumentException.class,
                () -> Exercicios.obtenhaMDC1(0, 12));
    }

    @Test
    public void mdc2Correto() {
        assertEquals(3, Exercicios.obtenhaMDC2(12,9));
    }

    @Test
    public void mdc2PrimeiroValorMenorQueSegundo() {
        assertThrows(IllegalArgumentException.class,
                () -> Exercicios.obtenhaMDC2(1, 5));
    }

    @Test
    public void mdc2PrimeiroValorMenorQue1() {
        assertThrows(IllegalArgumentException.class,
                () -> Exercicios.obtenhaMDC2(0, 12));
    }


    @Test
    public void regraHornerCasoCorretp() {
        int vetor[] = {0, 1, 2};
        assertEquals(4, Exercicios.obtenhaValorDaRegraDeHorner(1, 2, vetor));
    }

    @Test
    public void regraHornerTotalMenorQue1() {
        int vetor[] = {0, 1, 2};
        assertThrows(IllegalArgumentException.class,
                () -> Exercicios.obtenhaValorDaRegraDeHorner(1, 0, vetor));
    }

    @Test
    public void obtenhaFibonacciCorreto() {
        assertEquals(8, Exercicios.obtenhaFibonacci(6));
    }

    @Test
    public void fibonacciCaso0() {
        assertEquals(0, Exercicios.obtenhaFibonacci(0));
    }

    @Test
    public void fibonacciCaso1() {
        assertEquals(1, Exercicios.obtenhaFibonacci(1));
    }

    @Test
    public void fibonaccinMenorQue0() {
        assertThrows(IllegalArgumentException.class,
                () -> Exercicios.obtenhaFibonacci(-1));
    }

    @Test
    public void cpf1CasoCorreto() {
        int cpf[] = {7, 4, 8, 3, 3, 8, 4, 3, 8, 7, 0};
        assertEquals(true, Exercicios.ehCPFValido(cpf));
    }

    @Test
    public void cpf1Incorreto1() {
        int cpf[] = {6, 3, 2, 3, 3, 6, 6, 9, 4, 0, 3};
        assertEquals(false, Exercicios.ehCPFValido(cpf));
    }

    @Test
    public void cpf1Incorreto2() {
        int cpf[] = {7, 4, 8, 3, 3, 8, 4, 3, 8, 8, 0};
        assertEquals(false, Exercicios.ehCPFValido(cpf));
    }

    @Test
    public void cpf2Correto() {
        int cpf[] = {7, 4, 8, 3, 3, 8, 4, 3, 8, 7, 0};
        assertEquals(true, Exercicios.ehCPFValido2(cpf));
    }

    @Test
    public void cpf2Incorreto1() {
        int cpf[] = {6, 3, 2, 3, 3, 6, 6, 9, 4, 0, 3};
        assertEquals(false, Exercicios.ehCPFValido2(cpf));
    }

    @Test
    public void cpf2Incorreto2() {
        int cpf[] = {7, 4, 8, 3, 3, 8, 4, 3, 8, 9, 1}; //cpf FALSE para teste
        assertEquals(false, Exercicios.ehCPFValido2(cpf));
    }

    @Test
    public void excecaoCpfNulo() {
        assertThrows(IllegalArgumentException.class,
                () -> Exercicios.ehCPFValido2(null));
    }

    @Test
    public void excecaoCpfTamanhoIncorreto() {
        int cpf[] = {1, 5, 4, 7, 3, 4, 1, 5, 7, 8, 7, 6}; //cpf de tamanho incorreto para teste
        assertThrows(IllegalArgumentException.class,
                () -> Exercicios.verificaExcecaoCpfInvalido(cpf));
    }

    @Test
    public void excecaoCpfDadosAcima9() {
        int cpf[] = {72, 4, 8, 3, 33, 8, 4, 63, 8, 7, 0};
        assertThrows(IllegalArgumentException.class,
                () -> Exercicios.verificaExcecaoCpfInvalido(cpf));
    }

    @Test
    public void excecaoCpfDadosAbaixo0() {
        int cpf[] = {7, -4, 8, 3, 33, 8, 4, 63, 8, 7, 0};
        assertThrows(IllegalArgumentException.class,
                () -> Exercicios.verificaExcecaoCpfInvalido(cpf));
    }

    @Test
    public void coberturaCemPorCento() {
        assertNotNull(new Exercicios());
    }

}
