public class Ex13 {
	public static void main(String[] args){
		int n = 81;
		int i = 10;
		int resultado = obtenhaRaizQuadrada(n, i);
		System.out.println(resultado);
	}
	
	private static int obtenhaRaizQuadrada(int n, int i){
		if(n < 0){
			throw new IllegalArgumentException("É permitido somente números naturais");
		}
		int r = 1;
		while(0 <= i){
			r = (r + (n/r)) / 2;
			i--;
		}
		return r;
	}
}
