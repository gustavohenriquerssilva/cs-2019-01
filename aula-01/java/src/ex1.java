public class ex1 {

	public static void main(String[] args){
		int valorTestado = 3025;
		boolean resultado = EhPropriedade3025(valorTestado);
		System.out.println(resultado);
	}
	
	public static boolean EhPropriedade3025(int valorTestado){
		int resultDivisao = valorTestado/100;
		int resultResto = valorTestado%100;
		int resultadoFinal = (resultDivisao + resultResto)*(resultDivisao + resultResto);
		return valorTestado == resultadoFinal;
	}
}
