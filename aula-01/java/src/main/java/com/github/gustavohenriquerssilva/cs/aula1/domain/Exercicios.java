package main.java.com.github.gustavohenriquerssilva.cs.aula1.domain;

public class Exercicios {

	/**
	 * Função que verifica se o quadrado da soma das dezenas da entrada resulta no
	 * próprio número
	 * 
	 * @param valorTestado O valor passado para ser avaliado.
	 * 
	 * @return Resposta se o valor corresponde a propriedade 3025.
	 * @throws IllegalArgumentException Se é menor que zero ou maior que 9999.
	 */
	public static boolean ehPropriedade3025(int valorTestado) {

		if(valorTestado > 9999 || valorTestado < 0) {
			throw new IllegalArgumentException("Valor inserido não pode ser " +
													"menor que zero ou maior que 9999");
		}
		
		final int centena = valorTestado/100;
		final int dezena = valorTestado%100;
		final int somaDosValores = centena + dezena;
		final int potencia = somaDosValores * somaDosValores;
		
		return valorTestado == potencia;
	}
	
	/**
	 * Verfica se o número passado satisfaz a propriedade 153
	 * 
	 * @param valorTestado O valor passado para ser avaliado.
	 * 
	 * @return Resposta se o valor corresponde a propriedade 3025.
	 * @throws IllegalArgumentException Se é menor que 100 ou maior que 999.
	 */
	public static boolean ehPropriedade153(int valorTestado) {

		if(valorTestado > 999 || valorTestado < 100){
			throw new IllegalArgumentException("Valor inserido não pode ser"
													+ "menor que 100 ou maior que 999");
		}
		
		final int centena = valorTestado/100;
		final int dezena = valorTestado%100;
		final int centenaAux = dezena/10;
		final int dezenaAux = dezena%10;
		
		final int potenciaCubica1 = centena * centena * centena;
		final int potenciaCubica2 = centenaAux * centenaAux * centenaAux;
		final int potenciaCubica3 = dezenaAux * dezenaAux * dezenaAux;
		
		final int resultadoFinal = potenciaCubica1 + potenciaCubica2 + potenciaCubica3;
		
		return valorTestado == resultadoFinal;
	}
	
	/**
	 * Algoritmo que define o dia da semana para uma data 
	 * 
	 * @param dia O dia avaliado.
	 * @param mes O mês avaliado.
	 * @param ano O ano avaliado
	 *
	 * @return Dia da semana corresponde ao dia, mês e ano passado.
	 * @throws IllegalArgumentException Se o dia menor que 1 ou maior que 31.
	 * @throws IllegalArgumentException Se o mês menor que 1 ou maior que 12.
	 * @throws IllegalArgumentException Se o ano menor que 1753.
	 */
	public static int obtenhaDiaDaSemana(int dia, int mes, int ano ) {

	    int maximoDiasNoMes = 31;
	    int minimoDiasNoMes = 1;
		final boolean ehDiaInvalido = dia > maximoDiasNoMes || dia < minimoDiasNoMes;
		if(ehDiaInvalido) {
			throw new IllegalArgumentException("Dia inválido");
		}

		int maximoMesesNoAno = 12;
		int minimoMesesNoAno = 1;
		final boolean ehMesInvalido = mes > maximoMesesNoAno || mes < minimoMesesNoAno;
		if(ehMesInvalido) {
			throw new IllegalArgumentException("Mês inválido");
		}

		int valorMinimoParaAno = 1754;
		final boolean ehAnoValido = ano < valorMinimoParaAno;
		if (ehAnoValido) {
			throw new IllegalArgumentException(
					"Ano deve ser maior que 1754");
		}

		int mesAuxiliar = mes;
		int anoAuxiliar = ano;
		if (mes == 1 || mes == 2) {
			final int mesMais = 12;
			final int anoMenos = 1;
			mesAuxiliar = mes + mesMais;
			anoAuxiliar = ano - anoMenos;
		}

		final int resultado = dia + (2 * mesAuxiliar)
				+ (3 * (mesAuxiliar + 1) / 5) + anoAuxiliar + (anoAuxiliar / 4)
				- (anoAuxiliar / 100) + (anoAuxiliar / 400);

		return resultado % 7;
	}
	
