package com.github.gustavohenriquerssilva.cs.aula1;

import java.math.*;

public class Ex2 {
	public static void main(String[] args){
		int valorTestado = 153;
		boolean resultado = EhPropriedade153(valorTestado);
		System.out.println(resultado);
	}
	
	public static boolean EhPropriedade153(int valorTestado){
		if(valorTestado > 999 || valorTestado < 100){
			throw new IllegalArgumentException("Valor inserido não pode ser menor que 100 ou maior que 999");
		}
		
		int resultDivisao = valorTestado/100;
		int resultResto = valorTestado%100;
		int resultDivisao2 = resultResto/10;
		int resultResto2 = resultResto%10;
		
		int potencia1 = resultDivisao * resultDivisao * resultDivisao;
		int potencia2 = resultDivisao2 * resultDivisao2 * resultDivisao2;
		int potencia3 = resultResto2 * resultResto2 * resultResto2;
		
		int resultadoFinal = potencia1 + potencia2 + potencia3;
		return valorTestado == resultadoFinal;
	}
}