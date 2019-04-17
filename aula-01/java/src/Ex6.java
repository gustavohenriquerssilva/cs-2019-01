package com.github.gustavohenriquerssilva.cs.aula1;

public class Ex6 {
	public static void main(String[] args){
		int x = 2;
		int resultado = obtenhaFatorial(x);
		System.out.println(resultado);
	}
	
	public static int obtenhaFatorial(int x){
		if(x < 1){
			throw new IllegalArgumentException("É permitido somente números naturais e diferente de zero");
		}
		int i = 2;
		int f = 1;
		while(i <= x ){
			f = f*i;
			i++;
		}
		return f;
	}
}