	/**
	 * Função matemática que retorna o resto da divisão
	 * 
	 * @param divisor O divisor da divisão
	 * @param dividendo O dividendo da divisão
	 *
	 * @return O resto da divisão
	 * @throws IllegalArgumentException Se o dividendo for menor que zero
	 * @throws IllegalArgumentException Se o divisor for menor que um
	 */
	public static int obtenhaResto(int dividendo, int divisor) {
		
		final boolean ehDividendoValido = dividendo < 0;
		if(ehDividendoValido) {
			throw new IllegalArgumentException("Dividendo deve ser "
													+ "maior ou igual a 0");
		}
		
		final boolean ehDivisorValido = divisor < 1;
		if(ehDivisorValido) {
			throw new IllegalArgumentException("Divisor deve ser maior que 0");
		}

		
		int s = dividendo;
		while(divisor <= s ) {
			s = s - divisor;
		}
		
		return s;
	}
	
	/**
	 * Função matemática que soma primeiros números naturais 
	 * 
	 * @param numero O valor a ser avaliado
	 *
	 * @return O somatório para os primeiros k naturais
	 * @throws IllegalArgumentException Se o numero for menor que um
	 *
	 */
	public static int obtenhaSomaPrimeirosNaturais(int numero) {

		if(numero < 1) {
			throw new IllegalArgumentException("É permitido somente números "
													+ "naturais e diferente de zero");
		}
		
		int index = 2;
		int soma = 1;
		while(index <= numero ) {
			soma = soma +  index;
			index++;
		}
		
		return soma;
	}
	
	/**
	 * Função matemática que obtém o fatorial de um número natural.
	 * 
	 * @param numero O valor a ser encontrado o fatorial corresponde
	 *
	 * @return O fatorial do número natural
	 * @throws IllegalArgumentException Se o numero for menor que um
	 */
	public static int obtenhaFatorial(int numero) {

		if(numero < 1) {
			throw new IllegalArgumentException("É permitido somente números "
													+ "naturais e diferente de zero");
		}
		
		int index = 2;
		int fatorial = 1;
		while(index <= numero ) {
			fatorial = fatorial*index;
			index++;
		}
		
		return fatorial;
	}
	
	/**
	 * Função matemática que obtém o produto de dois inteiros positivos
	 * 
	 * @param multiplicador O primeiro valor da multiplicação
	 * @param multiplicando O segundo valor da multiplicação
	 *
	 * @return O produto dos dois números
	 * @throws IllegalArgumentException Se o a ou b forem menores que zero
	 *
	 */
	public static int obtenhaProdutoDeInteirosUsandoSomas(int multiplicador, int multiplicando) {

		if(multiplicador < 0) {
			throw new IllegalArgumentException("Multiplicador deve "
													+ "ser maior que zero");
		}

		if(multiplicando < 0) {
			throw new IllegalArgumentException("Multiplicando deve "
													+ "ser maior que zero");
		}
		
		int totalParcelas = multiplicador;
		int parcela = multiplicando;
		if(multiplicando < multiplicador){
			totalParcelas = multiplicando;
			parcela = multiplicador;
		}
		
		int index = 1;
		int soma = 0;
		while(index <= totalParcelas) {
			soma = soma + parcela;
			index++;
		}
		
		return soma;
	}
	
	/**
	 * Função matemática que implementa potência usando apenas somas.
	 * 
	 * @param base O valor da base
	 * @param expoente O valor da potência
	 *
	 * @return O resultado da potencia
	 * @throws IllegalArgumentException Se o x ou y forem menores que zero
	 *
	 */
	public static int obtenhaPotenciaUsandoAsSomas(int base, int expoente) {

		if(base < 0 || expoente < 0) {
			throw new IllegalArgumentException("É permitido somente"
													+ " números naturais");
		}
		
		int potencia = 1;
		int index = 1;
		while(index <= expoente) {
			potencia = obtenhaProdutoDeInteirosUsandoSomas(potencia,  base);
			index++;
		}
		return potencia;
	}
	
	/**
	 * Função matemática que obtém valor de pi
	 * 
	 * @param precisao O valor de precisão para o pi
	 *
	 * @return O valor de pi
	 * @throws IllegalArgumentException Se o valor de precissão for menor que um
	 */
	public static double obtenhaValorPi(int precisao) {

		if (precisao < 1) {
			throw new IllegalArgumentException(
					"É permitido somente "
							+ "números maiores que um");
		}

		double sinal = -1;
		double divisor = -1;
		double piValor = 0;

		for (int contador = 1; contador <= precisao; contador++) {
			final int auxiliar = 4;
			divisor = divisor + 2;
			sinal = -1 * sinal;
			piValor = piValor + ((auxiliar * sinal) / divisor);
		}

		return piValor;
	}
	
