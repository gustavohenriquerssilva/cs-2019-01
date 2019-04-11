import java.math.*;

public class ex2 {
	public static void main(String[] args){
		int valorTestado = 153;
		boolean resultado = EhPropriedade153(valorTestado);
		System.out.println(resultado);
	}
	
	public static boolean EhPropriedade153(int valorTestado){
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
