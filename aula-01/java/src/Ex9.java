package com.github.gustavohenriquerssilva.cs.aula1;

public class Ex9 {
	public static void main(String[] args){
		int x = 2;
		double resultado = obtenhaValorPi(x);
		System.out.println(resultado);
	}
	
	
	public static double obtenhaValorPi(int x){
		if(x < 1){
			throw new IllegalArgumentException("É permitido somente números maiores que um");
		}
		int i = 1;
		int s = -1;
		int d = -1;
		double p = 0;
		while(i <= x){
			d = d + 2;
			s = -1 * s;
			p = p + ((4 * s)/d);
			i++;
		}
		return p;
	}
}