	/** 
	 * Função matemática que obtém valor do logaritmo 
	 * 
	 * @param base O valor é númerador
	 * @param valorLogaritmo O valor é denominador
	 *
	 * @return O valor do logaritmo
	 * @throws IllegalArgumentException Se o valor base for menor que 1
	 * @throws IllegalArgumentException Se o valor valorLogaritmo for menor que 2
	 *
	 */
	public static double obtenhaLogaritmoNatural(int base, int valorLogaritmo) {

		if(base < 1) {
			throw new IllegalArgumentException("Base deve ser maior que zero");
		}

		if(valorLogaritmo < 2) {
			throw new IllegalArgumentException("Número logaritmo deve ser maior que um");
		}

		int contador = 2;
		double euler = (contador + base);
		double numerador = base;
		double denominador = 1;

		for (; contador <= valorLogaritmo; contador++) {
			numerador = numerador * numerador;
			denominador = denominador * contador;
			euler = euler + (numerador / denominador);
		}

		return euler;
	}
	
	/** 
	 * Função matemática que obtém razão áurea
	 * 
	 * @param anterior O valor do primeiro inteiro positivo
	 * @param posterior O valor do segundo inteiro positivo
	 * @param limite O valor da precisão desejada
	 *
	 * @return O valor da razão áurea
	 * @throws IllegalArgumentException Se o valor anterior for
	 * menor que zero ou posterior for menor que x ou limite for menor que 1
	 */
	public static double obtenhaRazaoAurea(int anterior, int posterior, int limite) {

		if (anterior < 0 || posterior < anterior || limite <= 0) {
			throw new IllegalArgumentException(
					"Valor anterior deve"
							+ " ser menor que 0"
							+ " posterior maior que anterior"
							+ " e limite maior que 0.");
		}

		double auxiliarPosterior = posterior;
		double auxiliarAnterior = anterior;

		for (int contador = 1; contador <= limite; contador++) {
			double troca = auxiliarPosterior;
			auxiliarPosterior = auxiliarPosterior
					+ auxiliarAnterior;
			auxiliarAnterior = troca;
		}

		return auxiliarPosterior / auxiliarAnterior;
	}
	
	/** 
	 * Função matemática diz que um quadrado perfeito n^2 satisfaz a equação.
	 * 
	 * @param valorEntrada O valor a ser testado.
	 *
	 * @return Retorna verdadeiro se o número fornecido é um quadrado perfeito.
	 * @throws IllegalArgumentException Se o valor valorEntrada for menor que 1.
	 *
	 */
	public static boolean ehQuadradoPerfeito(int valorEntrada) {

		if(valorEntrada < 1) {
			throw new IllegalArgumentException("É permitido somente números "
													+ "naturais e diferente de zero");
		}
		
		int index = 1;
		int soma = 1;
		while(soma < valorEntrada) {
			index = index + 2;
			soma = soma + index;
		}
		
		return soma == valorEntrada;
	}
	
	
	/** 
	 * Função matemática que obtém a raiz quadrada do valor
	 * 
	 * @param valorEntrada O valor de entrada
	 * @param precisao O valor de precisão
	 *
	 * @returns {boolean} Retorna verdadeiro se o número
	 * fornecido é um quadrado perfeito.
	 * @throws IllegalArgumentException Se o valor n for menor que zero.
	 *
	 */
	public static int obtenhaRaizQuadrada(int valorEntrada, int precisao) {

		if(valorEntrada < 0) {
			throw new IllegalArgumentException("É permitido somente "
													+"números naturais");
		}
		
		int raiz = 1;
		while(0 <= precisao) {
			raiz = (raiz + (valorEntrada/raiz)) / 2;
			precisao--;
		}
		
		return raiz;
	}
	
	/** 
	 * Função matemática que retorna se o valor é primo
	 * 
	 * @param numeroEntrada O valor de entrada
	 *
	 * @return Retorna verdadeiro se o número fornecido é primo
	 * @throws IllegalArgumentException Se o valor
	 * numeroEntrada for menor ou igual a um.
	 *
	 */
	public static boolean ehNumeroPrimo(int numeroEntrada) {

		if(numeroEntrada <= 1) {
			throw new IllegalArgumentException("É permitido somente "
													+ "números maiores que um");
		}
		
		int index = 2;
		while(index < numeroEntrada) {
			if(numeroEntrada%index == 0) {
				return false;
			}
			index++;
		}
		
		return true;
	}

