
public class ex11 {
	public static void main(String[] args){
		int x = 1;
		int y = 2;
		int k = 3;
		double resultado = ObtenhaRazaoAurea(x, y, k);
		System.out.println(resultado);
	}
	
	
	private static double ObtenhaRazaoAurea(int x, int y, int k){
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
