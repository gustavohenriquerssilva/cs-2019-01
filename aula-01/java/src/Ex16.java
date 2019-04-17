
public class Ex16 {
	public static void main(String[] args){
		int a = 81;
		int b = 54;
		int resultado = obtenhaMDC(a, b);
		System.out.println(resultado);
	}
	
	private static int obtenhaMDC(int a, int b){
		if(b > a || b <= 0){
			throw new IllegalArgumentException("Valores informados estão incorretos");
		}
		while(b != 0){
			int m = a%b;
			a = b;
			b = m;
		}
		return a;
	}
}
