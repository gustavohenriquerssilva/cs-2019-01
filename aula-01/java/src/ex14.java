public class ex14 {
	public static void main(String[] args){
		int n = 13;
		boolean resultado = EhNumeroPrimo(n);
		System.out.println(resultado);
	}
	
	private static boolean EhNumeroPrimo(int n){
		int i = 2;
		while(i < n){
			if(n%i == 0){
				return false;
			}
			i++;
		}
		return true;
	}
}