	/**
	 * Função matemática que verifica se o número é primo.
	 *
	 * @param numeroEntrada O valor de entrada
	 *
	 * @return Retorna o valor {@code true} se for um número
	 * primo e o valor {@code false} caso não seja.
	 * @throws IllegalArgumentException Se numero
	 * não for maior ou igual a 2.
	 */
	public static boolean crivoErastotenes(final int numeroEntrada) {

		if (numeroEntrada < 2) {
			throw new IllegalArgumentException("Valor de entrada deve "
													+ "ser maior que 2");
		}

		int[] vetor = new int[numeroEntrada + 1];

		for (int contador = 1; contador < numeroEntrada + 1; contador++) {
			vetor[contador] = 0;
		}

		double limite = Math.floor(Math.sqrt(numeroEntrada));

		for (int contador = 2; contador <= limite; contador++) {
			if (vetor[contador] == 0) {
				int multiplo = contador + contador;
				while (multiplo <= numeroEntrada) {
					vetor[multiplo] = 1;
					multiplo = multiplo + contador;
				}
			}
		}

		return vetor[numeroEntrada] == 1;
	}
	
	/** 
	 * Função matemática que obtém o MDC entre dois inteiros positivos e
	 * não nulos é o maior valor dentre os divisores comuns entre eles.
	 * 
	 * @param primeiroValor O valor do primerio número a ser avaliado
	 * @param segundoValor O valor do segundo número a ser avaliado
	 *
	 * @return Retorna o mdc
	 * @throws IllegalArgumentException Se o valor n for menor ou igual a um.
	 *
	 */
	public static int obtenhaMDC1(int primeiroValor, int segundoValor) {

		if(segundoValor > primeiroValor || segundoValor < 1) {
			throw new IllegalArgumentException("Valores informados "
													+ "estão incorretos");
		}
		
		while(segundoValor != 0) {
			int resto = primeiroValor%segundoValor;
			primeiroValor = segundoValor;
			segundoValor = resto;
		}
		
		return primeiroValor;
	}

	/**
	 * Função matemática que calcula maior divisor comum.
	 *
	 * @param primeiroValor Número  maior divisor comum.
	 * @param segundoValor Número do maior divisor comum.
	 *
	 * @return Retorna maior divisor comum.
	 *
	 * @throws IllegalArgumentException Se primeiroValor não for
	 * maior ou igual a numeroDois ou se segundoValor
	 * não for maior que 0.
	 */
	public static int obtenhaMDC2(int primeiroValor, int segundoValor) {

		if (primeiroValor < segundoValor || segundoValor < 1) {
			throw new IllegalArgumentException(
					"Valores informados"
							+ "estão incorretor" );
		}

		int primeiroValorAux = primeiroValor;
		int segundoValorAux = segundoValor;
		while (primeiroValorAux != segundoValorAux) {
			if (primeiroValorAux > segundoValorAux) {
				primeiroValorAux = primeiroValorAux
						- segundoValorAux;
			} else {
				segundoValorAux = segundoValorAux
						- primeiroValorAux;
			}
		}

		return primeiroValorAux;
	}

	/**
	 * Função matemática com a regra de Horner para avaliação de polinômio.
	 *
	 * @param valor Número para cálculo da regra de Horner.
	 * @param total Número para cálculo da regra de Horner.
	 * @param vetor Vetor para cálculo da regra de Horner.
	 *
	 * @return Retorna regra de Horner.
	 *
	 * @throws IllegalArgumentException Se total não
	 * for maior ou igual a 1.
	 */
	public static double obtenhaValorDaRegraDeHorner(double valor,
													 int total, int[] vetor) {

		if (total < 1) {
			throw new IllegalArgumentException(
					"Valor total maior ou igual a 1.");
		}

		double polinomio = vetor[total];

		for (int contador = (total - 1); contador >= 0; contador--) {
			polinomio = polinomio * (valor + vetor[contador]);
		}

		return polinomio;
	}

