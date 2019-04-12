
public class ex16 {
	public static void main(String[] args){
		int a = 81;
		int b = 54;
		int resultado = ObtenhaMDC(a, b);
		System.out.println(resultado);
	}
	
	private static int ObtenhaMDC(int a, int b){
		
		while(b != 0){
			int m = a%b;
			a = b;
			b = m;
		}
		return a;
	}
}
