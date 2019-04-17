package com.github.gustavohenriquerssilva.cs.aula1;

public class Ex3 {
	public static void main(String[] args){
		int dia = 15;
		int mes = 04;
		int ano = 2019;
		
		int resultado = ObtenhaDiaDaSemana(dia, mes, ano);
		System.out.println(resultado);
	}
	
	public static int obtenhaDiaDaSemana(int dia, int mes, int ano ){
		if(dia > 31 || dia < 1){
			throw new IllegalArgumentException("Dia inválido");
		}
		if(mes > 12 || mes < 1){
			throw new IllegalArgumentException("Mês inválido");
		}
		if(ano < 1753){
			throw new IllegalArgumentException("Ano inválido");
		}
		
		if(mes == 1 || mes == 2){
			mes = mes + 12; 
			ano = ano - 1; 
		}
		int x = dia + 1 * mes + (2*(mes + 1)/5) + ano + (ano/4) - (ano/100) + (ano/400);
		return x%7;
	}
	
}
