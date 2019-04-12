
public class ex21 {
	public static void main(String[] args){
		String CPF = "85398328018";
		int[] digitoCPF = ObtenhaArray(CPF);
		
		boolean resultado = EhCPFValido(digitoCPF);
		System.out.println(resultado);
	}
	
	
	private static boolean EhCPFValido(int[] digitoCPF){
		int c = 7;
		int p = digitoCPF[8];
		int s = digitoCPF[8];
		while(1 <= c){
			p = p + digitoCPF[c];
			s = s + p;
			c--;
		}
		int j = ObtenhaResto(ObtenhaResto(s, 11), 10);
		int k = ObtenhaResto(ObtenhaResto(s - p + (9 * digitoCPF[9]), 11), 10);
		return j == digitoCPF[9] && k == digitoCPF[10];		
	}	
	
	private static int ObtenhaResto(int dividendo, int divisor){
		int s = dividendo;
		while(divisor <= s ){
			s = s - divisor;
		}
		return s;
	}
	
	private static int[] ObtenhaArray(String n){
		String numeroEmTexto = n;
		int[] array = new int[numeroEmTexto.length()];
		for (int i = 0; i < numeroEmTexto.length(); i++) {
		    array[i] = Character.getNumericValue(numeroEmTexto.charAt(i));
		}
		return array;
	}
}
