package com.github.gustavohenriquerssilva.cs.aula1;

public class Ex10 {
	public static void main(String[] args){
		int x = 2;
		int k = 1;
		int resultado = obtenhaLogaritmoNatural(x, k);
		System.out.println(resultado);
	}
	
	
	public static int obtenhaLogaritmoNatural(int x, int k){
		if(x < 1){
			throw new IllegalArgumentException("Numerador deve ser maior que zero");
		}
		if(k < 2){
			throw new IllegalArgumentException("Denominador deve ser maior que um");
		}
		int i = 2;
		int e = 1 + x;
		int numerador = x;
		int denominador = 1;
		while(i <= k){
			numerador = numerador * numerador;
			denominador = denominador * i;
			e = e + (numerador/denominador);
			i++;
		}
		return e;
	}
}
