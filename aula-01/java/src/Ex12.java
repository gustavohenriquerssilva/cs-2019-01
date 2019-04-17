package com.github.gustavohenriquerssilva.cs.aula1;

public class Ex12 {
	public static void main(String[] args){
		int n = 81;
		boolean resultado = ehQuadradoPerfeito(n);
		System.out.println(resultado);
	}
	
	
	private static boolean ehQuadradoPerfeito(int n){
		if(n < 1){
			throw new IllegalArgumentException("É permitido somente números naturais e diferente de zero");
		}
		int i = 1;
		int s = 1;
		while(s < n){
			i = i + 2;
			s = s + i;
		}
		return s == n;
	}
}
