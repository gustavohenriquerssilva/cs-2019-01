package com.github.gustavohenriquerssilva.cs.aula1;

public class Ex8 {
	public static void main(String[] args){
		int x = 0;
		int y = 3;
		int resultado = obtenhaPotenciaUsandoAsSomas(x, y);
		System.out.println(resultado);
	}
	
	
	public static int obtenhaPotenciaUsandoAsSomas(int x, int y){
		if(x < 0 || y < 0){
			throw new IllegalArgumentException("É permitido somente números naturais");
		}
		int potencia = 1;
		int i = 1;
		while(i <= y){
			potencia = obtenhaProdutoDeInteirosUsandoSomas(potencia,  x);
			i++;
		}
		return potencia;
	}
	
	private static int obtenhaProdutoDeInteirosUsandoSomas(int x, int y){
		int totalParcelas = x;
		int parcela = y;
		if(y < x){
			totalParcelas = y;
			parcela = x;
		}
		int i = 1;
		int s = 0;
		while(i <= totalParcelas){
			s = s + parcela;
			i++;
		}
		return s;
	}
}
