public class Ex14 {
	public static void main(String[] args){
		int n = 13;
		boolean resultado = ehNumeroPrimo(n);
		System.out.println(resultado);
	}
	
	private static boolean ehNumeroPrimo(int n){
		if(n <= 1){
			throw new IllegalArgumentException("É permitido somente números maiores que um");
		}
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
