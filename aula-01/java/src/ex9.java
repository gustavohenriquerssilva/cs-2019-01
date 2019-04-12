
public class ex9 {
	public static void main(String[] args){
		int x = 2;
		double resultado = ObtenhaValorPi(x);
		System.out.println(resultado);
	}
	
	
	private static double ObtenhaValorPi(int x){
		int i = 1;
		int s = -1;
		int d = -1;
		double p = 0;
		while(i <= x){
			d = d + 2;
			s = -1 * s;
			p = p + ((4 * s)/d);
			i++;
		}
		return p;
	}
}
