
public class ex10 {
	public static void main(String[] args){
		int x = 2;
		int k = 1;
		int resultado = ObtenhaLogaritmoNatural(x, k);
		System.out.println(resultado);
	}
	
	
	private static int ObtenhaLogaritmoNatural(int x, int k){
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
