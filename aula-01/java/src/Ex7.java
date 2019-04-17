package com.github.gustavohenriquerssilva.cs.aula1;

public class Ex7 {
	public static void main(String[] args){
		int x = 2;
		int y = 5;
		int resultado = obtenhaProdutoDeInteirosUsandoSomas(x, y);
		System.out.println(resultado);
	}
	
	
	public static int obtenhaProdutoDeInteirosUsandoSomas(int x, int y){
		if(x < 0 || y < 0){
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
		while(i <= totalParcelas){
			s = s + parcela;
			i++;
		}
		return s;
	}
}