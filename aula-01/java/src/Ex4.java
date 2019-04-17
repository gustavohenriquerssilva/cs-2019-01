package com.github.gustavohenriquerssilva.cs.aula1;

public class Ex4 {
	public static void main(String[] args){
		int x = 5;
		int y = 3;
		int resultado = ObtenhaResto(x, y);
		System.out.println(resultado);
	}
	
	public static int ObtenhaResto(int x, int y){
		if(y < 0 || x <= 0){
			throw new IllegalArgumentException("Valores inválidos");
		}
		int s = x;
		while(y <= s ){
			s = s - y;
		}
		return s;
	}
}