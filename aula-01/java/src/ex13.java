public class ex13 {
	public static void main(String[] args){
		int n = 81;
		int i = 10;
		int resultado = ObtenhaRaizQuadrada(n, i);
		System.out.println(resultado);
	}
	
	private static int ObtenhaRaizQuadrada(int n, int i){
		int r = 1;
		while(0 <= i){
			r = (r + (n/r)) / 2;
			i--;
		}
		return r;
	}
}
