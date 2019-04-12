
public class ex19 {
	public static void main(String[] args){
		int n = 81;
		int resultado = ObtenhaFibonacci(n);
		System.out.println(resultado);
	}
	
	
	private static int ObtenhaFibonacci(int n){
		int a = 0;
		int c = 1;
		if(n == 0 || n == 1){
			return n;
		}
		int i = 2;
		while(i <= n){
			int t = c;
			c = c + a;
			a = t;
			i++;
		}
		return c;
		
	}
}
