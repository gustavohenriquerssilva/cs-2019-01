package com.github.gustavohenriquerssilva.cs.aula1;

public class Ex1 {

	public static void main(String[] args){
		int valorTestado = -10;
		boolean resultado = EhPropriedade3025(valorTestado);
		System.out.println(resultado);
	}
	
	public static boolean EhPropriedade3025(int valorTestado){
		if(valorTestado > 9999 || valorTestado < 0){
			throw new IllegalArgumentException("Valor inserido não pode ser menor que zero ou maior que 9999");
		}
		int resultDivisao = valorTestado/100;
		int resultResto = valorTestado%100;
		int resultadoFinal = (resultDivisao + resultResto)*(resultDivisao + resultResto);
		return valorTestado == resultadoFinal;
	}
}