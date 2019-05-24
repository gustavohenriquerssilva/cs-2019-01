package main.java.com.github.gustavohenriquerssilva.cs.aula1.domain;

public class Exercicios {

	public static void main(String[] args){
		int valorTestado = 3025;
		boolean resultado = ehPropriedade3025(valorTestado);
		System.out.println(resultado);
	}
	
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
			throw new IllegalArgumentException("Valor inserido não pode ser" + "menor que 100 ou maior que 999");
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
		
		final boolean ehDiaInvalido = dia > 31 || dia < 1;			
		if(ehDiaInvalido) {
			throw new IllegalArgumentException("Dia inválido");
		}
		
		final boolean ehMesInvalido = mes > 12 || mes < 1;
		if(ehMesInvalido) {
			throw new IllegalArgumentException("Mês inválido");
		}
		
		final boolean ehAnoInvalido = ano < 1753;
		if(ehAnoInvalido){
			throw new IllegalArgumentException("Ano inválido");
		}
		
		if(mes == 1 || mes == 2) {
			mes = mes + 12; 
			ano = ano - 1; 
		}
		final int x = dia + 1 * mes + (2*(mes + 1)/5) + ano + (ano/4) - (ano/100) + (ano/400);
		
		return x%7;
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
			throw new IllegalArgumentException("Dividendo deve ser maior ou igual a 0");
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
			throw new IllegalArgumentException("É permitido somente números naturais e diferente de zero");
		}
		
		int i = 2;
		int s = 1;
		while(i <= numero ) {
			s = s +  i;
			i++;
		}
		
		return s;
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
			throw new IllegalArgumentException("É permitido somente números naturais e diferente de zero");
		}
		
		int i = 2;
		int f = 1;
		while(i <= numero ) {
			f = f*i;
			i++;
		}
		
		return f;
	}
	
	/**
	 * Função matemática que obtém o produto de dois inteiros positivos
	 * 
	 * @param a O primeiro valor da multiplicação
	 * @param b O segundo valor da multiplicação
	 *
	 * @return O produto dos dois números
	 * @throws IllegalArgumentException Se o a ou b forem menores que zero
	 *
	 */
	public static int obtenhaProdutoDeInteirosUsandoSomas(int x, int y) {
		if(x < 0 || y < 0) {
			throw new IllegalArgumentException("É permitido somente números naturais");
		}
		
		int totalParcelas = x;
		int parcela = y;
		if(y < x){
			totalParcelas = y;
			parcela = x;
		}
		
		int i = 1;
		int s = 0;
		while(i <= totalParcelas) {
			s = s + parcela;
			i++;
		}
		
		return s;
	}
	
	/**
	 * Função matemática que implementa potência usando apenas somas.
	 * 
	 * @param x O valor da base
	 * @param y O valor da potência
	 *
	 * @return O resultado da potencia
	 * @throws IllegalArgumentException Se o x ou y forem menores que zero
	 *
	 */
	public static int obtenhaPotenciaUsandoAsSomas(int x, int y) {
		if(x < 0 || y < 0) {
			throw new IllegalArgumentException("É permitido somente números naturais");
		}
		
		int potencia = 1;
		int i = 1;
		while(i <= y) {
			potencia = obtenhaProdutoDeInteirosUsandoSomas(potencia,  x);
			i++;
		}
		return potencia;
	}
	
	/**
	 * Função matemática que obtém valor de pi
	 * 
	 * @param valorDePrecisao O valor de precisão para o pi
	 *
	 * @return O valor de pi
	 * @throws IllegalArgumentException Se o valor de precissão for menor que um
	 */
	public static double obtenhaValorPi(int x) {
		if(x < 1) {
			throw new IllegalArgumentException("É permitido somente números maiores que um");
		}
		
		int i = 1;
		int s = -1;
		int d = -1;
		double p = 0;
		while(i <= x) {
			d = d + 2;
			s = -1 * s;
			p = p + ((4 * s)/d);
			i++;
		}
		
		return p;
	}
	
	/** 
	 * Função matemática que obtém valor do logaritmo 
	 * 
	 * @param n O valor é númerador
	 * @param k O valor é denominador
	 *
	 * @return O valor do logaritmo
	 * @throws IllegalArgumentException Se o valor n for menor que 1
	 * @throws IllegalArgumentException Se o valor k for menor que 2
	 *
	 */
	public static int obtenhaLogaritmoNatural(int n, int k) {
		if(n < 1) {
			throw new IllegalArgumentException("Numerador deve ser maior que zero");
		}
		
		if(k < 2) {
			throw new IllegalArgumentException("Denominador deve ser maior que um");
		}
		
		int i = 2;
		int e = 1 + n;
		int numerador = n;
		int denominador = 1;
		while(i <= k) {
			numerador = numerador * numerador;
			denominador = denominador * i;
			e = e + (numerador/denominador);
			i++;
		}
		
		return e;
	}
	
	/** 
	 * Função matemática que obtém razão áurea
	 * 
	 * @param x O valor do primeiro inteiro positivo
	 * @param y O valor do segundo inteiro positivo
	 * @param k O valor da precisão desejada
	 *
	 * @return O valor da razão áurea
	 * @throws IllegalArgumentException Se o valor x for menor que zero ou y for menor que x ou k for menor que 1
	 */
	public static double obtenhaRazaoAurea(int x, int y, int k) {
		if(x < 0 || x > y || k >= 0) {
			throw new IllegalArgumentException("x deve ser maior ou igual a 0, y deve ser maior que x e k maior que 0.");
		}
		
		double c = y;
		double a = x;
		int i = 1;
		while(i <= k) {
			double t = c;
			c = c+ a;
			a = t;
			i++;
		}
		
		return c/a;
	}
	
	/** 
	 * Função matemática diz que um quadrado perfeito n^2 satisfaz a equação.
	 * 
	 * @param n O valor a ser testado.
	 *
	 * @return Retorna verdadeiro se o número fornecido é um quadrado perfeito.
	 * @throws IllegalArgumentException Se o valor n for menor que 1.
	 *
	 */
	public static boolean ehQuadradoPerfeito(int n) {
		if(n < 1) {
			throw new IllegalArgumentException("É permitido somente números naturais e diferente de zero");
		}
		
		int i = 1;
		int s = 1;
		while(s < n) {
			i = i + 2;
			s = s + i;
		}
		
		return s == n;
	}
	
	
	/** 
	 * Função matemática que obtém a raiz quadrada do valor
	 * 
	 * @param n O valor de entrada 
	 * @param i O valor de precisão 
	 *
	 * @returns {boolean} Retorna verdadeiro se o número fornecido é um quadrado perfeito.
	 * @throws IllegalArgumentException Se o valor n for menor que zero.
	 *
	 */
	public static int obtenhaRaizQuadrada(int n, int i) {
		if(n < 0) {
			throw new IllegalArgumentException("É permitido somente números naturais");
		}
		
		int r = 1;
		while(0 <= i) {
			r = (r + (n/r)) / 2;
			i--;
		}
		
		return r;
	}
	
	/** 
	 * Função matemática que retorna se o valor é primo
	 * 
	 * @param n O valor de entrada 
	 *
	 * @return Retorna verdadeiro se o número fornecido é primo
	 * @throws IllegalArgumentException Se o valor n for menor ou igual a um.
	 *
	 */
	public static boolean ehNumeroPrimo(int n) {
		if(n <= 1) {
			throw new IllegalArgumentException("É permitido somente números maiores que um");
		}
		
		int i = 2;
		while(i < n) {
			if(n%i == 0) {
				return false;
			}
			i++;
		}
		
		return true;
	}
	
	/** 
	 * Função matemática que obtém o MDC entre dois inteiros positivos e não nulos é o maior valor dentre os divisores comuns entre eles.
	 * 
	 * @param a O valor do primerio número a ser avaliado
	 * @param b O valor do segundo número a ser avaliado
	 *
	 * @return Retorna o mdc
	 * @throws IllegalArgumentException Se o valor n for menor ou igual a um.
	 *
	 */
	public static int obtenhaMDC(int a, int b) {
		if(b > a || b <= 0) {
			throw new IllegalArgumentException("Valores informados estão incorretos");
		}
		
		while(b != 0) {
			int m = a%b;
			a = b;
			b = m;
		}
		
		return a;
	}
	
	public static int obtenhaFibonacci(int n) {
		if(n < 0) {
			throw new IllegalArgumentException("É permitido somente valor inteiro");
		}
		
		int a = 0;
		int c = 1;
		if(n == 0 || n == 1) {
			return n;
		}
		
		int i = 2;
		while(i <= n) {
			int t = c;
			c = c + a;
			a = t;
			i++;
		}
		
		return c;		
	}
	
	public static boolean ehCPFValido(int[] digitoCPF) {
		if(digitoCPF.length != 11) {
      			throw new IllegalArgumentException("É permitido somente CPF de 11 dígitos");
		}
		
		final int j = (digitoCPF[0])+ (2*digitoCPF[1]) + (3*digitoCPF[2]) + (4*digitoCPF[3]) + (5*digitoCPF[4]) + (6*digitoCPF[5]) + (7*digitoCPF[6]) + (8*digitoCPF[7])  + (9*digitoCPF[8]);
		final int k = (2*digitoCPF[1]) + (3*digitoCPF[2]) + (4*digitoCPF[3]) + (5*digitoCPF[4]) + (6*digitoCPF[5]) + (7*digitoCPF[6]) + (8*digitoCPF[7])  + (9*digitoCPF[8]) + (10*digitoCPF[9]);
		final int dj = obtenhaResto(obtenhaResto(j, 11), 10);
		final int dk = obtenhaResto(obtenhaResto(k, 11), 10);
		
		return (dj == digitoCPF[9] && dk == digitoCPF[10]);
	}	
	
	public static int[] obtenhaArray(String n) {
		final String numeroEmTexto = n;
		final int[] array = new int[11];
		
		for (int i = 0; i < numeroEmTexto.length(); i++) {
		    array[i] = Character.getNumericValue(numeroEmTexto.charAt(i));
		}
		
		return array;
	}
	
	public static boolean ehCPFValido2(int[] digitoCPF) {
		int c = 7;
		int p = digitoCPF[8];
		int s = digitoCPF[8];
		while(1 <= c) {
			p = p + digitoCPF[c];
			s = s + p;
			c--;
		}
		
		int j = obtenhaResto(obtenhaResto(s, 11), 10);
		int k = obtenhaResto(obtenhaResto(s - p + (9 * digitoCPF[9]), 11), 10);
		
		return j == digitoCPF[9] && k == digitoCPF[10];		
	}	
}
