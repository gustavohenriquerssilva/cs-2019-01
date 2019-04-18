package com.github.gustavohenriquerssilva.cs.aula1;

public class Exercicios {

	public static void main(String[] args){
		int valorTestado = -10;
		boolean resultado = EhPropriedade3025(valorTestado);
		System.out.println(resultado);
	}
	
	public static boolean EhPropriedade3025(int valorTestado) {
		if(valorTestado > 9999 || valorTestado < 0) {
			throw new IllegalArgumentException("Valor inserido não pode ser menor que zero ou maior que 9999");
		}
		
		int centena = valorTestado / 100;
		int dezena = valorTestado % 100;
		int resultadoFinal = (centena + dezena)*(centena + dezena);
		return valorTestado == resultadoFinal;
	}
	
	public static boolean ehPropriedade153(int valorTestado) {
		if(valorTestado > 999 || valorTestado < 100){
			throw new IllegalArgumentException("Valor inserido não pode ser menor que 100 ou maior que 999");
		}
		
		int centena = valorTestado/100;
		int dezena = valorTestado%100;
		int centenaAux = dezena/10;
		int dezenaAux = dezena%10;
		
		int potencia1 = centena * centena * centena;
		int potencia2 = centenaAux * centenaAux * centenaAux;
		int potencia3 = dezenaAux * dezenaAux * dezenaAux;
		
		int resultadoFinal = potencia1 + potencia2 + potencia3;
		return valorTestado == resultadoFinal;
	}
	

	public static int obtenhaDiaDaSemana(int dia, int mes, int ano ) {
		if(dia > 31 || dia < 1) {
			throw new IllegalArgumentException("Dia inválido");
		}
		
		if(mes > 12 || mes < 1) {
			throw new IllegalArgumentException("Mês inválido");
		}
		
		if(ano < 1753){
			throw new IllegalArgumentException("Ano inválido");
		}
		
		if(mes == 1 || mes == 2) {
			mes = mes + 12; 
			ano = ano - 1; 
		}
		int x = dia + 1 * mes + (2*(mes + 1)/5) + ano + (ano/4) - (ano/100) + (ano/400);
		return x%7;
	}
	
	public static int obtenhaResto(int dividendo, int divisor) {
		if(divisor < 0 || dividendo <= 0) {
			throw new IllegalArgumentException("Divisor deve ser maior que 0 e dividendo deve ser maior ou igual a 0.");
		}
		
		int s = dividendo;
		while(divisor <= s ) {
			s = s - divisor;
		}
		
		return s;
	}
	
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
	
	private static double obtenhaRazaoAurea(int x, int y, int k) {
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
	
	private static boolean ehQuadradoPerfeito(int n) {
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
	
	private static int obtenhaRaizQuadrada(int n, int i) {
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
	
	private static boolean ehNumeroPrimo(int n) {
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
	
	private static int obtenhaMDC(int a, int b) {
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
	
	private static int obtenhaFibonacci(int n) {
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
	
	private static boolean ehCPFValido(int[] digitoCPF) {
		if(digitoCPF.length != 11) {
      			throw new IllegalArgumentException("É permitido somente CPF de 11 dígitos");
		}
		int j = (digitoCPF[0])+ (2*digitoCPF[1]) + (3*digitoCPF[2]) + (4*digitoCPF[3]) + (5*digitoCPF[4]) + (6*digitoCPF[5]) + (7*digitoCPF[6]) + (8*digitoCPF[7])  + (9*digitoCPF[8]);
		int k = (2*digitoCPF[1]) + (3*digitoCPF[2]) + (4*digitoCPF[3]) + (5*digitoCPF[4]) + (6*digitoCPF[5]) + (7*digitoCPF[6]) + (8*digitoCPF[7])  + (9*digitoCPF[8]) + (10*digitoCPF[9]);
		int dj = obtenhaResto(obtenhaResto(j, 11), 10);
		int dk = obtenhaResto(obtenhaResto(k, 11), 10);
		return (dj == digitoCPF[9] && dk == digitoCPF[10]);
		
	}	
	
	private static int[] obtenhaArray(String n) {
		String numeroEmTexto = n;
		int[] array = new int[11];
		for (int i = 0; i < numeroEmTexto.length(); i++) {
		    array[i] = Character.getNumericValue(numeroEmTexto.charAt(i));
		}
		return array;
	}
	
	private static boolean ehCPFValido2(int[] digitoCPF) {
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