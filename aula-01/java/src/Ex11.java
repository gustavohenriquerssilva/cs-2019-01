package com.github.gustavohenriquerssilva.cs.aula1;

public class Ex11 {
	public static void main(String[] args){
		int x = 1;
		int y = 2;
		int k = 3;
		double resultado = obtenhaRazaoAurea(x, y, k);
		System.out.println(resultado);
	}
	
	
	private static double obtenhaRazaoAurea(int x, int y, int k){
		if(x < 0 || x > y || k >= 0){
			throw new IllegalArgumentException("Valor informados estão incorretos");
		}
		double c = y;
		double a = x;
		int i = 1;
		while(i <= k){
			double t = c;
			c = c+ a;
			a = t;
			i++;
		}
		return c/a;
	}
}
