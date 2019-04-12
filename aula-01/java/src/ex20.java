public class ex20 {
	public static void main(String[] args){
		String CPF = "85398328018";
		int[] digitosCPF = ObtenhaArray(CPF);
		
		boolean resultado = EhCPFValido(digitosCPF);
		System.out.println(resultado);
	}
	
	
	private static boolean EhCPFValido(int[] digitoCPF){
		int j = (digitoCPF[0])+ (2*digitoCPF[1]) + (3*digitoCPF[2]) + (4*digitoCPF[3]) + (5*digitoCPF[4]) + (6*digitoCPF[5]) + (7*digitoCPF[6]) + (8*digitoCPF[7])  + (9*digitoCPF[8]);
		int k = (2*digitoCPF[1]) + (3*digitoCPF[2]) + (4*digitoCPF[3]) + (5*digitoCPF[4]) + (6*digitoCPF[5]) + (7*digitoCPF[6]) + (8*digitoCPF[7])  + (9*digitoCPF[8]) + (10*digitoCPF[9]);
		int dj = ObtenhaResto(ObtenhaResto(j, 11), 10);
		int dk = ObtenhaResto(ObtenhaResto(k, 11), 10);
		return (dj == digitoCPF[9] && dk == digitoCPF[10]);
		
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
		int[] array = new int[11];
		for (int i = 0; i < numeroEmTexto.length(); i++) {
		    array[i] = Character.getNumericValue(numeroEmTexto.charAt(i));
		}
		return array;
	}
}
