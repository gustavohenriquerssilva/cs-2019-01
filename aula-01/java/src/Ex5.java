package com.github.gustavohenriquerssilva.cs.aula1;

public class Ex5 {
	public static void main(String[] args){
		int x = 3;
		int resultado = obtenhaSomaPrimeirosNaturais(x);
		System.out.println(resultado);
	}
		
	public static int obtenhaSomaPrimeirosNaturais(int x){
		if(x < 1){
			throw new IllegalArgumentException("É permitido somente números naturais e diferente de zero");
		}
		int i = 2;
		int s = 1;
		while(i <= x ){
			s = s +  i;
			i++;
		}
		return s;
	}
}
