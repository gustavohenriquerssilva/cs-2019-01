
public class ex12 {
	public static void main(String[] args){
		int n = 81;
		boolean resultado = EhQuadradoPerfeito(n);
		System.out.println(resultado);
	}
	
	
	private static boolean EhQuadradoPerfeito(int n){
		int i = 1;
		int s = 1;
		while(s < n){
			i = i + 2;
			s = s + i;
		}
		return s == n;
	}
}