	/**
	 * Função matemática para o cálculo de Fibonacci.
	 *
	 * @param valorEntrada Número de entrada para cálculo de Fibonacci.
	 * @return Retorna número de Fibonacci.
	 * @throws IllegalArgumentException Se numero não
	 * for maior ou igual a 0.
	 */
	public static int obtenhaFibonacci(int valorEntrada) {

		if(valorEntrada < 0) {
			throw new IllegalArgumentException("É permitido somente valor inteiro");
		}

		if (valorEntrada == 0 || valorEntrada == 1) {
			return valorEntrada;
		}

		int auxiliar = 0;
		int resultado = 1;

		for (int contador = 2; contador <= valorEntrada; contador++) {
			int troca = resultado;
			resultado = resultado + auxiliar;
			auxiliar = troca;
		}

		return resultado;
	}

	/**
	 * Função matemática para conferir CPF.
	 *
	 * @param digitoCPF Array com cpf para conferir.
	 * @return Retorna o true se o CPF for válido
	 */
	public static boolean ehCPFValido(int[] digitoCPF) {

		verificaExcecaoCpfInvalido(digitoCPF);

		final int segundaPosicao = 3;
		final int terceiraPosicao = 4;
		final int quartaPosicao = 5;
		final int quintaPosicao = 6;
		final int sextaPosicao = 7;
		final int setimaPosicao = 8;
		final int oitavaPosicao = 9;
		final int novaPosicao = 10;
		final int decimaPosicao = 11;

		final int primeiraComparacao = digitoCPF[0]
				+ 2 * (digitoCPF[1])
				+ 3 * (digitoCPF[2])
				+ 4 * (digitoCPF[segundaPosicao])
				+ 5 * (digitoCPF[terceiraPosicao])
				+ 6 * (digitoCPF[quartaPosicao])
				+ 7 * (digitoCPF[quintaPosicao])
				+ 8 * (digitoCPF[sextaPosicao])
				+ 9 * (digitoCPF[setimaPosicao]);

		final int segundaComparacao = digitoCPF[1]
				+ 2 * (digitoCPF[2])
				+ 3 * (digitoCPF[segundaPosicao])
				+ 4 * (digitoCPF[terceiraPosicao])
				+ 5 * (digitoCPF[quartaPosicao])
				+ 6 * (digitoCPF[quintaPosicao])
				+ 7 * (digitoCPF[sextaPosicao])
				+ 8 * (digitoCPF[setimaPosicao])
				+ 9 * (digitoCPF[oitavaPosicao]);

		final int vetorComparaUm = Math.floorMod(
				Math.floorMod(primeiraComparacao, decimaPosicao), novaPosicao);

		final int vetorComparaDois = Math.floorMod(
				Math.floorMod(segundaComparacao, decimaPosicao), novaPosicao);

		return (vetorComparaUm == digitoCPF[oitavaPosicao])
				&& (vetorComparaDois == digitoCPF[novaPosicao]);
	}


	
	public static boolean ehCPFValido2(int[] digitoCPF) {

		verificaExcecaoCpfInvalido(digitoCPF);

		final int sextaPosicao = 7;
		final int setimaPosicao = 8;
		final int oitavaPosicao = 9;
		final int novaPosicao = 10;
		final int decimaPosicao = 11;

		int aux1 = digitoCPF[setimaPosicao];
		int aux2 = digitoCPF[setimaPosicao];

		for (int contador = sextaPosicao; 0 <= contador; contador--) {
			aux1 = aux1 + digitoCPF[contador];
			aux2 = aux2 + aux1;
		}

		final int primeiraComparacao = Math.floorMod(
				Math.floorMod(aux2, decimaPosicao),
				novaPosicao);
		final int segundaComparacao = Math.floorMod(
				Math.floorMod((aux2 - aux1
						+ (oitavaPosicao * digitoCPF[oitavaPosicao])), decimaPosicao),
				novaPosicao);

		return (primeiraComparacao == digitoCPF[oitavaPosicao])
				&& (segundaComparacao == digitoCPF[novaPosicao]);
	}

	public static void verificaExcecaoCpfInvalido(int[] digitoCPF) {

		if (digitoCPF == null) {
			throw new IllegalArgumentException("CPF não informado");
		}

		if (digitoCPF.length != 11) {
			throw new IllegalArgumentException(
					"CPF deve ter exatos 11 digitos");
		}

		for (int contador = 0; contador < 11; contador++) {
			if (digitoCPF[contador] < 0
					|| digitoCPF[contador] > 9) {
				throw new IllegalArgumentException(
						"CPF incorreto, fora da formatação.");
			}
		}
	}
}
